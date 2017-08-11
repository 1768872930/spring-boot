package com.liyimaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication的注解将@Configuration，@ComponentScan，@EnableAutoConfiguration 用于一个里面
 * @author hand
 * @Data By 2017年7月4日 下午3:18:55
 */
@SpringBootApplication
public class LiyiApplicationTest {
	public static void main(String[] args) {
		/*
		 * 启动方法
		 */
		SpringApplication.run(LiyiApplication.class);
	}
}
