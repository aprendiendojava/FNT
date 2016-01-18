package com.wpsnetwork.patron.factoria.forma;

import com.wpsnetwork.patron.factoria.forma.Forma.Factory.TipoForma;

public class Consola {
	public static void main( String... args ) {
		System.out.println( Forma.Factory.nuevaForma(TipoForma.CIRCULO).toString());
		System.out.println( Forma.Factory.nuevaForma(TipoForma.RECTANGULO).toString());
		System.out.println( Forma.Factory.nuevaForma(TipoForma.TRIANGULO).toString());
	}
}
