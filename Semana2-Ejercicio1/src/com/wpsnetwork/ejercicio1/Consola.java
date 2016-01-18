package com.wpsnetwork.ejercicio1;

import com.wpsnetwork.ejercicio1.Carta.Numero;
import com.wpsnetwork.ejercicio1.Carta.Palo;

public class Consola {
	public static void main( String[] args ) {
		System.out.println( new Carta( Carta.Palo.ESPADAS, Carta.Numero.AS ).toString());
		Carta[] cartas = {
			  new Carta( Palo.ESPADAS,	Numero.AS )
			, new Carta( Palo.BASTOS,	Numero.CABALLO)
			, new Carta( Palo.COPAS,	Numero.CINCO)
//			, new Carta( Palo.OROS,		Numero.DOS )
		};

		Mano m = new Mano(3);
		try {
			m.repartir(cartas);
			System.out.println(m);
		}
		catch( Exception e ) { System.err.println( e.getMessage()); }
		Baraja b = new Baraja();
		System.out.println( b.mano(3).toString());
		System.out.println( b.mano(7).toString());
		System.out.println( b.mano(3).toString());
		System.out.println( b.reparte());
		b.iniciarJuego();
		System.out.println( b.mano(4).toString());
		b.barajar();
		System.out.println( b.mano(10).toString());
	}
}