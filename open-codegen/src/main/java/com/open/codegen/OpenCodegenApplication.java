package com.open.codegen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.open.codegen.mapper")
public class OpenCodegenApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenCodegenApplication.class, args);
	}

}