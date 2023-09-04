package com.java.irctc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.java.irctc.binding.Request;
import com.java.irctc.binding.Responce;
import com.java.irctc.servicei.ServiceImpl;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    
	@Autowired
	private ServiceImpl serviceImpl;
	
	@PostMapping("/book")
	public Responce bookTiket(@RequestBody Request request) {
		
		return serviceImpl.bookTiket(request);
	}
}
