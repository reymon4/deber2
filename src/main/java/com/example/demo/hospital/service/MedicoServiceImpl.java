package com.example.demo.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hospital.modelo.Medico;
import com.example.demo.hospital.repository.IMedicoRepository;
import com.example.demo.hospital.repository.IPacienteRepository;
@Service
public class MedicoServiceImpl implements IMedicoService{
@Autowired
private IMedicoRepository medicoRepository;
	@Override
	public void guardar(Medico medico) {
		// TODO Auto-generated method stub
		this.medicoRepository.insertar(medico);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.medicoRepository.eliminar(cedula);
	}

	@Override
	public Medico buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.medicoRepository.buscar(cedula);
	}

}
