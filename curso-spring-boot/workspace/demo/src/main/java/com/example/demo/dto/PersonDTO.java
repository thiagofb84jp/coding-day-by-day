package com.example.demo.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import com.example.demo.enumeration.PersonStatus;
import com.example.demo.model.Person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {

	@Length(min = 10, max = 30)
	@NotEmpty(message = "O campo 'nome' não pode ser vazio.")
	private String name;

	@CPF(message = "CPF inválido.")
	@NotEmpty(message = "O campo 'CPF' não pode ser vazio.")
	private String cpf;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateBirth;

	@NotNull(message = "O campo 'status' não pode estar vazio.")
	private PersonStatus status;

	public PersonDTO(Person person) {
		this.setName(person.getName());
		this.setCpf(person.getCpf());
		this.setDateBirth(person.getDateBirth());
		this.setStatus(person.getStatus());
	}
}