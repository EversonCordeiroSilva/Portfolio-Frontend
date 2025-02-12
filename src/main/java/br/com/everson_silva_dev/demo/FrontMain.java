package br.com.everson_silva_dev.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrontMain {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FrontMain.class);
		app.run();
	}

}
