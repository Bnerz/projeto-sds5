package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity //Anotation JPA
@Table(name = "tb_sales")// especificar o nome da tabela no banco, o nome tem que bater com o que ta no sql
public class Sale {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//
	private Long Id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name = "Seller_id")
	private Seller seller;

	public Sale() {

	}

	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
		Id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

}
