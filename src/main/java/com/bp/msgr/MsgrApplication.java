package com.bp.msgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
@Configuration
public class MsgrApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgrApplication.class, args);
	}

}
