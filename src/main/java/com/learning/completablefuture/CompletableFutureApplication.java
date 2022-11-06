package com.learning.completablefuture;

import com.learning.completablefuture.Controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CompletableFutureApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompletableFutureApplication.class, args);
	}

}
