package com.example.song.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/*@Data
@NoArgsConstructor
@AllArgsConstructor*/
public class ReqVO {
    //@NotNull(message = "用户名称不能为null")
    private String name;
    private long mobile;
    public ReqVO(){
    }
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime =31;
        int result =1;
        result=prime*result+(name==null?0:name.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ReqVO){
            ReqVO c = (ReqVO)obj;
            return getName() == c.getName();
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public ReqVO(String name) {
        this.name = name;
    }

    public ReqVO(long mobile) {
        this.mobile = mobile;
    }

    public ReqVO(String name, long mobile) {
        this.name = name;
        this.mobile = mobile;
    }
}
