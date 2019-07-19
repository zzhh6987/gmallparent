package com.atguigu.realtimegmall.dwlogger.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoggerController {
    //    @GetMapping("test")
//    public String getTest() {
//        System.out.println("1111");
//        return "success";
//    }
    @PostMapping("log")
    public String doLog(@RequestParam("logString")String logString) {
        System.out.println(logString);
        // todo 1.加时间戳
        JSONObject jsonObject = JSON.parseObject(logString);
        //TODO 2.
        return "success";
    }
}
