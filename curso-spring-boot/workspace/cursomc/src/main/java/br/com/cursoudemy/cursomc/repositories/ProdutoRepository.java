package br.com.cursoudemy.cursomc.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cursoudemy.cursomc.domain.Categoria;
import br.com.cursoudemy.cursomc.domain.Produto;

/**
 * Esse objeto vai fazer várias buscas de acesso a dados relacionados a classe 'Produto' 
 *
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
	/*@Query("SELECT DISTINCT obj "
		 + "FROM Produto obj "
		 + "INNER JOIN obj.categorias cat "
		 + "WHERE obj.nome LIKE %:nome% "
		 + "AND cat IN :categorias")
	Page<Produto> search(@Param("nome") String nome, @Param("categorias") List<Categoria> categorias, Pageable pageRequest);*/
	
	@Transactional(readOnly = true)
	@Query("SELECT DISTINCT obj "
		 + "FROM Produto obj "
		 + "INNER JOIN obj.categorias cat "
		 + "WHERE obj.nome LIKE %:nome% "
		 + "AND cat IN :categorias")
	Page<Produto> findDistinctByNomeContainingAndCategoriasIn(String nome, List<Categoria> categorias, Pageable pageRequest);
}