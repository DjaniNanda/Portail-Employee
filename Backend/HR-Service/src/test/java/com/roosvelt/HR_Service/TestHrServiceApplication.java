package com.roosvelt.HR_Service;

import org.springframework.boot.SpringApplication;

public class TestHrServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(HrServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
