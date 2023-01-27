package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Alumno;
import com.example.demo.modelo.Examen;
import com.example.demo.service.IAlumnoSer;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner {

	
	
	@Autowired
	private IAlumnoSer aluSer;
	
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Alumno alu1 = new Alumno();
		alu1.setNombre("Reymon");
		alu1.setApellido("Hidalgo");
		this.aluSer.insertar(alu1);
		
		
		Alumno alu2 = new Alumno();
		alu2.setNombre("Alexander");
		alu2.setApellido("Hidalgo");
		this.aluSer.insertar(alu2);
		
		
		Alumno alu3 = new Alumno();
		alu3.setNombre("Dario");
		alu3.setApellido("Hidalgo");
		this.aluSer.insertar(alu3);
		
		Examen exa1 = new Examen();
		exa1.setMateria("Álgebra");
		exa1.setNota(18.3);
		exa1.setAlumno(alu1);
		this.aluSer.actualizar(alu1);
		this.aluSer.buscar(3);
		this.aluSer.eliminar(2);
		
		
	}

}
