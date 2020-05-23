package com.huawei.qis.qa.report;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author Administrator
 * @create 2020/5/23
 */
@SpringBootApplication
//@MapperScan(basePackages="com.huawei.qis.qa.report.dao")
@MapperScan("com.huawei.qis.qa.report.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
