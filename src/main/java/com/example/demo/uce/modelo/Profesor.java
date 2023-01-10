package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesor")
public class Profesor {
	@Id //Esta anotación es para definir la clave primaria
	@Column (name="profe_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "profe_sec") //Creo la secuencia a través de una secuencia-> name
	@SequenceGenerator (name= "profe_sec", sequenceName="profe_sec", allocationSize =1) //Secuencia de la PK
	private Integer id;
	
	@Column (name="profe_nombre")
	private String nombre;
	
	@Column (name="profe_apellido")
	private String apellido;
	
	@Column (name="profe_genero")
	private String genero;
	
	@Column (name="profe_cedula")
	private String cedula;

	
	
	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero
				+ ", cedula=" + cedula + "]";
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
}
