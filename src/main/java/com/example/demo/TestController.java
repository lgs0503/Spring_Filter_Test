package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController

@RequestMapping("/test")
public class TestController {

    @PostMapping
    private Map<String, Object> mapTest(@RequestBody Map<String, Object> map){
        System.out.println("TestController : mapTest --------------------");
        return map;
    }

    @PostMapping("/list")
    private List<Map<String, Object>> listTest(@RequestBody List<Map<String, Object>> list){
        System.out.println("TestController : listTest --------------------");
        return list;
    }

    @PostMapping("/vo")
    private TestVO voTest(@RequestBody TestVO vo){
        System.out.println("TestController : voTest --------------------");
        return vo;
    }
}
