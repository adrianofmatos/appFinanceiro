package com.lab.appmoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.appmoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
