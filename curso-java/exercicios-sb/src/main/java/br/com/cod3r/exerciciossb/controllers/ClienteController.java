package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

import br.com.cod3r.exerciciossb.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping(path = "qualquer")
	public Cliente obterCliente() {
		return new Cliente(new Faker().number().randomDigitNotZero(), new Faker().name().fullName(), 
								"123.456.789-01");
	}

	@GetMapping(path = "complete")
	public Cliente obterTodosOsDadosDoCliente() {
		return new Cliente(new Faker().number().randomDigitNotZero(), new Faker().name().fullName(), "123.456.789-01",
				new Faker().internet().emailAddress(), new Faker().address().fullAddress());
	}
	
	public Cliente obterClientePorId1(int id) {
		return new Cliente();
	}
}