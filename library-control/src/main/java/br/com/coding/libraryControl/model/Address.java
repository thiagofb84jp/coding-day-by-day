package br.com.coding.libraryControl.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_ADDRESS")
public class Address {
	
	private Long id;
	
	private String addressName;
	
	private String number;
	
	private String district;
	
	private String city;
	
	private String postalCode;
	
	private String state;
	
	private String complement;
	
}