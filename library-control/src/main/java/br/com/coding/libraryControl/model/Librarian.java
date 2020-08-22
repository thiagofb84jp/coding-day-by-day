package br.com.coding.libraryControl.model;

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
@Table(name = "TB_BOOK")
public class Librarian {
	
	private Long id;
	
	private String name;
	
	private String codeConcilLibrary;
	
	private PersonStatus status;
}