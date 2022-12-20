package com.example.demo.herencia;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CitaHerencia {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private VeterinarioHerencia medico;
	private PacienteHerencia paciente;
	
	public void agendar(String numer, LocalDateTime fechaCita, VeterinarioHerencia nombreMedico, PacienteHerencia ph) {
			this.numero= numer;
	this.fechaCita= fechaCita;
	this.fechaAgenda = LocalDateTime.now();
	
	this.medico =nombreMedico;
	double valor = ph.valor(ph.getProceso());
	System.out.println(valor);
	this.guardarCita(this);
		
		
	}
	private void guardarCita(CitaHerencia cita) {
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
	public VeterinarioHerencia getMedico() {
		return medico;
	}
	public void setMedico(VeterinarioHerencia medico) {
		this.medico = medico;
	}
	public PacienteHerencia getPaciente() {
		return paciente;
	}
	public void setPaciente(PacienteHerencia paceinte) {
		this.paciente = paceinte;
	}
	@Override
	public String toString() {
		return "CitaHerencia [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + "]";
	}

	
	
	

}
