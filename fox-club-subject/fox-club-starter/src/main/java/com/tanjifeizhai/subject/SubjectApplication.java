package com.tanjifeizhai.subject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 * Description: 刷题微服务启动类
 * User: 12569
 * Date: 2024-06-12
 * Time: 11:37
 */

@SpringBootApplication
@ComponentScan("com.tanjifeizhai")
@MapperScan("com.tanjifeizhai.**.mapper")
public class SubjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubjectApplication.class);
    }
}
