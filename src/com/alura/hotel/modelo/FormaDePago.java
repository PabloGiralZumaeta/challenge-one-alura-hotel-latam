package com.alura.hotel.modelo;

public class FormaDePago {

	private int idFormaPago; 
	private String nombrePago;
	
	
	
	public FormaDePago( String nombrePago) {
		this.nombrePago = nombrePago;
	}
	public int getIdFormaPago() {
		return idFormaPago;
	}

	public String getNombrePago() {
		return nombrePago;
	}
	public void setNombrePago(String nombrePago) {
		this.nombrePago = nombrePago;
	}
	
	
	
	
}
