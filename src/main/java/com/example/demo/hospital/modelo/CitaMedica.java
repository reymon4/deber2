package com.example.demo.hospital.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class CitaMedica {
	private String numero;
	private LocalDateTime fechaCita;

	private Medico medico;
	private Paciente paciente;
	private BigDecimal precio;
	
	
	//
	
	@Override
	public String toString() {
		return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", medico=" + medico + ", paciente="
				+ paciente + ", precio=" + precio + "]";
	}
	public String getNumero() {
		return numero;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	

}
