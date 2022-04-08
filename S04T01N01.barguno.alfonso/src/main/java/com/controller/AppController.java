package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(name = "nom", required = false, 
								defaultValue = "Unknown") String name) {

		return "Hola, " + name + ", estàs executant una aplicació Maven.";

	}

	@GetMapping("/HelloWorld2/{username}")
	public String saluda2(@PathVariable(name = "username", required = false) String name) {

		return "Hola, " + name + ", estàs executant una aplicació Maven.";
	}
}
