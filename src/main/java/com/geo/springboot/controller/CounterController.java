package com.geo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geo.springboot.service.CounterService;

@RestController
@RequestMapping("/counter")
public class CounterController {
	
	@Autowired
	private CounterService bookService;

	@GetMapping("/count/{id}")
	public int getCount(@PathVariable String id) {
		return bookService.getCount(id);
	}
	
	@PutMapping("/count/{id}")
	public int setCount(@PathVariable String id) {
		return bookService.addUnit(id);
	}

}
