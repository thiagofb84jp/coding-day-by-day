package br.com.cursoudemy.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursoudemy.cursomc.domain.Categoria;
import br.com.cursoudemy.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		
		return obj.orElse(null);
	}
}