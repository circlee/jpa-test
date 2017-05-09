package com.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sample.service.TestService;

@SpringBootApplication
public class JpaTestApplication {
	
	private static final Logger log = LoggerFactory.getLogger(JpaTestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JpaTestApplication.class, args);
	}
	
	

	

	@Bean
	public CommandLineRunner demo(TestService ts) {
		return (args) -> {
			log.info("TEST!!!-------");
			ts.setInitData();
			ts.fetchAllCustomerManager();
			//삭제 
			ts.deleteCustomerManagerByCustomerId(1L);
			ts.fetchAllCustomerManager();
		};
	}
}
