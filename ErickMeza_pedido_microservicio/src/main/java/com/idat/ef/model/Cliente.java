package com.idat.ef.model;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

	private Integer idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private int nroCelular;
	private String direccion;
	private Set<Pizza> pizzasc = new HashSet<>();
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public int getNroCelular() {
		return nroCelular;
	}
	public void setNroCelular(int nroCelular) {
		this.nroCelular = nroCelular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Set<Pizza> getPizzasc() {
		return pizzasc;
	}
	public void setPizzasc(Set<Pizza> pizzasc) {
		this.pizzasc = pizzasc;
	}
	
	
	
	
	
}
