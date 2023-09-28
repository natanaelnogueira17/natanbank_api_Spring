package com.natanbank.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_card")
public class Card {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_card")
	private Long id;
	private String number;
	@Column(name = "limit_card")
	private String limit;
	private String valorFatura;
	private String dataVencimento;
	
	@ManyToOne
	private Client client;
	
	public Card() {
		super();
	}


	public Card(Long id, String number, String limit, String valorFatura, String dataVencimento, Client client) {
		super();
		this.id = id;
		this.number = number;
		this.limit = limit;
		this.valorFatura = valorFatura;
		this.dataVencimento = dataVencimento;
		this.client = client;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getLimit() {
		return limit;
	}


	public void setLimit(String limit) {
		this.limit = limit;
	}


	public String getValorFatura() {
		return valorFatura;
	}


	public void setValorFatura(String valorFatura) {
		this.valorFatura = valorFatura;
	}


	public String getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
