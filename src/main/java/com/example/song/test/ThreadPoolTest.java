package com.example.song.test;

import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Slf4j
public class ThreadPoolTest {
    public static void main(String[] args) {
        a();
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++) {
            int n = i ;
            executor.execute(()->{
                log.info("任务执行中。。。"+n);
            });
        }
    }



    
    public static void a(){
        Calendar instance = Calendar.getInstance();
        int i = instance.get(Calendar.YEAR);
        int j = instance.get(Calendar.DAY_OF_MONTH);
        int k = instance.get(Calendar.DATE);
        System.out.println(i+":"+j+":"+k);
    }
}
