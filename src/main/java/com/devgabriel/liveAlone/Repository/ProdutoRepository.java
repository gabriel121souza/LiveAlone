package com.devgabriel.liveAlone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devgabriel.liveAlone.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>   {

}
