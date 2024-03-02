package com.tech.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.service.AddressService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
//@RequestMapping("/service2")
public class AddressController {

	@Autowired
	AddressService addressService;

	@GetMapping("/test2")
	public String test()
	{
		return "test 2  Complete-9092";
	}

	@PostMapping("/createAddress")
	public List<Address> createAddresses(@RequestBody List<Address> adr) {
		return addressService.createAddress(adr);
	}

	@GetMapping("/getaddress")
	public List<Address> getAddress() {
		return addressService.getAddresses();
	}

	@DeleteMapping("/deleteaddress/{id}")

	public void deleteAddress(@PathVariable("id") int a) {
		addressService.deleteById(a);
	}
	
	
}
