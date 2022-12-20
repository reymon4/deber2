package com.example.demo.hospital.service;

import com.example.demo.hospital.modelo.Medico;
import com.example.demo.hospital.modelo.Paciente;

public interface IPacienteService {
	public void guardar(Paciente paciente);

	public void eliminar(String cedula);
	public Paciente buscar(String cedula);

}
