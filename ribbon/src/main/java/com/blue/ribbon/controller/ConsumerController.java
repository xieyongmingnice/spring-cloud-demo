package com.blue.ribbon.controller;

import com.blue.ribbon.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author XieYongMing
 * @Date 2019/5/24 15:38
 * @Description
 */
@RestController
public class ConsumerController {

    private static Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    HelloService helloService;

    /**
     * 调用服务提供方的服务demo接口
     * @return 调用结果
     */
    @RequestMapping(value="/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer(){
        long start = System.currentTimeMillis();
        String helloResult = helloService.hello();
        long end = System.currentTimeMillis();
        logger.info("耗时:{}ms",end - start);
        return helloResult;
    }

}
