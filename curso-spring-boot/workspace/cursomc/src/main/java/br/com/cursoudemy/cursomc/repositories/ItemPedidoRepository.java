package br.com.cursoudemy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursoudemy.cursomc.domain.ItemPedido;

/**
 * Esse objeto vai fazer várias buscas de acesso a dados relacionados a classe 'Item Pedido' 
 *
 */
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
	
}