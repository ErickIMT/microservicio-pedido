package com.idat.ef.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.ef.model.Pizza;
import com.idat.ef.service.PizzaImpl;

@RequestMapping("/api/pedido")
@RestController
public class PedidoController {

	@Autowired
	private PizzaImpl serv;
	
	@GetMapping("/listar")
	public List<Pizza> listar(){
		return serv.asignarCliente();
	}
}
