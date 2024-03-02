package com.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.tech.Controller.Address;
import com.tech.Dao.AddressDao;

@Service
public class AddressService {

	@Autowired
	AddressDao addressDao;
	
	
	public List<Address> createAddress(List<Address> adr)
	{
		return addressDao.saveAll(adr);
	}
	
	public List<Address> getAddresses(){
		return addressDao.findAll();
		
	}
	
	public void deleteById( int id) {
		 addressDao.deleteById(id);
	}
}
