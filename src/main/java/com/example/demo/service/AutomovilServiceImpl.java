package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.repository.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilSer {

	@Autowired
	private IAutomovilRepo automovilRepo;
	
	@Override
	public void insertar(Automovil auto) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(auto);
	}

	@Override
	public List<Automovil> buscarPorPlacaQueryTyped(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaQueryTyped(placa);
	}

	@Override
	public List<Automovil> buscarPorModeloQueryTyped(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorModeloQueryTyped(modelo);
	}

	@Override
	public List<Automovil> buscarPorAnioQueryTyped(Integer anio) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorAnioQueryTyped(anio);
	}

	@Override
	public List<Automovil> buscarPorAnioNamedQuery(Integer anio) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorAnioNamedQuery(anio);
	}

	@Override
	public List<Automovil> buscarPorMarcaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaNamedQuery(marca);
	}

	@Override
	public List<Automovil> buscarPorColorNamedQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorNamedQuery(color);
	}

	@Override
	public List<Automovil> buscarPorModeloNativeQuery(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorModeloNativeQuery(modelo);
	}

	@Override
	public List<Automovil> buscarPorTipoNativeQuery(String tipo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorTipoNativeQuery(tipo);
	}

	@Override
	public List<Automovil> buscarPorClasificacionNativeQuery(String clasificacion) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorClasificacionNativeQuery(clasificacion);
	}

	@Override
	public List<Automovil> buscarPorModeloNativeQueryTyped(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorModeloNativeQueryTyped(modelo);
	}

	@Override
	public List<Automovil> buscarPorTipoNativeQueryTyped(String tipo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorTipoNativeQueryTyped(tipo);
	}

	@Override
	public List<Automovil> buscarPorClasificacionNativeQueryTyped(String clasificacion) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorClasificacionNativeQueryTyped(clasificacion);
	}

}
