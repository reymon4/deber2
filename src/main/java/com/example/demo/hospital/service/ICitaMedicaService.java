package com.example.demo.hospital.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.demo.hospital.modelo.Medico;
import com.example.demo.hospital.modelo.Paciente;



public interface ICitaMedicaService {
	public void agendar(String numero, String cedulaPaciente, String cedulaMedico, BigDecimal precio);

}
