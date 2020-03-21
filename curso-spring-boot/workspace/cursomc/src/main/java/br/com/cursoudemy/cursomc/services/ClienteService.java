package br.com.cursoudemy.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursoudemy.cursomc.domain.Cliente;
import br.com.cursoudemy.cursomc.exceptions.ObjectNotFoundException;
import br.com.cursoudemy.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente find(Integer id) throws ObjectNotFoundException {
		Optional<Cliente> obj = clienteRepository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " 
									+ id + ", Tipo: " + Cliente.class.getName()));
	}
}