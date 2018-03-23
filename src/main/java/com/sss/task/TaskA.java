package com.sss.task;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class TaskA {

    SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
//    @Scheduled(cron = "*/3 * * * * ?")
//    public void a() throws Exception{
//        System.out.println(Thread.currentThread().getName()+"-"+format.format(new Date()));
//        System.out.println(Thread.currentThread().getName()+"定时任务-a-开始:"+System.currentTimeMillis());
//        Thread.sleep(5000);
//        System.out.println(Thread.currentThread().getName()+"定时任务-a-结束:"+System.currentTimeMillis());
//    }


//    @Scheduled(cron = "*/3 * * * * ?")
//    public void b() throws Exception{
//        System.out.println(Thread.currentThread().getName()+"-"+format.format(new Date()));
//        System.out.println(Thread.currentThread().getName()+"定时任务-b-开始:"+System.currentTimeMillis());
//        Thread.sleep(5000);
//        System.out.println(Thread.currentThread().getName()+"定时任务-b-结束:"+System.currentTimeMillis());
//    }

/*    @Scheduled(fixedRate = 3000)
    public void d() throws Exception{
        System.out.println(Thread.currentThread().getName()+"-"+format.format(new Date()));
        System.out.println(Thread.currentThread().getName()+"定时任务-d-开始:"+System.currentTimeMillis());
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+"定时任务-d-结束:"+System.currentTimeMillis());
    }

    @Scheduled(fixedDelay = 3000)
    public void c() throws Exception{
        System.out.println(Thread.currentThread().getName()+"-"+format.format(new Date()));
        System.out.println(Thread.currentThread().getName()+"定时任务-c-开始:"+System.currentTimeMillis());
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+"定时任务-c-结束:"+System.currentTimeMillis());
    }

    @Scheduled(fixedDelay = 3000,initialDelay = 1000*10)
    public void e() throws Exception{
        System.out.println(Thread.currentThread().getName()+"-"+format.format(new Date()));
        System.out.println(Thread.currentThread().getName()+"定时任务-e-开始:"+System.currentTimeMillis());
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+"定时任务-e-结束:"+System.currentTimeMillis());
    }*/

//    @Scheduled(cron = "*/6 * * * * ?")
//    public void b(){
//        System.out.println("定时任务-b:"+System.currentTimeMillis());
//    }


//    @Scheduled(cron = "*/6 * * * * ?")
//    public void c(){
//        System.out.println("定时任务-c:"+System.currentTimeMillis());
//    }
}
