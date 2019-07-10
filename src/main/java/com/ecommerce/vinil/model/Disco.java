package com.ecommerce.vinil.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "disco")
public class Disco {
	
    @Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			       name = "UUID",
			       strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "uuid", updatable = false, nullable = false)
	private String uuid;
    
    @Column(name = "nome_album")
    private String nomeAlbum;

    @Enumerated(EnumType.STRING)
    @Column(name = "genero")
    private Genero genero;

    @Column(name = "preco", precision = 10, scale = 2)
    private BigDecimal preco;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

}
