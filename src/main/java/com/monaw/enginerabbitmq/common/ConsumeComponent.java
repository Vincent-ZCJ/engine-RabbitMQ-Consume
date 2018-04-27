package com.monaw.enginerabbitmq.common;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * create by zcj on 2018/4/25.
 */
@Component
public class ConsumeComponent {

    @RabbitListener(queues="zcj-quene")    //监听器监听指定的Queue
    public void processC(String str) {
        System.out.println("[Receive--:"+ LocalDateTime.now()+"---"+str+"]");
    }
}
