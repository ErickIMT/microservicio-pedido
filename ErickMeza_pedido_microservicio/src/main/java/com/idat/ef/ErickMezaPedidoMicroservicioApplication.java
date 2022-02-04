package com.idat.ef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ErickMezaPedidoMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErickMezaPedidoMicroservicioApplication.class, args);
	}

}
