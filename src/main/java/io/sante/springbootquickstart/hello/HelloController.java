package io.sante.springbootquickstart.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello to Java Springboot!!!";
	}
	
	@GetMapping("/welcome")
	public String sayWelcome() {
		return "Welcome to Java Springboot!!!";
	}
}
