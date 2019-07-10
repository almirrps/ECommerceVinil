package com.ecommerce.vinil.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "venda")
public class Venda {

    @Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			       name = "UUID",
			       strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "uuid", updatable = false, nullable = false)
	private String uuid;

    @Column(name = "data")
    private Date data;

    @Column(name = "nome_cliente")
    private String nomeCliente;

    @Column(name = "cashback_total", precision = 10, scale = 2)
    private BigDecimal cashbackTotal;

    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<VendaItem> vendaItens;

    public String getUuid() {
        return uuid;
    }

    public void setId(String uuid) {
        this.uuid = uuid;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public BigDecimal getCashbackTotal() {
        return cashbackTotal;
    }

    public void setCashbackTotal(BigDecimal cashbackTotal) {
        this.cashbackTotal = cashbackTotal;
    }

    public List<VendaItem> getVendaItens() {
        return vendaItens;
    }

    public void setVendaItens(List<VendaItem> vendaItens) {
        this.vendaItens = vendaItens;
    }

}
