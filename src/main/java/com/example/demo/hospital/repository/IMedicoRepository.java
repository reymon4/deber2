package com.example.demo.hospital.repository;

import com.example.demo.hospital.modelo.Medico;

public interface IMedicoRepository {
	public void insertar(Medico medico);

	public void eliminar(String cedula);

	public Medico buscar(String cedula);

}
