package com.tech.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tech.service.Studentservice;

@RestController
public class Studentcontroller {

	public Studentcontroller() {
		System.out.println(" inside Studentcontroller constructor");
	}

	@Autowired
	Studentservice studentservice;

	@GetMapping("/hi")
	public String add() {
		return "hi helllllo -9091";

	}

	@PostMapping("/create")
	public List<Student> creat(@RequestBody List<Student> std) {
		return studentservice.Create(std);

	}

	@GetMapping("/getall")
	public List<Student> getall() {
		return studentservice.getall();
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		studentservice.delete(id);
	}

	@GetMapping("/findid/{id}")
	public Student studentFindByID(@PathVariable("id") int id) {
		return studentservice.findStudentById(id);
	}

	@GetMapping("/findname/{name}")
	public List<Student> findbyName(@PathVariable("name") String name) {
		return studentservice.findbyName(name);

	}

	@PostMapping("/createone")
	public Student createone(@RequestBody Student student) {

		return studentservice.createone(student);

	}
}
