package br.com.ecommerce.integration.cascostore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CascostoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CascostoreApplication.class, args);
	}

}
