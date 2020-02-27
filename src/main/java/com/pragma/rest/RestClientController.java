package com.pragma.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pragma.model.Client;
import com.pragma.repo.IClientRepo;

@RestController
@RequestMapping("/client")
public class RestClientController {
	
	@Autowired
	private IClientRepo repo;
	
//	@GetMapping
//	public List<Client> getList(){		
//		return repo.findAll();
//	}
	
	@GetMapping
	public String getList(){		
		return "<h1> Hliiii </h1>";
	}
	
	@PostMapping
	public void insert (Client client) {
		repo.save(client);
	}
}
