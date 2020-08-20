package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PersonDTO;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.IPersonService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements IPersonService {

	@Autowired
	PersonRepository personRepository;
	
	public PersonDTO create(PersonDTO personDTO) {
			Person person = new Person();
			person.setName(personDTO.getName());
			person.setCpf(personDTO.getCpf());
			person.setDateBirth(personDTO.getDateBirth());
			person.setStatus(personDTO.getStatus());
			
			return new PersonDTO(personRepository.save(person));
	}

	/*public PersonDTO findOne(Long id) {
		// TODO Auto-generated method stub
		return null
	}

	public List<PersonDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
