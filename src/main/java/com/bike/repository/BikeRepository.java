package com.bike.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bike.Entity.BikeEntity;

public interface BikeRepository extends JpaRepository<BikeEntity,Integer>{
@Query(value="select tax from bike_details where id=?" , nativeQuery=true)


public int getById();
}
