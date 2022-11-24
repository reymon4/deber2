package com.example.demo.springboot;


import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service
public class CitaSB {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private VeterinarioSB medico;
	private PacienteSB paciente;
	
	public void agendar(String numer, LocalDateTime fechaCita, VeterinarioSB nombreMedico, PacienteSB ph) {
			this.numero= numer;
	this.fechaCita= fechaCita;
	this.fechaAgenda = LocalDateTime.now();
	
	this.medico =nombreMedico;
	double valor = ph.valor(ph.getProceso());
	System.out.println(valor);
	this.guardarCita(this);
		
		
	}
	private void guardarCita(CitaSB cita) {
		//Aquí vamos a insertar en la BD
		System.out.println(cita);
	}
	//SET Y GET
	public String getNumero() {
		return numero;
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
	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}
	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}
	public VeterinarioSB getMedico() {
		return medico;
	}
	public void setMedico(VeterinarioSB medico) {
		this.medico = medico;
	}
	public PacienteSB getPaciente() {
		return paciente;
	}
	public void setPaciente(PacienteSB paceinte) {
		this.paciente = paceinte;
	}
	@Override
	public String toString() {
		return "CitaHerencia [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + "]";
	}

	
	
	

}
