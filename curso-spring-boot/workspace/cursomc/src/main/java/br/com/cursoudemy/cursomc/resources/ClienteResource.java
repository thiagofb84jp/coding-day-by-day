package br.com.cursoudemy.cursomc.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

import br.com.cursoudemy.cursomc.domain.Cliente;
import br.com.cursoudemy.cursomc.enums.TipoCliente;
import br.com.cursoudemy.cursomc.services.ClienteService;
import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;
	
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id) throws ObjectNotFoundException {
		Cliente obj = clienteService.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Cliente> listar() {
		Cliente cli1 = new Cliente(null, new Faker(new Locale("pt-BR")).name().nameWithMiddle(),
				"user" + genValue(3) + "@email.com", genValue(11), TipoCliente.PESSOAFISICA);

		Cliente cli2 = new Cliente(null, new Faker(new Locale("pt-BR")).name().nameWithMiddle(),
				"user" + genValue(3) + "@email.com", genValue(11), TipoCliente.PESSOAFISICA);
		
		List<Cliente> listaCliente = new ArrayList<>();
		listaCliente.add(cli1);
		listaCliente.add(cli2);
		
		return listaCliente;
	}
	
	private String genValue(int qtyCharacters) {
		return RandomStringUtils.randomNumeric(qtyCharacters);
	}

}