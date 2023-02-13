package com.example.demo.modelo;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="examen")
public class Examen {
	
	@Id
	@Column(name="exa_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "exa_sec") //Creo la secuencia a través de una secuencia-> name
	@SequenceGenerator (name= "exa_sec", sequenceName="exa_sec", allocationSize=1) //Secuencia de la PK
	private Integer id;
	
	@Column(name="exa_nota")
	private Double nota;
	
	@Column(name="exa_materia")
	private String materia;
	

	
	
	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Examen [id=" + id + ", nota=" + nota + ", materia=" + materia + "]";
	}

	

	

}
