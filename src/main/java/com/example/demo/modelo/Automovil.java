package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="automovil")

@NamedQueries({@NamedQuery(name = "Automovil.buscarPNNQ", query = "select e from Automovil e where e.anio = :datoAnio"),
	  		   @NamedQuery(name = "Automovil.buscarPNNQ1", query = "select e from Automovil e where e.marca = :datoMarca"), 
	  		   @NamedQuery(name = "Automovil.buscarPNNQ2", query = "select e from Automovil e where e.color = :datoColor"),
	  		   @NamedQuery(name = "Automovil.buscarPNNQ3", query = "select e from Automovil e where e.tipo = :datoTipo"),
	  		   @NamedQuery(name = "Automovil.buscarPNNQ4", query = "select e from Automovil e where e.clasificacion = :datoClasificacion"), 
	  		   @NamedQuery(name = "Automovil.buscarPNNQ5", query = "select e from Automovil e where e.modelo = :datoModelo")})


//@NamedNativeQueries({@NamedNativeQuery(name="Automovil.buscarPNNNQ",query="select * from automovil where auto_modelo=:datoModelo"),
//					 @NamedNativeQuery(name="Automovil.buscarPNNNQ1",query="select * from automovil where auto_tipo=:datoTipo"),
//					 @NamedNativeQuery(name="Automovil.buscarPNNNQ2",query="select * from automovil where auto_clasificacion=:datoClasificacion")})
@NamedNativeQuery(name="Automovil.buscarPNNNQ",query="select * from automovil where auto_modelo=:datoModelo")

public class Automovil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_seq")
	@SequenceGenerator(name = "auto_seq", sequenceName = "auto_seq", allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;
	
	@Column(name = "auto_placa")
	private String placa;
	
	@Column(name = "auto_modelo")
	private String modelo;
	
	@Column(name = "auto_anio")
	private Integer anio;
	
	@Column(name = "auto_marca")
	private String marca;
	
	@Column(name = "auto_color")
	private String color;
	
	@Column(name = "auto_tipo")
	private String tipo; //hibrido, electrico, etc
	
	@Column(name = "auto_clasificacion")
	private String clasificacion;//SUv,Minivan, etc
	
	
	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", modelo=" + modelo + ", anio=" + anio + ", marca=" + marca + ", color="
				+ color + ", tipo=" + tipo + ", clasificacion=" + clasificacion + "]";
	}
	
	//Getters and setters
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	
	
	

}
