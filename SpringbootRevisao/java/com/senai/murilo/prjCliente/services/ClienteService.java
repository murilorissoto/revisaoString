package com.senai.murilo.prjCliente.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.murilo.prjCliente.entities.Cliente;
import com.senai.murilo.prjCliente.repositories.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public Cliente getClienteById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}

	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
	}

	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}
}
