package br.com.coding.libraryControl.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.coding.libraryControl.enumeration.GenreBooks;
import br.com.coding.libraryControl.enumeration.Language;
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
public class Book {

	private Long id;

	private String title;

	private String subtitle;

	private String publisher;

	private String author;

	private Integer yearPublished;

	private String edition;

	private GenreBooks genre;

	private Language language;
}