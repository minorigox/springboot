package com.igorminoru.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorminoru.cursomc.domain.Cliente;
import com.igorminoru.cursomc.repositories.ClienteRepository;
import com.igorminoru.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Cliente não encontrado! Id: " + id
					+ ", Tipo: " + Cliente.class.getName()); 
		}
		return obj;
	}

}
