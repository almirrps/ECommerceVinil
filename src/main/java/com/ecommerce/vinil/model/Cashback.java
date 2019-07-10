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
@Table(name = "cashback")
public class Cashback {

    @Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			       name = "UUID",
			       strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "uuid", updatable = false, nullable = false)
	private String uuid;

    @Enumerated(EnumType.STRING)
    @Column(name = "genero")
    private Genero genero;

    @Enumerated(EnumType.STRING)
    @Column(name = "dia_semana")
    private DiaSemana diaSemana;

    @Column(name = "porcetagem", precision = 10, scale = 2)
    private BigDecimal porcetagem;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    public BigDecimal getPorcetagem() {
        return porcetagem;
    }

    public void setPorcetagem(BigDecimal porcetagem) {
        this.porcetagem = porcetagem;
    }

}
