package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.hospital.modelo.Medico;
import com.example.demo.hospital.modelo.Paciente;
import com.example.demo.hospital.service.ICitaMedicaService;
import com.example.demo.hospital.service.IMedicoService;
import com.example.demo.hospital.service.IPacienteService;

@SpringBootApplication
public class Deber2Application implements CommandLineRunner {


	@Autowired
	private IPacienteService pacienteService;
	@Autowired
	private IMedicoService medicoService;
	@Autowired
	private ICitaMedicaService citaService;
	public static void main(String[] args) {
		SpringApplication.run(Deber2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Paciente pa = new Paciente();
		pa.setCedula("1789002535");
		pa.setNombre("Raul Cayambe");
		pa.setTipo("3E");
		this.pacienteService.guardar(pa);
		
		Medico me = new Medico();
		me.setCedula("0600783425");
		me.setNombre("Pablo Mosquera");
		this.medicoService.guardar(me);
		
		this.citaService.agendar("0001", pa.getCedula(), me.getCedula(), new BigDecimal(500));
		System.out.println("Finish!");
		
	}

}
