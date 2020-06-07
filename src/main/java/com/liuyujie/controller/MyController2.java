package com.liuyujie.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springboot-test
 * @description:
 * @author: liuyishou
 * @create: 2020-06-06 00:49
 * 获取配置文件中的配置信息
 *  1、@value("${}")
 *  2、@ConfigurationProperties
 **/
@Controller
@ConfigurationProperties(prefix = "person")
public class MyController2 {
    private String name;
    private String age;
    private String addr;


    @RequestMapping("quick2")
    @ResponseBody
    public String quick() {

        return "name="+name+"age="+age+"addr="+addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
