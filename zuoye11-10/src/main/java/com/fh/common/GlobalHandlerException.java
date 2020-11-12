package com.fh.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author czx
 * @create 2020-09-27 11:19
 */
@RestControllerAdvice
public class GlobalHandlerException {

    @ExceptionHandler(AjaxException.class)
    public ServerResponse handlerException(AjaxException e){
        //e.printStackTrace();
        return ServerResponse.loginError();
    }

    @ExceptionHandler(TokenException.class)
    public ServerResponse handlerException(TokenException e){
        //e.printStackTrace();
        return ServerResponse.tokenError(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ServerResponse handlerException(Exception e){
        e.printStackTrace();
        return ServerResponse.error(e.getMessage());
    }

}
