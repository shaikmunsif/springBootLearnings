package com.coadingShuttle.week1.homeWork.IntroductionToSpringBootHomeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootHomeWorkApplication implements CommandLineRunner {

	@Autowired
	CakeBaker cakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootHomeWorkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("---------Week1 Assignment Homework----------");
		System.out.println(cakeBaker.bakeCake());
	}
}
