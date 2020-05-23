package com.huawei.qis.qa.report.resp;

/**
 * @author Administrator
 * @create 2020/5/23
 */
public class CommonResponse {

    private int Code;

    private String msg;

    private Object data;

    public CommonResponse(){

    }

    public CommonResponse(int code, String msg, Object data) {
        Code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
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
