package com.bike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bike.Entity.BikeEntity;
import com.bike.service.BikeService;

@RestController
public class BikeController {
	@Autowired
	BikeService bs;
	
	
	@PostMapping(value="/post")
	public String postVal(@RequestBody BikeEntity e) {
		return bs.postVal(e);
	}
	
	@PostMapping(path="/postAll")

	public String postAll(@RequestBody List<BikeEntity> b) {
		return bs.postAll(b);
		
	}
	
	@GetMapping(path="/getAll")
	public List<BikeEntity> getAll() {
		return bs.getAll();
	}
	 @PostMapping(path="/getid/{a}") 
	 public int getId(@PathVariable int a) {
		 return bs.getId(a);
	 }
	 
}
