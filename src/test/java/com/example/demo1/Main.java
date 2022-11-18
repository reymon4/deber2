package com.example.demo1;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cita cita = new Cita();
		 cita.agendar("1", LocalDateTime.of(2022, 11,1,8,30), "Doctor Washo","0600584531", "Paciente Pelusa", "Alexander Beltran", "Caniche", "Adulto");
	
	}

}
