package com.rm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rm.service.BookService;

@Controller
public class HomeController {
	@Autowired 
	BookService bookService;

	@RequestMapping("/")
	public String home(){
		bookService.check();
		return "index";
	}
}
