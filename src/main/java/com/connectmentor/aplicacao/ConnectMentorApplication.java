package com.connectmentor.aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
=======
import org.springframework.context.annotation.ComponentScan;

import com.connectmentor.aplicacao.controller.MentorController;
import com.connectmentor.aplicacao.service.MentorService;

@SpringBootApplication
@ComponentScan(basePackageClasses = {MentorController.class, MentorService.class})
>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
public class ConnectMentorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectMentorApplication.class, args);
<<<<<<< HEAD
	
=======
>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	}

}
