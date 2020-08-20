package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonDTO;
import com.example.demo.service.IPersonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/person")
@AllArgsConstructor
public class PersonController {
	
	private IPersonService personService;
	
	@PostMapping()
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public PersonDTO create(@Valid @RequestBody PersonDTO personDTO) {
		return personService.create(personDTO);
	}

}