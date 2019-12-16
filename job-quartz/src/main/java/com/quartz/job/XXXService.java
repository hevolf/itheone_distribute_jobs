package com.quartz.job;

import org.springframework.stereotype.Component;

import java.util.Date;

// 需要spring自动注入 所以需要加注解
@Component
public class XXXService {
    public void business(){
        System.out.println("XXXService业务方法执行...." + ",线程号："+Thread.currentThread().getName());
    }

}