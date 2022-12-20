package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component
public class PacienteSB {
	private String nombre;
	private String raza;
	private String proceso;
	private String duenio;
	private double peso;
	private int edad; // la edad estara dada por meses.Es decir, si la edad es 1, la mascota tiene un mes de 
	
	protected double valor(String proceso) {
		this.setProceso(proceso);
		return 0;
	}
	//set y get
	protected String getNombre() {
		return nombre;
	}

	
	@Override
	public String toString() {
		valor(this.getProceso());
		return "PacienteHerencia [nombre=" + nombre + ", raza=" + raza + ", proceso=" + proceso + ", duenio=" + duenio
				+ ", peso=" + peso + ", edad=" + edad + "]";
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	

}
