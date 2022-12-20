package com.example.demo.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hospital.modelo.Paciente;
import com.example.demo.hospital.repository.IPacienteRepository;
@Service
public class PacienteServiceImpl implements IPacienteService{

@Autowired
private IPacienteRepository pacienteRepo;

	@Override
	public void guardar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepo.insertar(paciente);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.pacienteRepo.eliminar(cedula);
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.pacienteRepo.buscar(cedula);
	}
	

}
