package com.example.song.controller;

import com.example.song.vo.ReqVO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;



@RestController
public class ValidateController {
    @ResponseBody
    @GetMapping("/hello")
    public String validate(@Valid ReqVO reqVO){
        return "hello word !";
    }
}
