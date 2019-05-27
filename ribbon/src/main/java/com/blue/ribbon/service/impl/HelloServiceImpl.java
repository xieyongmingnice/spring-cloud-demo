package com.blue.ribbon.service.impl;

import com.blue.ribbon.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 描述 ：service实现类
 *
 * @author xieym
 * @date 2019/5/27 16:38
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    /**
     *
     * @return 访问HELLO-ORCAS-SERVICE服务 hello接口的返回值
     */
    @HystrixCommand(fallbackMethod = "helloFallBack")
    @Override
    public String hello() {
        return restTemplate.getForEntity("http://HELLO-ORCAS-SERVICE/hello",String.class).getBody();
    }

    /**
     * hello方法失败
     * @return
     */
    private String helloFallBack(){
        return "error";
    }
}
