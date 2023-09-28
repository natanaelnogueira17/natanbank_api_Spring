package com.natanbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natanbank.model.Client;
import com.natanbank.repository.ClientRepository;

@Service
public class ClientService  {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client>findAll(){
		return clientRepository.findAll();
	}
	
	public void save(Client client) {
		clientRepository.save(client);
	}
	
	public void update(Client client) {
		clientRepository.save(client);
	}
	
	public Optional<Client> findById(Long id) {
		return clientRepository.findById(id);
	}
	
	public Client findByName(String name) {
		return clientRepository.findByName(name);
	}
}
