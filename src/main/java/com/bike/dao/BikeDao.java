package com.bike.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bike.Entity.BikeEntity;
import com.bike.repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;

	public String postAll(List<BikeEntity> b) {
		br.saveAll(b);
		return "saved";
	}

	public List<BikeEntity> getAll() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	public int getId(int a) {
		
		return br.getById();
	}
	
	public String postVal(BikeEntity c) {
		br.save(c);
		return "saved";
	}

}
