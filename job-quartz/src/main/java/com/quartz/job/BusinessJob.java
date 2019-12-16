package com.quartz.job;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

// 传入BusinessJob.class类型 所以不用注解
public class BusinessJob implements Job{
    int i = 0;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {

        // JobDetailFactoryBean 封装传过来的，见QuartzConfig类
        // 将参数传入 业务job
        JobDataMap dataMap = context.getJobDetail().getJobDataMap();
        String name = dataMap.get("time").toString();
        business(name);
	}

    //重型任务，1000W数据统计，把任务敲碎 -- E-job
    private void business(String time){
        //
        i++;
        System.out.println("BusinessJob start --- time:"+time+", thread:" + Thread.currentThread().getName() );
    }

}