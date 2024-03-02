package com.tech.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tech.demo.service.ResultService;

@RestController
//@RequestMapping("/service3")
public class ResultController2 {
	
	@Value("${base_url1}")
	String url1;
	

	@Value("${base_url2}")
	String url2;
	
	@Autowired
	RestTemplate restTemplate;
	
	public ResultController2() {
		System.out.println("Inside ResultController Constructor - 9093");
	}
	
	@GetMapping("/test")
	public String test() {
		return "inside resultController.test() - 9093";
	}
	
	@GetMapping("/testService1")
	public String getData() {
		String url=url1+"/hi";
		System.out.println(url);
		ResponseEntity<String> res= restTemplate.exchange(url, HttpMethod.GET,null,String.class);
		return res.getBody();
		}
	
	@GetMapping("/testService2")
	public String getData1() {
		String url_1=url2+"/test2";
		System.out.println(url_1);
		ResponseEntity<String> res= restTemplate.exchange(url_1, HttpMethod.GET,null,String.class);
		return res.getBody();
		}
	
	@GetMapping("/getAll1")
	public String getAll() {
		String url2= url1+"/getall";
		System.out.println(url2);
		ResponseEntity<String> res=restTemplate.exchange(url2, HttpMethod.GET, null, String.class);
		return res.getBody();
		
	}
	
	@GetMapping("/getaddress1")
	public List getaddress() {
		String url_2=url2+"/getaddress";
		System.out.println(url_2);
		ResponseEntity<List>res=restTemplate.exchange(url_2, HttpMethod.GET, null, List.class);
		return res.getBody();
		
	}
	
	@GetMapping("/getByID/{id}")
	public Student getByID(@PathVariable("id")int id) {
		String url3= url1+ "/findid/" + id;
		System.out.println(url3);
		ResponseEntity<Student>res=restTemplate.exchange(url3, HttpMethod.GET, null,Student.class);
		
		return res.getBody() ;
		
	}
	@GetMapping("/getByName")
	public String findByname(@PathVariable("name")String name) {
		String url4= url1 + "/findname/" + name;
		System.out.println(url4);
		ResponseEntity<String>res= restTemplate.exchange(url4, HttpMethod.GET, null, String.class);
		return res.getBody();
		
	}
	
	@DeleteMapping("/delete/{id}")
	public int deleteById(@PathVariable("id")int id) {
		String url5 =url1 + "/delete/" + id;
		System.out.println(url5);
		ResponseEntity<Void>res=restTemplate.exchange(url5, HttpMethod.DELETE, null, Void.class);
		return res.getStatusCodeValue();
		
	}
	
	@PostMapping("/createone")
	public Student  create(@RequestBody Student student) {
		String url6= url1 + "/createone";
		System.out.println(url6);
		HttpEntity<Student>input=new HttpEntity<>(student);
	ResponseEntity<Student>res	=restTemplate.exchange(url6, HttpMethod.POST,input , Student.class);
		return res.getBody();
		
	}
	
}
