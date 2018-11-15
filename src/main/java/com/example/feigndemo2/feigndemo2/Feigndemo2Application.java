package com.example.feigndemo2.feigndemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Feigndemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Feigndemo2Application.class, args);
	}
}
