package br.com.cursoudemy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursoudemy.cursomc.domain.Pedido;

/**
 * Esse objeto vai fazer várias buscas de acesso a dados relacionados a classe 'Pedido' 
 *
 */
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	
}