package com.fh.controller;

import com.fh.common.Ignore;
import com.fh.common.ServerResponse;
import com.fh.model.Game;
import com.fh.model.GameParam;
import com.fh.service.GameService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author czx
 * @create 2020-11-10 18:31
 */
@RestController
@RequestMapping("game")
@Api(tags = "用户管理相关接口")
public class GameController {

    @Resource
    private GameService gameService;






    @GetMapping("test")
    @Ignore
    public String test(){
        return "SUCCESS";
    }

    @GetMapping("game")
    public ServerResponse queryList(GameParam gameParam){
        return gameService.queryList(gameParam);
    }




    @PostMapping("game")
    public ServerResponse addGame(Game game){
        gameService.addGame(game);
        return ServerResponse.success();
    }

    @PutMapping("game")
    public ServerResponse updateGame(Game game){
        gameService.updateGame(game);
        return ServerResponse.success();
    }

    @DeleteMapping("game")
    public ServerResponse deleteGame(Integer id){
        gameService.deleteGame(id);
        return ServerResponse.success();
    }

    @RequestMapping("uploadExcel")
    public ServerResponse uploadExcel(MultipartFile file){
        return gameService.uploadExcel(file);
    }

    @RequestMapping("login")
    @Ignore
    public ServerResponse login(String name, String password, HttpServletRequest request){
        if(name.equals("111") && password.equals("111")){
            request.getSession().setAttribute("user","111");
            return ServerResponse.success();
        }else{
            return ServerResponse.error();
        }


    }


}
