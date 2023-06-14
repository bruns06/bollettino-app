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
	
	public String getCodiceBollettino() {
		return codiceBollettino;
	}
	public void setCodiceBollettino(String codiceBollettino) {
		this.codiceBollettino = codiceBollettino;
	}
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	public String getCausale() {
		return causale;
	}
	public void setCausale(String causale) {
		this.causale = causale;
	}
	public String getCodiceContoDestinatario() {
		return codiceContoDestinatario;
	}
	public void setCodiceContoDestinatario(String codiceContoDestinatario) {
		this.codiceContoDestinatario = codiceContoDestinatario;
	}
	public String getNomePagatore() {
		return nomePagatore;
	}
	public void setNomePagatore(String nomePagatore) {
		this.nomePagatore = nomePagatore;
	}
	public String getCodiceCdcPagatore() {
		return codiceCdcPagatore;
	}
	public void setCodiceCdcPagatore(String codiceCdcPagatore) {
		this.codiceCdcPagatore = codiceCdcPagatore;
	}
	public int getId() {
		return id;
	}
	
}
