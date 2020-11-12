package com.fh.common;

/**
 * @author czx
 * @create 2020-09-27 9:42
 */
public class ServerResponse {

    private Integer code;

    private Object data;
    private String msg;

    public static ServerResponse success(Object data){
        return new ServerResponse(ServerEnum.SUCCESS.getCode(),data,ServerEnum.SUCCESS.getMsg());
    }

    public static ServerResponse success(Object data, String msg){
        return new ServerResponse(ServerEnum.SUCCESS.getCode(),data,msg);
    }

    public static ServerResponse success(){
        return new ServerResponse(ServerEnum.SUCCESS.getCode(),ServerEnum.SUCCESS.getMsg());
    }

    public static ServerResponse error(String msg){
        return new ServerResponse(ServerEnum.ERROR.getCode(),msg);
    }

    public static ServerResponse error(){
        return new ServerResponse(ServerEnum.ERROR.getCode(),ServerEnum.ERROR.getMsg());
    }

    public static ServerResponse loginError(){
        return new ServerResponse(ServerEnum.LOGINERROR.getCode(),ServerEnum.LOGINERROR.getMsg());
    }

    public static ServerResponse tokenError(String message) {
        return new ServerResponse(ServerEnum.TOKENERROR.getCode(),message);
    }
    public ServerResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ServerResponse(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public ServerResponse() {
    }




    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
