package br.com.cursoudemy.cursomc;

import java.text.SimpleDateFormat;
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
import br.com.cursoudemy.cursomc.domain.ItemPedido;
import br.com.cursoudemy.cursomc.domain.Pagamento;
import br.com.cursoudemy.cursomc.domain.PagamentoComBoleto;
import br.com.cursoudemy.cursomc.domain.PagamentoComCartao;
import br.com.cursoudemy.cursomc.domain.Pedido;
import br.com.cursoudemy.cursomc.domain.Produto;
import br.com.cursoudemy.cursomc.enums.EstadoPagamento;
import br.com.cursoudemy.cursomc.enums.TipoCliente;
import br.com.cursoudemy.cursomc.repositories.CategoriaRepository;
import br.com.cursoudemy.cursomc.repositories.CidadeRepository;
import br.com.cursoudemy.cursomc.repositories.ClienteRepository;
import br.com.cursoudemy.cursomc.repositories.EnderecoRepository;
import br.com.cursoudemy.cursomc.repositories.EstadoRepository;
import br.com.cursoudemy.cursomc.repositories.ItemPedidoRepository;
import br.com.cursoudemy.cursomc.repositories.PagamentoRepository;
import br.com.cursoudemy.cursomc.repositories.PedidoRepository;
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
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private PagamentoRepository pagamentoRepository;

	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat2 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat3 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat4 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat5 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat6 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat7 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());

		Produto p1 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 2000.00);
		Produto p2 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 800.00);
		Produto p3 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 80.00);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
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
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		Pedido ped1 = new Pedido(null, simpleDateFormat.parse("30/03/2020 03:55"), cli1, e1);
		Pedido ped2 = new Pedido(null, simpleDateFormat.parse("30/04/2020 03:55"), cli1, e2);
		
		Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pagto1);
		
		Pagamento pagto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, simpleDateFormat.parse("01/05/2020 03:55"), null);
		ped2.setPagamento(pagto2);
		
		cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));
		
		pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
		pagamentoRepository.saveAll(Arrays.asList(pagto1, pagto2));
		
		ItemPedido itemPedido1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
		ItemPedido itemPedido2 = new ItemPedido(ped1, p3, 0.00, 2, 80.00);
		ItemPedido itemPedido3 = new ItemPedido(ped1, p2, 100.00, 1, 800.00);
		
		ped1.getItens().addAll(Arrays.asList(itemPedido1, itemPedido2));
		ped2.getItens().addAll(Arrays.asList(itemPedido3));
		
		p1.getItens().addAll(Arrays.asList(itemPedido1));
		p2.getItens().addAll(Arrays.asList(itemPedido3));
		p3.getItens().addAll(Arrays.asList(itemPedido2));

		itemPedidoRepository.saveAll(Arrays.asList(itemPedido1, itemPedido2, itemPedido3));
	}

	String genValue(int qtyCharacters) {
		return RandomStringUtils.randomNumeric(qtyCharacters);
	}
}