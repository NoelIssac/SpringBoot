package com.ns.controller;

import com.ns.model.DetailsModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
		System.out.println("herhee111");
		return String.format("Hello %s!", name);
	}

	@PostMapping(path = "sample",
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void HelloWorld(@RequestBody DetailsModel details){
		System.out.println("Inside Posy");
		System.out.println(details.getId());
	}
}
