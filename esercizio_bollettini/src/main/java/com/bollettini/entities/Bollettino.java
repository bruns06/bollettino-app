package com.bollettini.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bollettini")
public class Bollettino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String codiceBollettino;
	private double importo;
	private String causale;
	private String codiceContoDestinatario;
	private String nomePagatore;
	private String codiceCdcPagatore;
}
