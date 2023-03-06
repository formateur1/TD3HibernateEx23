package com.inti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "idP")
public class Paypal extends Paiement {

    public int numero;
    
    public Paypal() {
    }

	public Paypal(double montant, LocalDate date, int numero) {
		super(montant, date);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Paypal [numero=" + numero + "]";
	}
    
    

}