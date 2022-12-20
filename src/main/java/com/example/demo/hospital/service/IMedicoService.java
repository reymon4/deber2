package com.example.demo.hospital.service;


import com.example.demo.hospital.modelo.Medico;

public interface IMedicoService {
	public void guardar(Medico medico);

	public void eliminar(String cedula);
	public Medico buscar(String cedula);
}
