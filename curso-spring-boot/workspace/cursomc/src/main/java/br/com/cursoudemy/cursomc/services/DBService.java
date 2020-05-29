package br.com.cursoudemy.cursomc.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service
public class DBService {
	
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


	public void instantiateTestDatabase() throws ParseException {
		Categoria cat1 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat2 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat3 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat4 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat5 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat6 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat7 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());
		Categoria cat8 = new Categoria(null, new Faker(new Locale("pt-BR")).commerce().department());

		Produto p1 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 2000.00);
		Produto p2 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 800.00);
		Produto p3 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 80.00);
		Produto p4 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 70.00);
		Produto p5 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 190.00);
		Produto p6 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 820.00);
		Produto p7 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 880.00);
		Produto p8 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 860.00);
		Produto p9 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 80.11);
		Produto p10 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 22.00);
		Produto p11 = new Produto(null, new Faker(new Locale("pt-BR")).commerce().productName(), 66.00);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2, p4));
		cat3.getProdutos().addAll(Arrays.asList(p5, p6));
		cat4.getProdutos().addAll(Arrays.asList(p1, p2, p3, p7));
		cat5.getProdutos().addAll(Arrays.asList(p8));
		cat6.getProdutos().addAll(Arrays.asList(p9, p10));
		cat7.getProdutos().addAll(Arrays.asList(p11));

		p1.getCategorias().addAll(Arrays.asList(cat1, cat4));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2, cat4));
		p3.getCategorias().addAll(Arrays.asList(cat1, cat4));
		p4.getCategorias().addAll(Arrays.asList(cat2));
		p5.getCategorias().addAll(Arrays.asList(cat3));
		p6.getCategorias().addAll(Arrays.asList(cat3));
		p7.getCategorias().addAll(Arrays.asList(cat4));
		p8.getCategorias().addAll(Arrays.asList(cat5));
		p9.getCategorias().addAll(Arrays.asList(cat6));
		p10.getCategorias().addAll(Arrays.asList(cat6));
		p11.getCategorias().addAll(Arrays.asList(cat7));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));

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
				//"user" + genValue(3) + "@email.com", genValue(11), TipoCliente.PESSOAFISICA);
				"thiagofb84jp@gmail.com", genValue(11), TipoCliente.PESSOAFISICA);
				

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
