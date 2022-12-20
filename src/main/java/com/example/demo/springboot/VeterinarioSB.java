package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component
public class VeterinarioSB {
	private String nombre;
	private String cedula;
	
	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", cedula=" + cedula + ", getNombre()=" + getNombre() + ", getCedula()="
				+ getCedula() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getNombre() {
		return nombre;
		
		//SET Y GET
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	
		
	}
	


