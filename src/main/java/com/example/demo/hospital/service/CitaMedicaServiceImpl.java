package com.example.demo.hospital.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hospital.modelo.CitaMedica;

import com.example.demo.hospital.modelo.Paciente;
import com.example.demo.hospital.repository.ICitaMedicaRepository;
import com.example.demo.hospital.repository.IMedicoRepository;
import com.example.demo.hospital.repository.IPacienteRepository;
@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {
	@Autowired
	private ICitaMedicaRepository citaRepository;
	@Autowired
	private IPacienteRepository pacienteRepository;
	@Autowired
	private IMedicoRepository medicoRepository;


	@Override
	public void agendar(String numero, String cedulaPaciente, String cedulaMedico, BigDecimal precio) {
		// TODO Auto-generated method stub
		
		CitaMedica cita = new CitaMedica();
		cita.setNumero(numero);
		cita.setFechaCita(LocalDateTime.now());
		cita.setMedico(this.medicoRepository.buscar(cedulaMedico));
		Paciente ph = this.pacienteRepository.buscar(cedulaPaciente);
		cita.setPaciente(this.pacienteRepository.buscar(cedulaPaciente));
		cita.setPrecio(precio);
		BigDecimal valor = null;
		if (ph.getTipo().equals("C")) { //PACIENTE CON CANCER
			valor = cita.getPrecio().multiply(new BigDecimal(0.20));
		} else if (ph.getTipo().equals("N")){ //PACIENTE NINIO
			
			valor = cita.getPrecio().multiply(new BigDecimal(0.10));
		}else { // PACIENTE TerceraEdad
			valor = cita.getPrecio().multiply(new BigDecimal(0.15));
			
		}
		
		if (valor.compareTo(new BigDecimal(2000))==1) {
			BigDecimal descuento = valor.multiply(new BigDecimal(0.07));

			valor = valor.subtract(descuento);
		}
		cita.setPrecio(valor);
		this.citaRepository.insertar(cita);
		
	}

	
}
