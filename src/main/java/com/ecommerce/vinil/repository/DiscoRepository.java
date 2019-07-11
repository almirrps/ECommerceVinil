package com.ecommerce.vinil.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.vinil.model.Disco;
import com.ecommerce.vinil.model.Genero;

public interface DiscoRepository extends JpaRepository<Disco, Long> {
	
	Page<Disco> findByGeneroOrderByNomeAlbumAsc(Genero genero, Pageable pageable);

}
