package com.ecommerce.vinil.repository;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.vinil.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {

	Page<Venda> findByDataGreaterThanEqualAndDataLessThanEqualOrderByDataDesc(Date dataInicial, Date dataFinal, Pageable pageable);

}
