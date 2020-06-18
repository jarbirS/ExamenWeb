package com.examen.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Visitante {

	@Column
	private int id;
	
	@Column
	private String documento;
	
	@Column
	private String nombre;
	
	@Column
	private Date fechanacimiento;
	
	@Column
	private int eps;
	
	@Column
	private String genero;
	
	@Column
	private int empresa;
	
	public Visitante () {
		
	}
	
	public Visitante (int id, String documento, String nombre, Date fechanacimiento, int eps, String genero, int empresa) {
		
		this.id=id;
		this.documento=documento;
		this.nombre=nombre;
		this.fechanacimiento=fechanacimiento;
		this.eps=eps;
		this.genero=genero;
		this.empresa=empresa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public int getEps() {
		return eps;
	}

	public void setEps(int eps) {
		this.eps = eps;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEmpresa() {
		return empresa;
	}

	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}
	
	
	
	
}
