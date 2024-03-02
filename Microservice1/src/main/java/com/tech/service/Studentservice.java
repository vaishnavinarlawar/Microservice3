package com.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.Controller.Student;
import com.tech.Dao.StudentDao;

@Service
public class Studentservice {

	public Studentservice() {
		System.out.println("inside service constructor");
	}

	@Autowired
	StudentDao studentdao;

	public List<Student> Create(List<Student> student) {

		return studentdao.saveAll(student);

	}

	public List<Student> getall() {
		return studentdao.findAll();

	}

	public void delete(int s) {
		studentdao.deleteById(s);

	}

	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return studentdao.findById(id).get();
	}

	public List<Student> findbyName(String Name) {
		return studentdao.findByName(Name);

	}

	public Student createone(Student student) {
		return studentdao.save(student);

	}
}
