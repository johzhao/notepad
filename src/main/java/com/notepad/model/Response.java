package com.notepad.model;

/**
 * @author jzhao
 */
@SuppressWarnings("unused")
public class Response {
    public final static int SUCCESS = 200;

    public final static String MESSAGE_OK = "ok";

    private int code;
    private String msg;
    private Object data;

    public static Response ok() {
        return new Response(SUCCESS, MESSAGE_OK, null);
    }

    public static Response ok(Object data) {
        return new Response(SUCCESS, MESSAGE_OK, data);
    }

    public static Response error(int code, String message) {
        return new Response(code, message, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Response(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
