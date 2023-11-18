package com.bike;

import org.junit.Test;

import com.bike.controller.BikeController;

public class TestBike {
	BikeController b = new BikeController();
	@Test
	public void testGet() {
		b.getAll();
	}

}




