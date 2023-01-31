package com.example.demo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IVehiculoSer;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner{

	@Autowired
	private IVehiculoSer vehiSer;
	
	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Cliente cli1 = new Cliente();
		cli1.setCedula("1720371333");
		cli1.setNombre("Reymon");
		cli1.setEdad(23);
		cli1.setMetodoPago("Efectivo");
		
		Cliente cli2 = new Cliente();
		cli2.setCedula("0603329584");
		cli2.setNombre("Julia");
		cli2.setEdad(40);
		cli2.setMetodoPago("Transferencia");
		
		Cliente cli3 = new Cliente();
		cli3.setCedula("0603329999");
		cli3.setNombre("Hilda");
		cli3.setEdad(58);
		cli3.setMetodoPago("Transferencia");
		
		Cliente cli4 = new Cliente();
		cli4.setCedula("1203329639");
		cli4.setNombre("Fernando");
		cli4.setEdad(35);
		cli4.setMetodoPago("Transferencia");
		
		Cliente cli5 = new Cliente();
		cli5.setCedula("1703329519");
		cli5.setNombre("Daniel");
		cli5.setEdad(25);
		cli5.setMetodoPago("Tarjeta");
		
		Set<Cliente> clientes= new HashSet<>();
		
		Vehiculo ve1= new Vehiculo();
		ve1.setColor("Rojo");
		ve1.setPlaca("PBA3610");
		ve1.setModelo("Sail");
		ve1.setPrecio(new BigDecimal(20));
		clientes.add(cli5);
		clientes.add(cli2);
		ve1.setClientes(clientes);
		
		this.vehiSer.insertar(ve1);
		
		Vehiculo ve2= new Vehiculo();
		ve2.setColor("Rojo");
		ve2.setPlaca("PUA3890");
		ve2.setModelo("Rio");
		ve2.setPrecio(new BigDecimal(25));
		clientes.add(cli1);
		ve2.setClientes(clientes);
		this.vehiSer.insertar(ve2);
		
		Vehiculo ve3= new Vehiculo();
		ve3.setColor("Blanco");
		ve3.setPlaca("PBB2890");
		ve3.setModelo("Fortuner");
		ve3.setPrecio(new BigDecimal(55));
		clientes.add(cli2);
		ve3.setClientes(clientes);
		this.vehiSer.insertar(ve3);
		
		Vehiculo ve4= new Vehiculo();
		ve4.setColor("Negro");
		ve4.setPlaca("HAB2760");
		ve4.setModelo("Fortuner");
		ve4.setPrecio(new BigDecimal(55));
		clientes.remove(cli2);
		clientes.remove(cli1);
		clientes.remove(cli5);
		clientes.add(cli4);
		this.vehiSer.insertar(ve4);
		
		
		Vehiculo ve5= new Vehiculo();
		ve5.setColor("Negro");
		ve5.setPlaca("HH360");
		ve5.setModelo("Grand Vitara");
		ve5.setPrecio(new BigDecimal(30));
		clientes.remove(cli4);
		clientes.add(cli3);
		this.vehiSer.insertar(ve5);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
