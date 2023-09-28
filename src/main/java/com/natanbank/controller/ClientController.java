package com.natanbank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natanbank.model.Client;
import com.natanbank.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/all")
	public List<Client> findAll() {
		return clientService.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody Client client) {
		clientService.save(client);
	}
	
	@PutMapping
	public void update(@RequestBody Client client) {
		clientService.update(client);
	}
	
	@GetMapping("/{id}")
	public Optional<Client> find(@PathVariable("id") Long id ) {
		return clientService.findById(id);
	}
	
	@GetMapping("/{name}")
	public Client find(@PathVariable("name") String name ) {
		return clientService.findByName(name);
	}
	
	
	
}
