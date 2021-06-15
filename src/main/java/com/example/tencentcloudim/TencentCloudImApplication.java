package com.example.tencentcloudim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ServletComponentScan("com.example")
@SpringBootApplication
public class TencentCloudImApplication {

    public static void main(String[] args) {
        SpringApplication.run(TencentCloudImApplication.class, args);
    }

}
