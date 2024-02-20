package com.skipertech.springbootjap;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(version = "v1",title = "Spring boot JPA +Exception Handling Repository"))
public class SpringbootJapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJapApplication.class, args);
	}

}

