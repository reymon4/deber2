package com.example.demo.modelo;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="alumno")
public class Alumno {
	

@Id
@Column(name="alu_id")
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "alu_sec") //Creo la secuencia a través de una secuencia-> name
@SequenceGenerator (name= "alu_sec", sequenceName="alu_sec", allocationSize =1) //Secuencia de la PK
private Integer id;

@Column(name="alu_nombre")
private String nombre;


@Column(name="alu_apellido")
private String apellido;

@Column(name="alu_curso")
private String curso;


//Relación 1 a 1

@OneToOne(mappedBy = "alumno", cascade = CascadeType.ALL) //Cascade define que operación realizar en cascada
//@OneToOne(mappedBy = "ciudadano")
private Examen examen;




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


public String getCurso() {
	return curso;
}

public void setCurso(String curso) {
	this.curso = curso;
}

public Examen getExamen() {
	return examen;
}

public void setExamen(Examen examen) {
	this.examen = examen;
}





}
