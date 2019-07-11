package com.ecommerce.vinil.repository;

import java.util.List;

import com.ecommerce.vinil.model.Disco;
import com.ecommerce.vinil.model.Genero;

public interface SpotifyRepository {
	
	List<Disco> consultar(Genero genero, Integer limite);

}
