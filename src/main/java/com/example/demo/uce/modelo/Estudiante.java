package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//Para la representación en la BD
@Entity
@Table(name = "estudiante")
public class Estudiante {
	
	//Mapeamos la columnas de la tabla como atributos.
	//Con las clases, no con los primitivos.
	
	@Id //Esta anotación es para definir la clave primaria
	@Column (name="estu_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "estu_sec") //Creo la secuencia a través de una secuencia-> name
	@SequenceGenerator (name= "estu_sec", sequenceName="estu_sec", allocationSize =1) //Secuencia de la PK
	private Integer id;
	
	@Column (name="estu_nombre")
	private String nombre;
	
	@Column (name="estu_apellido")
	private String apellido;
	
	@Column (name="estu_genero")
	private String genero;
	
	@Column (name="estu_cedula")
	private String cedula;
	
	@Column (name="estu_ciudad")
	private String ciudad;
	
	@Column (name="estu_pais")
	private String pais;
	
	@Column (name="estu_hobby")
	private String hobby;
	
	@Column (name="estu_salario")
	private BigDecimal salario;
	
	@Column (name="estu_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	
	//Getters and Setters

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero
				+ ", cedula=" + cedula + ", ciudad=" + ciudad + "]";
	}

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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
