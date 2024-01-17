package com.generation.apigamestore.repository;

import com.generation.apigamestore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

    List<Produto> findAllByPrecoGreaterThanEqual(@Param("preco") BigDecimal preco);
}
