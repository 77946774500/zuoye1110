package com.fh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.filter.FormContentFilter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.fh.mapper")
@Import(FormContentFilter.class)
@EnableSwagger2
public class Zuoye1110Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuoye1110Application.class, args);
    }

}
