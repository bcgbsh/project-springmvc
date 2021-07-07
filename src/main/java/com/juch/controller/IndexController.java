package com.juch.controller;

import com.juch.service.UserServcice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author Chen Jun
 * @Date 2021/7/2 17:10
 * @Description
 * @Since
 */


@Controller
@RequestMapping("/home")
public class IndexController {
    @Autowired
    private UserServcice userServcice;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/getuser")
    @ResponseBody
    public Object getuser(){
        try{
            List result = userServcice.getAll();
            System.out.println(result.size());
            return "success";
        }catch (Exception e){
            e.printStackTrace();
        }

        return "fail";
   }
}

