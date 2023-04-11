package com.example.song.controller;

import com.example.song.vo.ReqVO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;



@RestController
public class ValidateController {
    private static ThreadLocal threadLocal = new ThreadLocal();
    @ResponseBody
    @GetMapping("/hello")
    public String validate(@Valid ReqVO reqVO){
        return "hello word !";
    }

    public static void main(String[] args) {
        threadLocal.set(0);
        System.out.println(threadLocal.get());
    }
}
