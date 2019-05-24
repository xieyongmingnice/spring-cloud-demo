package com.blue.orcas.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @Author XieYongMing
 * @Date 2019/5/22 14:02
 * @Description
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);



    @Value("${hello}")
    private String hello;

    @RequestMapping("/hello")
    public String helloWorld(){
        return hello;
    }

}
