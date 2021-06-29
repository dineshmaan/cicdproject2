package com.cicdproject2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Bookzy {
@GetMapping ("/Bookzy")
	public String Bookzy() {
return "Welcome to Bookzy Online book store"; 
	}
}
