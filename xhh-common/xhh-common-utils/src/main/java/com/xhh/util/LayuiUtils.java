package com.xhh.util;

import java.util.List;

public class LayuiUtils {
    private Integer code; //状态
    private String msg;  //返回信息
    private Integer count; //数据条数
    private List<?> data; //返回数据
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }

    public List<?> getData() {
        return data;
    }
    public void setData(List<?> data) {
        this.data = data;
    }
}
