package com.wpsnetwork.ejercicio1;

public final class Carta {
	private final Palo palo;
	private final Numero numero;

	public Carta( Palo palo, Numero numero ) { this.palo = palo; this.numero = numero; }
	
	public Palo		getPalo()		{ return palo; }
	public Numero	getNumero()		{ return numero; }
	public int		getPuntuacion()	{ return getNumero().puntuacion; }

	public String toString() {
		switch( numero ) {
		case AS: case SOTA: case CABALLO: case REY:
			return numero.toString() + " de " + palo.toString();
		default:
			return numero.puntuacion + " de " + palo.toString();
		}
	}

	public enum Palo	{ OROS, COPAS, ESPADAS, BASTOS }
	public enum Numero	{
		AS(11), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), SOTA(10), CABALLO(10), REY(10);
		private final int puntuacion;
		private Numero( final int puntuacion ) { this.puntuacion = puntuacion; }
		public final int getPuntuacion() { return puntuacion; }
	}
}