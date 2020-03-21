package br.com.cursoudemy.cursomc;

import java.util.Arrays;
import java.util.Locale;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.javafaker.Faker;

import br.com.cursoudemy.cursomc.domain.Categoria;
import br.com.cursoudemy.cursomc.domain.Cidade;
import br.com.cursoudemy.cursomc.domain.Cliente;
import br.com.cursoudemy.cursomc.domain.Endereco;
import br.com.cursoudemy.cursomc.domain.Estado;
import br.com.cursoudemy.cursomc.domain.Produto;
import br.com.cursoudemy.cursomc.enums.TipoCliente;
import br.com.cursoudemy.cursomc.repositories.CategoriaRepository;
import br.com.cursoudemy.cursomc.repositories.CidadeRepository;
import br.com.cursoudemy.cursomc.repositories.ClienteRepository;
import br.com.cursoudemy.cursomc.repositories.EnderecoRepository;
import br.com.cursoudemy.cursomc.repositories.EstadoRepository;
import br.com.cursoudemy.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat2 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());

		Produto p1 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 2000.00);
		Produto p2 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 800.00);
		Produto p3 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 80.00);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

		Estado est1 = new Estado(null, new Faker(new Locale("pt-BR")).address().state());
		Estado est2 = new Estado(null, new Faker(new Locale("pt-BR")).address().state());

		Cidade c1 = new Cidade(null, new Faker(new Locale("pt-BR")).address().cityName(), est1);
		Cidade c2 = new Cidade(null, new Faker(new Locale("pt-BR")).address().cityName(), est2);
		Cidade c3 = new Cidade(null, new Faker(new Locale("pt-BR")).address().cityName(), est2);

		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));

		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

		Cliente cli1 = new Cliente(null, new Faker(new Locale("pt-BR")).name().nameWithMiddle(),
				"user" + genValue(3) + "@email.com", genValue(11), TipoCliente.PESSOAFISICA);

		Cliente cli2 = new Cliente(null, new Faker(new Locale("pt-BR")).name().nameWithMiddle(),
				"user" + genValue(3) + "@email.com", genValue(11), TipoCliente.PESSOAFISICA);

		cli1.getTelefones().addAll(Arrays.asList(genValue(8), genValue(9)));
		
		cli2.getTelefones().addAll(Arrays.asList(genValue(8), genValue(9)));

		Endereco e1 = new Endereco(null, new Faker(new Locale("pt-BR")).address().streetName(),
				new Faker(new Locale("pt-BR")).address().streetAddressNumber(), "Res. " + genValue(3) + " Apto. " + genValue(4),
				new Faker(new Locale("pt-BR")).address().cityPrefix(),
				new Faker(new Locale("pt-BR")).address().zipCode(), cli1, c1);

		Endereco e2 = new Endereco(null, new Faker(new Locale("pt-BR")).address().streetName(),
				new Faker(new Locale("pt-BR")).address().streetAddressNumber(), "Res. " + genValue(3) + " Apto. " + genValue(4),
				new Faker(new Locale("pt-BR")).address().cityPrefix(),
				new Faker(new Locale("pt-BR")).address().zipCode(), cli1, c2);

		Endereco e3 = new Endereco(null, new Faker(new Locale("pt-BR")).address().streetName(),
				new Faker(new Locale("pt-BR")).address().streetAddressNumber(), "Res. " + genValue(3) + " Apto. " + genValue(4),
				new Faker(new Locale("pt-BR")).address().cityPrefix(),
				new Faker(new Locale("pt-BR")).address().zipCode(), cli2, c2);

		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		
		cli2.getEnderecos().addAll(Arrays.asList(e1, e2));
		
		cli2.getEnderecos().addAll(Arrays.asList(e2, e3));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		clienteRepository.saveAll(Arrays.asList(cli2));
		
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
	}

	String genValue(int qtyCharacters) {
		return RandomStringUtils.randomNumeric(qtyCharacters);
	}
}