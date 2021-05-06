package com.yj.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String toIndex(){
        return  "ems/login";
    }
    @GetMapping("/toRegister")
    public String toregister(){
        return  "/ems/regist";
    }
    @GetMapping("/tosave")
    public String toSave(){
        return "/ems/addEmp";
    }
}
