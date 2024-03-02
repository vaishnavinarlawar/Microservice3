package com.tech.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
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

import com.tech.demo.exception.Addrsnotfound;
import com.tech.demo.service.ResultService;

@RestController
//@RequestMapping("/service3")
public class ResultController {
	
	@Value("${base_url1}")
	String url1;
	

	@Value("${base_url2}")
	String url2;
	
	@Autowired
	RestTemplate restTemplate;
	
	//public ResultController() {
	//	System.out.println("Inside ResultController Constructor - 9093");
	//}
	
	@GetMapping("/test1")
	public String test() {
		return "inside resultController.test() - 9093";
	}
	
	@GetMapping("/validate")
	public List<Address>getAddresses(){
		String url = url2 + "/getaddress";
		System.out.println(url);
		ResponseEntity<List<Address>>res=null;
		try {
			
		
		res=restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Address>>() {
		});}catch(Exception e){
			System.out.println("i am catch block"+e.getMessage());
			throw new Addrsnotfound("addrnotfoundException in 9093");
		}
		return res.getBody() ;
		
	}
}
