package com.tutorial.spring.aio;

import com.tutorial.spring.aio.ioc.Operations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AioApplication implements ApplicationRunner {

	@Autowired
	Operations operations;

	public static void main(String[] args) {
		 SpringApplication.run(AioApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		operations.calculatorOps();
	}
}
