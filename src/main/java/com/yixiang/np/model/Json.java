package com.yixiang.np.model;

public class Json implements java.io.Serializable {

    private boolean success = false;

    private String msg = "";

    private Object obj = null;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Json{");
        sb.append("success=").append(success);
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", obj=").append(obj);
        sb.append('}');
        return sb.toString();
    }
}
