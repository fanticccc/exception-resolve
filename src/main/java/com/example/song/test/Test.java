package com.example.song.test;

import com.example.song.vo.ReqVO;

public class Test {
    public static void main(String[] args) {
        ReqVO reqVO = new ReqVO();
        reqVO.setName("acca");
        ReqVO reqVO1 = new ReqVO();
        reqVO1.setName("acca");
        System.out.println(reqVO.equals(reqVO1));
        System.out.println(reqVO.hashCode());
        System.out.println(reqVO1.hashCode());
    }

}
