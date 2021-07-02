package com.juch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @Author Chen Jun
 * @Date 2021/7/2 17:10
 * @Description
 * @Since
 */


@Controller
@RequestMapping("/home")
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/")
    public String home(){
        return "index";
    }
}

