package com.pragma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	private int numeroDoc;
	
	@Column(name = "TipoDocumento", length = 50)
	private String tipoDoc;
	
	@Column(name = "Nombres", length = 50)
	private String nombres;
	
	@Column(name = "Apellidos", length = 50)
	private String apellidos;
	
	@Column(name = "Edad", length = 50)
	private int edad;
	
	@Column(name = "CiudadNacimiento", length = 50)
	private String ciudadNacimiento;
	
	
	public int getNumeroDoc() {
		return numeroDoc;
	}
	public void setNumeroDoc(int numeroDoc) {
		this.numeroDoc = numeroDoc;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}
	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}
	
	
	
	
}
