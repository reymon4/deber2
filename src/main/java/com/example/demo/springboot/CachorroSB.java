package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component

public class CachorroSB extends PacienteSB {
	
	
	protected double valor() {
	System.out.println("El valor a cancelar por el "+this.getProceso() +" de su mascota es de: ");
		return 10.0;
	
	}

}
