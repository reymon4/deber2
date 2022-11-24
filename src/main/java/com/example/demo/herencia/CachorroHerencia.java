package com.example.demo.herencia;

public class CachorroHerencia extends PacienteHerencia {
	
	
	protected double valor() {
	System.out.println("El valor a cancelar por el "+this.getProceso() +" de su mascota es de: ");
		return 10.0;
	
	}

}
