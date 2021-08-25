package com.org.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/* This is the main java file wich will host the entire spring boot project.
 * It starts with the Application Name combining Apllication.java.
 *  e,g DemoApplication.java for this project.
 *  with this annotation  (@SpringBootApplication) it tells the project that this is the main Application.
 *
 *  */

// @PropertySource("classpath:application-${spring.profiles.active}.properties")
// @EnableFeignClients
@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@EnableCaching
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
