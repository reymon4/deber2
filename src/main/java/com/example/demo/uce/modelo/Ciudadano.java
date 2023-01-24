package com.example.demo.uce.modelo;

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
@Table (name= "ciudadano")
public class Ciudadano {

@Id
@Column(name="ciu_id")
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ciu_sec") //Creo la secuencia a través de una secuencia-> name
@SequenceGenerator (name= "ciu_sec", sequenceName="ciu_sec", allocationSize =1) //Secuencia de la PK
private Integer id;

@Column(name="ciu_nombre")
private String nombre;


@Column(name="ciu_apellido")
private String apellido;

//Relación 1 a 1

@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL) //Cascade define que operación realizar en cascada
//@OneToOne(mappedBy = "ciudadano")
private Empleado empleado;


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

public Empleado getEmpleado() {
	return empleado;
}

public void setEmpleado(Empleado empleado) {
	this.empleado = empleado;
}




}
