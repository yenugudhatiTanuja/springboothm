package com.example.springboothelloapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloController {
	//@RequestMapping("/hello1")
	@GetMapping("/hello1")
	@ResponseBody
	public String hello1() {
		return "Hello Example";
	}

}
