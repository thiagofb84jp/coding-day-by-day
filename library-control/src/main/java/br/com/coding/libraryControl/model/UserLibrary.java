package br.com.coding.libraryControl.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.coding.libraryControl.enumeration.PersonStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_USER_LIBRARY")
public class UserLibrary {

	private Long id;

	private String name;

	private String numberDocument;

	private LocalDate dateBirth;

	private PersonStatus status;
	
	private Address address;
}