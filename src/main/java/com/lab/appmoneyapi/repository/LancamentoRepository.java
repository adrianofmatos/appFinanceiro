package com.lab.appmoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.appmoneyapi.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
