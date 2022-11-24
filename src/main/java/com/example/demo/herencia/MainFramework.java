package com.example.demo.herencia;
import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PacienteHerencia grande = new AdultoHerencia();
	grande.setNombre("Lupe");
	grande.setPeso(6);
	grande.setDuenio("Reymon");
	grande.setRaza("Caniche");
	grande.setProceso("Peluqueada");
	VeterinarioHerencia vet = new VeterinarioHerencia();
	vet.setCedula("0234563431");
	vet.setNombre("Washington King");
	
	CitaHerencia cita = new CitaHerencia();
	cita.agendar("12", LocalDateTime.of(2022, 11,24,8,30), vet, grande);
	}

}
