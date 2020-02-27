package com.pragma.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pragma.model.Client;

public interface IClientRepo extends JpaRepository<Client, Integer> {

	
	
}
