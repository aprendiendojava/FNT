package com.wpsnetwork.cc.entidades;

import java.time.LocalDateTime;

public final class Movimiento {
	private LocalDateTime fechaHora = LocalDateTime.now();
	private CuentaCorriente cuentaCorriente;
	private double importePartida, importeMovimiento;
	private RuntimeException excepcion;

	public Movimiento( CuentaCorriente cuentaCorrienteAfectada, double importePartida, double importeMovimiento ) { this( cuentaCorrienteAfectada, importePartida, importeMovimiento, null ); }
	public Movimiento( CuentaCorriente cuentaCorrienteAfectada, double importePartida, double importeMovimiento, RuntimeException excepcion ) {
		this.cuentaCorriente	= cuentaCorrienteAfectada;
		this.importePartida		= cuentaCorrienteAfectada.getImporte();
		this.importeMovimiento	= importeMovimiento;
		this.excepcion			= excepcion;
	}

	// En lugar de crear un getter para el objeto cuenta corriente, encapsulamos para que
	// no sea posible acceder a la información actual de la cuenta corriente (importeActual, etc)
	// a través de un movimiento anterior.
	public String  getIdentificadorCC() { return cuentaCorriente.getIdentificador(); }
	public String        getTitularCC() { return cuentaCorriente.getTitular(); }

	public double   getImportePartida() { return importePartida; }
	public double       getMovimiento() { return importeMovimiento; }
	public LocalDateTime getFechaHora() { return fechaHora; }
	public boolean         isAdmitido() { return excepcion == null; }
	public String    getMotivoRechazo() { return (excepcion == null)? "" : excepcion.getMessage(); }
}
