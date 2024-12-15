package com.starktony.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
	->by default spring will not scan the packages outside the base package (util in this case)
	->to scan the outside packages update the  '@SpringBootApplication' annotation as below to explicitly give the packages to scan
 */
@SpringBootApplication(
		scanBasePackages = {"com.starktony.learnspringboot","com.starktony.util"}
)
public class LearnspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnspringbootApplication.class, args);
	}

}
