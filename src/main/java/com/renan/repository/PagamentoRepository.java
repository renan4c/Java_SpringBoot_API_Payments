package com.renan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renan.dominio.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
