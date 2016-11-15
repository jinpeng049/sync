package com.yixiang.np.model;

/**
 * Created by LiZhengYong on 2016/7/14.
 */
public class Response {

    private Short status;

    private String message;

    public Response() {
    }

    public Response(Short status, String message) {
        this.status = status;
        this.message = message;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
