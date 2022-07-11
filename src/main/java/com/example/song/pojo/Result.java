package com.example.song.pojo;

import lombok.Data;
import lombok.Getter;

@Getter
public enum Result {

    SUCCESS("0000","成功"),
    VALIDATE_FAIL("0001","参数校验失败")    ;


    private String code;
    private String msg;

    private Result(String code,String msg){
        this.code=code;
        this.msg =msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }



}
