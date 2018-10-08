package com.company.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class CompanyGateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyGateApplication.class, args);
	}
}
