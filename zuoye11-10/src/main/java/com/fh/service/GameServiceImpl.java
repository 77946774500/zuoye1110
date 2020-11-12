package com.fh.service;

import com.alipay.api.domain.Product;
import com.fh.common.ServerResponse;
import com.fh.mapper.GameMapper;
import com.fh.model.Game;
import com.fh.model.GameParam;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author czx
 * @create 2020-11-10 18:31
 */
@Service
public class GameServiceImpl implements GameService {

    @Resource
    private GameMapper gameMapper;

    @Override
    public ServerResponse queryList(GameParam gameParam) {
        List<Game> list = gameMapper.queryList(gameParam);
        long totalCount = gameMapper.getTotalCount(gameParam);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list",list);
        map.put("totalCount",totalCount);

        return ServerResponse.success(map);
    }

    @Override
    public void addGame(Game game) {

        gameMapper.insert(game);
    }

    @Override
    public void updateGame(Game game) {
        gameMapper.updateById(game);
    }

    @Override
    public void deleteGame(Integer id) {
        gameMapper.deleteById(id);
    }

    @Override
    public ServerResponse uploadExcel(MultipartFile file) {
        try {
            Workbook workbook = WorkbookFactory.create(file.getInputStream());
            //  获得第一个工作表对象
            Sheet sheet  =  workbook.getSheetAt(0);
            Row row = null;
            Cell cell = null;
            List<Game> list = new ArrayList();
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                row = sheet.getRow(i);
                Game game = getGame(row);
                list.add(game);

            }
            gameMapper.addBatch(list);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
            e.printStackTrace();
        } finally {

        }
        return ServerResponse.success();
    }

    private Game getGame(Row row) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Cell cell;
        Game game = new Game();

        cell = row.getCell(0);
        game.setName(cell.getStringCellValue());
        System.out.println(cell.getStringCellValue());

        try {
            cell = row.getCell(1);
            Date date = cell.getDateCellValue();
            game.setBeginDate(date);

            cell = row.getCell(2);
            Date date1 = cell.getDateCellValue();
            game.setEndDate(date1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        cell = row.getCell(3);
        game.setUserName(cell.getStringCellValue());
        cell = row.getCell(4);
        game.setIdCard(cell.getStringCellValue());


        return game;
    }
}
