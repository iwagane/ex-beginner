package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";
	}

	@RequestMapping("/result")
	public String result(Integer price1, Integer price2, Integer price3) {
		Integer taxExcludedPrice = price1 + price2 + price3;
		Integer taxIncludedPrice = (int) ((price1 + price2 + price3) * 1.1);
		
		application.setAttribute("taxExcludedPrice", String.format("%,d", taxExcludedPrice));
		application.setAttribute("taxIncludedPrice", String.format("%,d", taxIncludedPrice));
		
		return "exam03-result";
	}
}
