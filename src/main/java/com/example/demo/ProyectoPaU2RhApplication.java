package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoSer;
import com.example.demo.uce.service.IEmpleadoSer;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2RhApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estuService;
	
	@Autowired
	private IEmpleadoSer emplService;

	@Autowired
	private ICiudadanoSer ciuService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2RhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//TODO Auto-generated method stub
		Estudiante estu = new Estudiante();
		//estu.setId(4);
		estu.setNombre("Bryan");
		estu.setApellido("Hidalgo");
		estu.setCiudad("Quito");
		estu.setGenero("M");
		estu.setCedula("0620436841");
		this.estuService.insertar(estu);
		
//		
		
		Ciudadano ciu = new Ciudadano();
		ciu.setNombre("Reymon");
		ciu.setApellido("Hidalgo");
		this.ciuService.guardar(ciu);
		

		
		Empleado empl =  new Empleado();
		empl.setCiudadano(ciu);
		empl.setSalario(new BigDecimal(2000));
		empl.setFechaIngreso(LocalDateTime.now());
		
		
		
		ciu.setEmpleado(empl);
		
		this.emplService.insertar(empl);

		
		
//		System.out.println(this.estuService.buscar(2));
//		this.estuService.eliminar(3);
		
		
		//Primero forma para actualizar
//		estu.setCiudad("Riobamba");
//		this.estuService.actualizar(estu);
		
		//Segunda forma de actualizar
		//1. Siempre se debe definir la PK
//		Estudiante estu2 = this.estuService.buscar(1);
//		estu2.setCiudad("Guayaquil");
//		this.estuService.actualizar(estu2);
		 
	
		System.out.println("Finish!");
	}

}
