package com.examen.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@Column
	private int id;
	
	@Column
	private int empresa;
	
	@Column
	private String usuario;
	
	@Column
	private String email;
	
	@Column
	private String clave;
	
	@Column
	private int rol;
	
	public int getId() {
		return id;
		
	}
	
	public Usuario() {
		
	}
	
	public Usuario(int id, int empresa, String usuario, String email, String clave, int rol) {
		
		super();
		this.id=id;
		this.empresa=empresa;
		this.usuario=usuario;
		this.email=email;
		this.clave=clave;
		this.rol=rol;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpresa() {
		return empresa;
	}
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}
	
	
}
