package com.example.demo1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cita {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private Veterinario medico;
	private Paciente paciente;
	
	public void agendar(String numer, LocalDateTime fechaCita, String nombreMedico, String cedulaMedico,
			String nombrePaciente, String duenio, String raza, String tipo) {
		this.numero= numer;
		this.fechaCita= fechaCita;
		this.fechaAgenda = LocalDateTime.now();
		Veterinario medico= new Veterinario();
		medico.setCedula(cedulaMedico);
		medico.setNombre(nombreMedico);
		
		this.medico=medico;
		if(tipo.equals("Adulto")){
			Adulto pet = new Adulto();
			
			pet.setTipo("Adulto");
			System.out.println("Mascota adulta");
			
			this.paciente= pet;
			
			
		}else {
				Cachorro poopy = new Cachorro();
				
				poopy.setTipo("Cachorro");
				this.paciente=poopy;
				System.out.println("Mascota beb'e");
			}
			
		this.paciente.setNombre(nombrePaciente);
		this.paciente.setDuenio(duenio);
		this.paciente.setRaza(raza);
		this.guardarCita(this);
		
		
	}
	private void guardarCita(Cita cita) {
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
	public Veterinario getMedico() {
		return medico;
	}
	public void setMedico(Veterinario medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paceinte) {
		this.paciente = paceinte;
	}
	@Override
	public String toString() {
		return "Cita=" + numero + ", fechaCita=" + fechaCita + ", fechaAgendada=" + fechaAgenda + ", medico="
				+ medico + ", paciente=" + paciente + ", getNumero()=" + getNumero() + ", getFechaCita()="
				+ getFechaCita() + ", getFechaAgenda()=" + getFechaAgenda() + ", getMedico()=" + getMedico()
				+ ", getPaciente()=" + getPaciente() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
