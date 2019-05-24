package com.blue.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description 启动类
 * @author XieYongMing
 * @create 2019/5/22 13:52
 **/
@EnableEurekaClient
@SpringBootApplication
public class OrcasApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrcasApplication.class, args);
	}

}
