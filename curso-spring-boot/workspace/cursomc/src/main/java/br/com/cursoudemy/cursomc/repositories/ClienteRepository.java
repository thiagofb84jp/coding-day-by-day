package br.com.cursoudemy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cursoudemy.cursomc.domain.Cliente;

/**
 * Esse objeto vai fazer várias buscas de acesso a dados relacionados a classe 'Cliente'
 *
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	@Transactional(readOnly = true)
	Cliente findByEmail(String email);
}