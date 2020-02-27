package com.pragma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pragma.model.Client;
import com.pragma.repo.IClientRepo;

@Controller
public class ClientController {

	@Autowired
	private IClientRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="world") String name, Model model) {
		
		//logica
		Client client = new Client();
		
		client.setDocumentNumber(123456789);
		client.setTypeDoc("Cedula");
		
		repo.save(client);
		
		model.addAttribute("name", name);
		
		return "greeting";
	}
	
}
