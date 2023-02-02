package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@SpringBootApplication
public class ProyectoPaU3RhApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;



	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3RhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setApellido("Hidalgo");
		estudiante1.setNombre("Reymon");
		estudiante1.setCedula("1720371333");
		estudiante1.setCiudad("Quito");
		estudiante1.setGenero("M");
		//this.estudianteService.insertar(estudiante1);
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Beltran");
		estudiante2.setNombre("Alexander");
		estudiante2.setCedula("1720371331");
		estudiante2.setCiudad("Quito");
		estudiante2.setGenero("M");
		//this.estudianteService.insertar(estudiante2);
		
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setApellido("Ortiz");
		estudiante3.setNombre("Andres");
		estudiante3.setCedula("0620371331");
		estudiante3.setCiudad("Riobamba");
		estudiante3.setGenero("M");
		//this.estudianteService.insertar(estudiante3);
		

		Estudiante estudiante4 = new Estudiante();
		estudiante4.setApellido("Beltran");
		estudiante4.setNombre("Daniel");
		estudiante4.setCedula("060371831");
		estudiante4.setCiudad("Quito");
		estudiante4.setGenero("M");
		//this.estudianteService.insertar(estudiante4);
		
		Estudiante estudiante5 = new Estudiante();
		estudiante5.setApellido("Pasmay");
		estudiante5.setNombre("Luz");
		estudiante5.setCedula("0620378331");
		estudiante5.setCiudad("Riobamba");
		estudiante5.setGenero("F");
		//this.estudianteService.insertar(estudiante5);
		

		Estudiante estudiante6 = new Estudiante();
		estudiante6.setApellido("Mancheno");
		estudiante6.setNombre("Zoila");
		estudiante6.setCedula("0320378931");
		estudiante6.setCiudad("Ibarra");
		estudiante6.setGenero("F");
		//this.estudianteService.insertar(estudiante6);

		
		System.out.println(this.estudianteService.buscarPorNombre("Daniel"));
		System.out.println(this.estudianteService.buscarPorGenero("F"));
		System.out.println(this.estudianteService.buscarPorApellido("Mancheno"));
		System.out.println(this.estudianteService.buscarPorCedula("1720371333"));

	}

}
