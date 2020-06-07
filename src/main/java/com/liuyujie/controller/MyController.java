package com.liuyujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springboot-test
 * @description:
 * @author: liuyishou
 * @create: 2020-06-06 00:49
 **/
@Controller
public class MyController {

    @RequestMapping("quick")
    @ResponseBody
    public String quick() {
       return "aaaa";
    }

}
