package com.example.demo.hospital.repository;

import com.example.demo.hospital.modelo.Paciente;

public interface IPacienteRepository {
	public void insertar(Paciente paciente);

	public void eliminar(String cedula);

	public Paciente buscar(String cedula);

}
