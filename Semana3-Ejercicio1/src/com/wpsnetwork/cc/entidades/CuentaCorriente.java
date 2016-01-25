package com.wpsnetwork.cc.entidades;

import java.util.HashSet;
import java.util.Set;

import com.wpsnetwork.cc.excepciones.CuentaNegativaException;

public final class CuentaCorriente {
	private Set<ObservarMovimientos> observadores = new HashSet<>();
	private String identificador, titular;
	private Double importe;
	
	String getIdentificador() { return identificador; }
	String getTitular() { return titular; }
	Double getImporte() { return importe; }

	public CuentaCorriente( String identificador, String titular, double importeApertura ) {
		this.identificador = identificador;
		this.titular = titular;
		this.importe = importeApertura;
	}

	public boolean registrarObservador( ObservarMovimientos observador ) { return observadores.add( observador ); }

	public void solicitarMovimiento( double movimiento ) throws CuentaNegativaException {
		CuentaNegativaException exc = null;
		Movimiento movEncapsulado;

		if ( importe + movimiento >= 0 )
			movEncapsulado = new Movimiento( this, importe, movimiento );
		else {
			exc = new CuentaNegativaException( "Operación no admitida. Fondos insuficientes.");
			movEncapsulado = new Movimiento( this, importe, movimiento, exc );
		}

		observadores.stream().forEach( obs -> obs.tratarMovimiento( movEncapsulado ));
		importe = (exc == null) ? importe + movimiento : importe;
	}
}
