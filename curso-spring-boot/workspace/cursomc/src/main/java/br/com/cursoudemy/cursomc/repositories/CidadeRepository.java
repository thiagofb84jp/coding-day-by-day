package br.com.cursoudemy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursoudemy.cursomc.domain.Cidade;

/**
 * Esse objeto vai fazer várias buscas de acesso a dados relacionados a classe 'Cidade' 
 *
 */
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
	
}