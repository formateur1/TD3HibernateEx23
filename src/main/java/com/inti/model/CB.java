package com.inti.model;

import java.time.LocalDate;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "idP")
public class CB extends Paiement {
	
    public int numero;
    public LocalDate dateExpiration;
    
    public CB() {
    }

	public CB(double montant, LocalDate date, int numero, LocalDate dateExpiration) {
		super(montant, date);
		this.numero = numero;
		this.dateExpiration = dateExpiration;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	@Override
	public String toString() {
		return "CB [numero=" + numero + ", dateExpiration=" + dateExpiration + "]";
	}
    
    

}