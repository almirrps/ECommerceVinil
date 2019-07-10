package com.ecommerce.vinil.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "venda_item")
public class VendaItem {
	
    @Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			       name = "UUID",
			       strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "uuid", updatable = false, nullable = false)
	private String uuid;

    @Column(name = "cashback", precision = 10, scale = 2)
    private BigDecimal cashback;

    @ManyToOne(optional = false)
    @JsonIgnoreProperties("vendaItens")
    private Venda venda;

    @ManyToOne(optional = false)
    @JsonIgnoreProperties("vendaItens")
    private Disco disco;

    public String getUuid() {
        return uuid;
    }

    public void setId(String uuid) {
        this.uuid = uuid;
    }

    public BigDecimal getCashback() {
        return cashback;
    }

    public void setCashback(BigDecimal cashback) {
        this.cashback = cashback;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

}
