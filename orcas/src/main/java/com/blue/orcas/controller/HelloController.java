package com.blue.orcas.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


/**
 * 描述 ：
 * @author xieym
 * @date 2019/5/27 13:22
 **/
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${hello}")
    private String hello;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/hello")
    public String helloWorld() throws Exception{
        int sleepTime = new Random().nextInt(3000);
        logger.info("sleep time :{}ms",sleepTime);
        Thread.sleep(sleepTime);
        logger.info("hello~ this is {}",client.description());
        return hello;
    }

}
