package com.liyimaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;

/**
 * 
 * @SpringBootApplication的注解将@Configuration，
 * @ComponentScan， @EnableAutoConfiguration 用于一个里面
 * @author hand
 * @Data By 2017年7月4日 下午3:18:55
 */
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@EntityScan("com.lance.entity.*")
@EnableCaching // 开启缓存
/*druid监控页面
 */
@ServletComponentScan
@EnableConfigurationProperties(DataSourceProperties.class)
public class LiyiApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		/*
		 * 启动方法
		 */
		SpringApplication.run(LiyiApplication.class);
	}
}
//@PropertySource("classpath:/application.properties") // 1.5以后的版本将在这获取配置信息