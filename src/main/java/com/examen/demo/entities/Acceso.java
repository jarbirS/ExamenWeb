package com.examen.demo.entities;

import java.sql.Date;

public class Acceso {

	private int id;
	private Registro registro;
	private Date fecharegis;
	private int estado;
	
	public Acceso() {
		
	}
	
	public Acceso(int id, Registro registro, Date fecharegis, int estado) {
		this.id=id;
		this.registro=registro;
		this.fecharegis=fecharegis;
		this.estado=estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	public Date getFecharegis() {
		return fecharegis;
	}

	public void setFecharegis(Date fecharegis) {
		this.fecharegis = fecharegis;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
