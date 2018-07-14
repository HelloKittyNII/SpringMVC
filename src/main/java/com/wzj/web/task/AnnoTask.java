package com.wzj.web.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 通过注册配置定时任务
 * @author wzj
 * @create 2018-07-14 17:12
 **/
@Component
public class AnnoTask
{
    /**
     * 每5秒执行一次
     */
    @Scheduled(cron="0/5 * * * * ? ")
    public void monitor()
    {
       // System.out.println("annotation config task " + new Date());
    }
}
