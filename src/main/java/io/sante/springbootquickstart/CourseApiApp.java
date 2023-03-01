package io.sante.springbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//System.setProperty("server.port","8090");
		SpringApplication.run(CourseApiApp.class, args);

		
	}

}
