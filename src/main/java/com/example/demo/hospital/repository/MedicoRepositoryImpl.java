package com.example.demo.hospital.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hospital.modelo.Medico;

@Repository
public class MedicoRepositoryImpl implements IMedicoRepository {

	private List<Medico> base = new ArrayList<>();
	@Override
	public void insertar(Medico medico) {
		// TODO Auto-generated method stub
		base.add(medico);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(cedula));
	}

	@Override
	public Medico buscar(String cedula) {
		// TODO Auto-generated method stub
		
		Medico med = null;
		for (Medico p : base) {
			if (p.getCedula().equals(cedula)) {
				med = p;
			}
		}
		return med;
	}

}
