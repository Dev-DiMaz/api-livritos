package com.dmazui.api_livritos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/home")
public class HomeController {

	@GetMapping
	public String inicial () {
		return "{\"api-livritos\": \"on line\", \"dev\": \"Diogo MS\"}";		
	}
}

