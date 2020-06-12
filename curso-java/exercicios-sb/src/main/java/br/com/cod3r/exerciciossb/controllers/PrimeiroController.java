package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	// @RequestMapping(method = RequestMethod.GET, path = "/hello")
	@GetMapping(path = { "/hello", "/cheers" })
	public String helloWorld() {
		return "Hello World for Spring Boot Framework! It works!";
	}
	
	@PostMapping(path = "/cheers")
	public String cheers() {
		return "Hello World for Spring Boot Framework! It works!";
	}
}