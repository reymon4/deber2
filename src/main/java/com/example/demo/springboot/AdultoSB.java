package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component
public class AdultoSB extends PacienteSB {
	protected double valor(String proceso) {
		if(proceso == "Banio") {
			System.out.println("El valor a cancelar por el "+proceso +" de su mascota es de:");
			return 10+(0.01*this.getPeso());
		}else {
			System.out.println("El valor a cancelar por el "+proceso +" de su mascota es de:");
			return (20+(0.8*this.getPeso()));
		}
		
	}
	
}
