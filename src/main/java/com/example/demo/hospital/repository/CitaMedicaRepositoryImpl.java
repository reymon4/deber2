package com.example.demo.hospital.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hospital.modelo.CitaMedica;

@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{
	private static List<CitaMedica> base = new ArrayList<>();

	@Override
	public void insertar(CitaMedica cita) {
		// TODO Auto-generated method stub
		base.add(cita);
	}

}
