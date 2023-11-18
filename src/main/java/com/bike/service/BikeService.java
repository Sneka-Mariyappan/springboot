package com.bike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bike.Entity.BikeEntity;
import com.bike.dao.BikeDao;

@Service
public class BikeService {
	@Autowired
	BikeDao bd;



	public String postAll(List<BikeEntity> b) {
		// TODO Auto-generated method stub
		return bd.postAll(b);
	}



	public List<BikeEntity> getAll() {
		// TODO Auto-generated method stub
		return bd.getAll();
	}



	public int getId(int a) {
		
		return bd.getId(a);
	}

}
