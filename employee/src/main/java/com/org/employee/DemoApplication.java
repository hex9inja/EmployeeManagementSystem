package com.org.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* This is the main java file wich will host the entire spring boot project.
 * It starts with the Application Name combining Apllication.java.
 *  e,g DemoApplication.java for this project.
 *  with this annotation  (@SpringBootApplication) it tells the project that this is the main Application.
 *
 *  */

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
