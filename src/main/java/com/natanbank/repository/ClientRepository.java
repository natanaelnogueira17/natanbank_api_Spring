package com.natanbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natanbank.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	public Client findByName(String name);
}
