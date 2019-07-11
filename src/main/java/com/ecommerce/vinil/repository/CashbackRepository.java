package com.ecommerce.vinil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.vinil.model.Cashback;
import com.ecommerce.vinil.model.DiaSemana;
import com.ecommerce.vinil.model.Genero;

public interface CashbackRepository extends JpaRepository<Cashback, Long> {

	Cashback findByGeneroAndDiaSemana(Genero genero, DiaSemana diaSemana);
	
}
