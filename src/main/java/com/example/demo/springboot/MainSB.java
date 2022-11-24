package com.example.demo.springboot;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class MainSB implements CommandLineRunner {

		@Autowired
		private AdultoSB grande;
		@Autowired
		private CitaSB cita;
		@Autowired
		private VeterinarioSB vet;
		public static void main(String[] args) {
			SpringApplication.run(MainSB.class, args);
		}
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			System.out.println("Spring Boot");
			System.out.println("Mascota Adulta");
			grande.setNombre("Lupe");
			grande.setPeso(6);
			grande.setDuenio("Reymon");
			grande.setRaza("Caniche");
			grande.setProceso("Peluqueada");
			vet.setCedula("0234563431");
			vet.setNombre("Washington King");
			
			System.out.println(grande);
			cita.agendar("12", LocalDateTime.of(2022, 11,24,8,30), vet, grande);
			
			
		}
	}
		
		
