package com.idat.ef.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ef.client.OpenFeignClient;
import com.idat.ef.model.Pizza;

@Service
public class PizzaImpl implements PizzaService{

	@Autowired
	private OpenFeignClient client;
	
	@Override
	public List<Pizza> asignarCliente() {
		List<Pizza> lista = new ArrayList<>();
		
		Pizza p = new Pizza();
		p.setIdPizza(1);
		p.setNombrePizza("Margarita");
		p.setDescripcion("Full Queso");
		p.setClientes(client.listarClientes());
		lista.add(p);
		
		Pizza p2 = new Pizza();
		p.setIdPizza(2);
		p.setNombrePizza("Pepperoni");
		p.setDescripcion("Queso y Pepperoni");
		p.setClientes(client.listarClientes());
		lista.add(p2);
		
		return lista;
	}

}
