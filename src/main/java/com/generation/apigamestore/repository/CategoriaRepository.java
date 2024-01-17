package com.generation.apigamestore.repository;

import com.generation.apigamestore.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    List<Categoria> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

    List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}
