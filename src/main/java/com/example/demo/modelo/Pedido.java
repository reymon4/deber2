package com.example.demo.modelo;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@Column(name="ped_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ped_sec") //Creo la secuencia a través de una secuencia-> name
	@SequenceGenerator (name= "ped_sec", sequenceName="ped_sec", allocationSize=1) 
	private Integer id;
	
	@Column(name="ped_numero")
	private String numero;

	@ManyToOne(cascade = CascadeType.ALL) //muchos a uno
	@JoinColumn(name="ped_id_cliente") //Nombre de la tabla con la que se va a relacionar
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", numero=" + numero + "]";
	}
	
	
	
	

}
