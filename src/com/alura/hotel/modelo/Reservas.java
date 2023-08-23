package com.alura.hotel.modelo;

import java.math.BigDecimal;
import java.sql.Date;

public class Reservas {

	private Long idReserva;
	private Date fechaE;
	private Date fechaS;
	private BigDecimal valor;
	private int idFormaPago;
	
	public Reservas(Date fechaE, Date fechaS, BigDecimal valor, int idFormaPago) {
		this.fechaE = fechaE;
		this.fechaS = fechaS;
		this.valor = valor;
		this.idFormaPago = idFormaPago;
	}

	public Long getIdReserva() {
		return idReserva;
	}


	public Date getFechaE() {
		return fechaE;
	}

	public void setFechaE(Date fechaE) {
		this.fechaE = fechaE;
	}

	public Date getFechaS() {
		return fechaS;
	}

	public void setFechaS(Date fechaS) {
		this.fechaS = fechaS;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public int getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(int idFormaPago) {
		this.idFormaPago = idFormaPago;
	}
	
	
	
	
	
}
