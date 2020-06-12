package br.com.cod3r.exerciciossb.models;

public class Cliente {

	private int id;

	private String nome;

	private String numeroDocumento;

	private String email;

	private String endereco;

	public Cliente() {
		
	}
	
	public Cliente(int id, String nome, String numeroDocumento) {
		super();
		this.id = id;
		this.nome = nome;
		this.numeroDocumento = numeroDocumento;
	}

	public Cliente(int id, String nome, String numeroDocumento, String email, String endereco) {
		this.id = id;
		this.nome = nome;
		this.numeroDocumento = numeroDocumento;
		this.email = email;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
