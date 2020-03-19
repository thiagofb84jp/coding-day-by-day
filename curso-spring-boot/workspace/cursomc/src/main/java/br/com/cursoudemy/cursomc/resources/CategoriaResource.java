package br.com.cursoudemy.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

import br.com.cursoudemy.cursomc.domain.Categoria;
import br.com.cursoudemy.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;
	
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = categoriaService.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1, new Faker().company().name());
		Categoria cat2 = new Categoria(2, new Faker().company().name());
		
		List<Categoria> listaCategoria = new ArrayList<>();
		listaCategoria.add(cat1);
		listaCategoria.add(cat2);
		
		return listaCategoria;
	}
}