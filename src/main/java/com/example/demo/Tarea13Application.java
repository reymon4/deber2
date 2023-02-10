package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.service.IAutomovilSer;

@SpringBootApplication
public class Tarea13Application implements CommandLineRunner {

	@Autowired
	private IAutomovilSer automovilSer;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea13Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Automovil auto1 = new Automovil();
		auto1.setPlaca("PBO3610");
		auto1.setColor("Rojo");
		auto1.setAnio(2020);
		auto1.setMarca("Kia");
		auto1.setModelo("Rio");
		auto1.setTipo("Combustible");
		auto1.setClasificacion("Sedán");
		//this.automovilSer.insertar(auto1);
		
		Automovil auto2 = new Automovil();
		auto2.setPlaca("PBu3650");
		auto2.setColor("Blanco");
		auto2.setAnio(2018);
		auto2.setMarca("Hyundai");
		auto2.setModelo("Tucson");
		auto2.setTipo("Combustible");
		auto2.setClasificacion("Familiar");
		//this.automovilSer.insertar(auto2);
		
		Automovil auto3 = new Automovil();
		auto3.setPlaca("GHO1110");
		auto3.setColor("Blanco");
		auto3.setAnio(2022);
		auto3.setMarca("Ford");
		auto3.setModelo("Explorer");
		auto3.setTipo("Híbrido");
		auto3.setClasificacion("Familiar");
		//this.automovilSer.insertar(auto3);
		
		Automovil auto4 = new Automovil();
		auto4.setPlaca("PHU2110");
		auto4.setColor("Negro");
		auto4.setAnio(2021);
		auto4.setMarca("Porsche");
		auto4.setModelo("Cayman");
		auto4.setTipo("Híbrido");
		auto4.setClasificacion("Deportivo");
		//this.automovilSer.insertar(auto4);
		
		Automovil auto5 = new Automovil();
		auto5.setPlaca("PBB3910");
		auto5.setColor("Morado");
		auto5.setAnio(2021);
		auto5.setMarca("Lamborghini");
		auto5.setModelo("Aventador");
		auto5.setTipo("Híbrido");
		auto5.setClasificacion("Deportivo");
		//this.automovilSer.insertar(auto5);
		
		
		Automovil auto6 = new Automovil();
		auto6.setPlaca("GHO1110");
		auto6.setColor("Plata");
		auto6.setAnio(2012);
		auto6.setMarca("Chevrolet");
		auto6.setModelo("Sail");
		auto6.setTipo("Combustible");
		auto6.setClasificacion("Sedán");
		//this.automovilSer.insertar(auto6);
		
		
		//TypedQuery
		System.out.println(this.automovilSer.buscarPorAnioQueryTyped(2012));
		System.out.println(this.automovilSer.buscarPorModeloQueryTyped("Aventador"));
		System.out.println(this.automovilSer.buscarPorPlacaQueryTyped("GHO1110"));
		
		//NamedQuery
		System.out.println(this.automovilSer.buscarPorAnioNamedQuery(2021));
		System.out.println(this.automovilSer.buscarPorColorNamedQuery("Blanco"));
		System.out.println(this.automovilSer.buscarPorMarcaNamedQuery("Kia"));
		
		//NativeQuery
		System.out.println(this.automovilSer.buscarPorClasificacionNativeQuery("Sedán"));
		System.out.println(this.automovilSer.buscarPorTipoNativeQuery("Combustible"));
		System.out.println(this.automovilSer.buscarPorModeloNativeQuery("Explorer"));
		
		//Named Native Query
		System.out.println(this.automovilSer.buscarPorClasificacionNativeQueryTyped("Familiar"));
		System.out.println(this.automovilSer.buscarPorModeloNativeQueryTyped("Cayman"));
		System.out.println(this.automovilSer.buscarPorTipoNativeQueryTyped("Híbrido"));
		
		
		
	}

}
