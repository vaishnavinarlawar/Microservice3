package com.tech.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.demo.dao.ResultDao;
import com.tech.demo.dto.Result;


@Service
public class ResultService {
	
	@Autowired
	ResultDao resultDao;
	
	public ResultService() {
		System.out.println("inside ResultService Constructor 9093");
	}
	
	public List<Result> CreateResult(List<Result> result) {
		return resultDao.saveAll(result);
	}
	
	public List<Result> getAllResult() {
		return resultDao.findAll();
	}
	
	public void deleteResult(int id) {
		resultDao.deleteById(id);
	}
}
