package com.fh.interceptor;

import com.fh.common.AjaxException;
import com.fh.common.Ignore;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author czx
 * @create 2020-11-03 10:49
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*HandlerMethod handlerMethod = (HandlerMethod) handler;
        Ignore methodAnnotation = handlerMethod.getMethodAnnotation(Ignore.class);
        if(methodAnnotation != null){
            return true;
        }

        String user = (String) request.getSession().getAttribute("user");
        if(StringUtils.isNotBlank(user)){
            return true;
        }else{
            throw new AjaxException();
        }*/

        return true;

    }
}
