package com.lab.appmoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.appmoneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
