package br.com.cursoudemy.cursomc.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.cursoudemy.cursomc.domain.Cliente;
import br.com.cursoudemy.cursomc.dto.ClienteDTO;
import br.com.cursoudemy.cursomc.dto.ClienteNewDTO;
import br.com.cursoudemy.cursomc.services.ClienteService;
import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;
	
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody ClienteNewDTO objDTO) {
		 Cliente obj = clienteService.fromDTO(objDTO);
		 obj = clienteService.insert(obj);
		 URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		 
		 return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id) throws ObjectNotFoundException {
		Cliente obj = clienteService.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody ClienteDTO objDTO, @PathVariable Integer id){
		Cliente obj = clienteService.fromDTO(objDTO);
		obj.setId(id);
		obj = clienteService.update(obj);
		
		return ResponseEntity.noContent().build(); 
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Cliente> delete(@PathVariable Integer id) {
		clienteService.delete(id);
		
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ClienteDTO>> findAll() {
		List<Cliente> list = clienteService.findAll();
		List<ClienteDTO> listDTO = list.stream().map(obj -> new ClienteDTO(obj)).collect(Collectors.toList()); 
		return ResponseEntity.ok().body(listDTO);
	}

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ResponseEntity<Page<ClienteDTO>> findPage(
											  @RequestParam(value = "page", defaultValue = "0") Integer page,
											  @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
											  @RequestParam(value = "orderBy", defaultValue = "nome") String orderBy,
											  @RequestParam(value = "direction", defaultValue = "ASC") String direction){
		Page<Cliente> list = clienteService.findPage(page, linesPerPage, orderBy, direction);
		Page<ClienteDTO> listDTO = list.map(obj -> new ClienteDTO(obj)); 
		return ResponseEntity.ok().body(listDTO);
	}
	
	/*@RequestMapping(method = RequestMethod.GET)
	public List<Cliente> listar() {
		Cliente cli1 = new Cliente(null, new Faker(new Locale("pt-BR")).name().nameWithMiddle(),
				"user" + genValue(3) + "@email.com", genValue(11), TipoCliente.PESSOAFISICA);

		Cliente cli2 = new Cliente(null, new Faker(new Locale("pt-BR")).name().nameWithMiddle(),
				"user" + genValue(3) + "@email.com", genValue(11), TipoCliente.PESSOAFISICA);
		
		List<Cliente> listaCliente = new ArrayList<>();
		listaCliente.add(cli1);
		listaCliente.add(cli2);
		
		return listaCliente;
	}*/
	
	/*private String genValue(int qtyCharacters) {
		return RandomStringUtils.randomNumeric(qtyCharacters);
	}*/

}