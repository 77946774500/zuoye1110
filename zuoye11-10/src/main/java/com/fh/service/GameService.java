package com.fh.service;

import com.fh.common.ServerResponse;
import com.fh.model.Game;
import com.fh.model.GameParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author czx
 * @create 2020-11-10 18:31
 */
public interface GameService {
    ServerResponse queryList(GameParam gameParam);

    void addGame(Game game);

    void updateGame(Game game);

    void deleteGame(Integer id);

    ServerResponse uploadExcel(MultipartFile file);
}
