package com.yixiang.np.model.vo;

/**
 * Created by wangwei on 2016/10/27.
 * 两个字段对应   map ---> key ,value
 */
public class MapVo {
    private String needKey;
    private Integer needValue;

    public Integer getNeedValue() {
        return needValue;
    }

    public void setNeedValue(Integer needValue) {
        this.needValue = needValue;
    }

    public String getNeedKey() {

        return needKey;
    }

    public void setNeedKey(String needKey) {
        this.needKey = needKey;
    }
}
