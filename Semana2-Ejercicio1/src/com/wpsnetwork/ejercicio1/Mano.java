package com.wpsnetwork.ejercicio1;

import java.util.Arrays;

public final class Mano {
	private Carta[] cartas;
	public Mano( int numCartas ) { cartas = new Carta[numCartas]; }

	public void repartir( Carta... cartas ) throws Exception {
		if ( this.cartas.length != cartas.length )
			throw new Exception( "No se pueden repartir " + cartas.length + " cartas. El máximo son " + this.cartas.length + "." );

		this.cartas = cartas;
	}

	public int puntuacion() {
		return Arrays.asList(cartas).stream()
		.map( carta -> carta.getPuntuacion())
		.reduce(( total, puntos ) -> total + puntos )
		.get().intValue();
	}

	public String toString() {
		return Arrays.asList(cartas).stream()
		.map( carta -> carta.toString())
		.reduce(( mano, carta ) -> mano + ", " + carta.toString())
		.get();
	}
}
