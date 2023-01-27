package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Pedido;
import com.example.demo.service.IClienteSer;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner{

	@Autowired
	private IClienteSer cliSer;
	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Cliente cli1 = new Cliente();
		cli1.setNombre("Reymon");
		cli1.setApellido("Hidalgo");
		cli1.setTelf("2587628");
		cli1.setDireccion("San Diego");
		this.cliSer.insertar(cli1);
		Cliente cli2 = new Cliente();
		cli2.setNombre("Juan");
		cli2.setApellido("Hidalgo");
		cli2.setTelf("2587778");
		cli2.setDireccion("San Diego");
		this.cliSer.insertar(cli2);
		Cliente cli3 = new Cliente();
		cli3.setNombre("Wendy");
		cli3.setApellido("Hidalgo");
		cli3.setTelf("2587778");
		cli3.setDireccion("San Diego");
		this.cliSer.insertar(cli3);
		List<Pedido> pedidos = new ArrayList<Pedido>();
		
		Pedido p1 = new Pedido();
		p1.setCliente(cli3);
		p1.setNumero("A001");
		pedidos.add(p1);
		cli3.setPedidos(pedidos);
		this.cliSer.actualizar(cli3);
		
		System.out.println(this.cliSer.buscar(3));
		Pedido p2 = new Pedido();
		p2.setCliente(cli3);
		p2.setNumero("A003");
		pedidos.add(p2);
		cli3.setPedidos(pedidos);
		this.cliSer.actualizar(cli3);
		
		this.cliSer.eliminar(4);

		
		
		
		
		
		
	}

}
