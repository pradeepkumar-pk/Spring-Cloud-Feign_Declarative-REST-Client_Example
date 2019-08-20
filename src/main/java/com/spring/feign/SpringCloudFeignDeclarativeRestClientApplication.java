package com.spring.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringCloudFeignDeclarativeRestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignDeclarativeRestClientApplication.class, args);
	}

}
