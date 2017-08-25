package com.liyimaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;

/**
 * @SpringBootApplication的注解将@Configuration，@ComponentScan，@EnableAutoConfiguration 用于一个里面
 * @author hand
 * @Data By 2017年7月4日 下午3:18:55
 */
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@EntityScan("com.lance.entity.*") 
public class LiyiApplication {
	public static void main(String[] args) {
		/*
		 * 启动方法
		 */
		SpringApplication.run(LiyiApplication.class);
	}
}
