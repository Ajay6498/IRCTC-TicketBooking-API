package com.java.irctc.servicei;

import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.java.irctc.binding.Request;
import com.java.irctc.binding.Responce;

 
@Service
public class ServiceImpl {

	public Responce bookTiket(@RequestBody Request request) {
		
		Responce responce=new Responce();
		Random rand = new Random();
        int rand_int1 = rand.nextInt(100);   // Generate random integers in range 0 to 99
		responce.setStatus("Conform");
		responce.setSeatno(rand_int1);
		BeanUtils.copyProperties(request, responce);
		System.out.println(responce);
		return responce;
	}
	
}
