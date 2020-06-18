package com.examen.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accesovisitante")
public class AccesoVisitante implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private int temperatura;
	private Visitante visitante;
	
	public AccesoVisitante() {
		
	}
	
	
	public AccesoVisitante(int id, int temperatura, Visitante visitante) {
		super();
		this.id = id;
		this.temperatura = temperatura;
		this.visitante = visitante;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getTeperatura() {
		return temperatura;
	}


	public void setTemperatura(int teperatura) {
		this.temperatura = teperatura;
	}


	public Visitante getVisitante() {
		return visitante;
	}


	
}
