package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.ICiudadanoSer;
import com.example.demo.uce.service.IEmpleadoSer;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2RhApplication implements CommandLineRunner{

	@Autowired
	private IHotelService hotelService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2RhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//TODO Auto-generated method stub

		

		//Ejemplo de la clase
//		Ciudadano ciu2 = new Ciudadano();
//		ciu2.setNombre("Tania");
//		ciu2.setApellido("Hidalgo");
//		
//		
//		Empleado empl2 =  new Empleado();
//		empl2.setCiudadano(ciu2);
//		empl2.setSalario(new BigDecimal(2050));
//		empl2.setFechaIngreso(LocalDateTime.now());
//		ciu2.setEmpleado(empl2);
//		this.ciuService.guardar(ciu2);
		//ciu2.setEmpleado(empl2);---> OK sin CASCADE con la línea 57
		
		//La línea de abajo no funciona, porque como definí el CASCADE = ALL. Ya estoy insertando el empleado en la línea anterior(52).
		//Por eso, no me deja insertar nuevamente el mismo objeto.
		//this.emplService.insertar(empl2);
	
		
		Hotel h1 = new Hotel();
		h1.setNombre("Casa Gangotena");
		h1.setDireccion("Plaza Grande");
	
	
		this.hotelService.insertar(h1);
		Habitacion ha1 = new Habitacion();
		ha1.setNumero("A001");
		ha1.setHotel(h1);
		Habitacion ha2 = new Habitacion();
		ha2.setNumero("A002");
		ha2.setHotel(h1);
		Habitacion ha3 = new Habitacion();
		ha3.setNumero("A003");
		ha3.setHotel(h1);
		
		List<Habitacion> habitaciones = new ArrayList<Habitacion>();
		habitaciones.add(ha1);
		habitaciones.add(ha2);
		habitaciones.add(ha3);
		
		h1.setHabitaciones(habitaciones);
		this.hotelService.actualizar(h1);
		
		Hotel h2 = new Hotel();
		h2.setNombre("Marriot");
		h2.setDireccion("Av. Patria");
//		h2.setHabitaciones(habitaciones);
		this.hotelService.insertar(h2);
		this.hotelService.buscar(3);
		this.hotelService.eliminar(3);
//		
		
		h2.setNombre("Hotel Centro");
		this.hotelService.actualizar(h2);
		System.out.println("Finish!");
	}

}
