package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.demo.pago.modelo.CuentaBancaria;
import com.example.demo.pago.modelo.Transferencia;
@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	private static List<CuentaBancaria> baseCuentas = new ArrayList<>();
	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		//SELECT * FROM CUENTA C WHERE C.NUMERO= numeroCuenta
		//CuentaBancaria cuenta = new CuentaBancaria();
		
		//String numeroCuenta;
		//cuenta.setNumero(numeroCuenta);
		//cuenta.setSaldo(new BigDecimal(100));
		//cuenta.setTipo("A");
		//cuenta.setTitular("Jimmy Ortega");
		//return CuentaBancaria;
		return null;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		//baseCuentas.add()
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
