package com.example.song;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
// git test commit and push
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class SongApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(SongApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Spring  Boot start  success ~");
    }
}
