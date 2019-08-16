package com.imooc.springboot_mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * exclude= {DataSourceAutoConfiguration.class} 2.0以后需要加上这一段代码，不让项目一加载就去找默认数据库H2需要的配置
 * 等整合到mybatis时，需要用到数据库相关的配置时，再把该段代码去掉
 */

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}
