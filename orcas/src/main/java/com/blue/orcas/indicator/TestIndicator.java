package com.blue.orcas.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @Author XieYongMing
 * @Date 2019/5/22 17:00
 * @Description 用于测试的服务健康状态监控器
 */
@Component
public class TestIndicator implements HealthIndicator {
    @Override
    public Health health() {
        int errorCode = check();
        if (errorCode != 0){
            return Health.down().withDetail("Error Code:",errorCode).build();
        }
        return Health.up().build();
    }

    /**
     * 具体的检查方法
     * @return
     */
    private int check(){
        // 检查逻辑
        return 0;
    }
}
