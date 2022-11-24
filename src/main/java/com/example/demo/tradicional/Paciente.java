package com.example.demo.tradicional;

public class Paciente {
	private String nombre;
	private String raza;
	private String tipo;
	private String proceso;
	private String duenio;
	
	
	
	//set y get
	protected String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", raza=" + raza + ", tipo=" + tipo + ", proceso=" + proceso + ", duenio="
				+ duenio + ", getNombre()=" + getNombre() + ", getCedula()=" + getCedula() + ", getTipo()=" + getTipo()
				+ ", getProceso()=" + getProceso() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getCedula() {
		return raza;
	}
	protected void setCedula(String cedula) {
		this.raza = cedula;
	}
	protected String getTipo() {
		return tipo;
	}
	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getProceso() {
		return proceso;
	}
	public void setProceso(String proceso) {
		this.proceso = proceso;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getDuenio() {
		return duenio;
	}
	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}
	

}
