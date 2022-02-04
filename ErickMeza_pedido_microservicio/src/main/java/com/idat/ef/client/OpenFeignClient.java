package com.idat.ef.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.ef.model.Cliente;

@FeignClient(name = "ErickMeza-pizzeria-microservicio", url = "localhost:9300")
public interface OpenFeignClient {

	@GetMapping("/api/pizzeria/listar/clientes")
	public List<Cliente> listarClientes();
}
