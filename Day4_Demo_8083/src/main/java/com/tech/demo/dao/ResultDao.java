package com.tech.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.demo.dto.Result;


@Repository
public interface ResultDao extends JpaRepository<Result, Integer>{
	

	
}
