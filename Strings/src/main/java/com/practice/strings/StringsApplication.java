package com.practice.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/")
	public String strings() {
		return "Hello Human! Welcome to this digital testing ground! Please add: string1 or string2; to the route url( / put infront ) to load a different page!";
	}
	
	@RequestMapping("/string1")
	public String string1() {
		return "Hey you stuck around! So this is '/string1'. It's pretty cool that you can just teleport from one page to another!";
	}
	
	@RequestMapping("/string2")
	public String string2() {
		return "Hey it's you again! This is '/string2'. So I don't have much here but I could at least share an interesting fact about something! Here it is: The First Known Computer Programmer was a Woman (mid-1800), her name was Ada Lovelace.";
	}
}
