package com.oa.pojo;

import org.springframework.context.annotation.Bean;

/**
 * Created by Will on 2017/9/20.
 */

public class MessageResult {
    private int code;
    private String msg;
    private Object data;

    public MessageResult() {
    }

    public MessageResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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
}
