package com.gretskiy.kuda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class KudaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KudaApplication.class, args);
	}

}
