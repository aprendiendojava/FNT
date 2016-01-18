package com.wpsnetwork.ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import com.wpsnetwork.ejercicio1.Carta.Numero;
import com.wpsnetwork.ejercicio1.Carta.Palo;

public final class Baraja {
	private static Palo[] palosPorOrden = { Palo.OROS, Palo.COPAS, Palo.ESPADAS, Palo.BASTOS };
	private static Numero[] numerosPorOrden = { Numero.AS, Numero.DOS, Numero.TRES, Numero.CUATRO, Numero.CINCO, Numero.SEIS, Numero.SIETE, Numero.SOTA, Numero.CABALLO, Numero.REY };
	private Vector<Carta> cartas;

	public Baraja() { iniciarJuego(); }
	public Carta reparte() { return cartas.remove(0); }
	public void barajar() { java.util.Collections.shuffle(cartas); }

	public void iniciarJuego() {
		cartas = new Vector<Carta>(
			Arrays.stream( palosPorOrden )
			.flatMap( palo -> Arrays.stream( numerosPorOrden )
							  .map( numero -> new Carta( palo, numero ))
			).collect( Collectors.toList()));
	}

	public Mano mano( int numCartas ) {
		List<Carta> cartasRepartir = cartas.subList( 0, numCartas );

		Carta[] cartasMano = new Carta[ numCartas ];
		cartasRepartir.toArray( cartasMano );

		Mano mano = new Mano( numCartas );
		try { mano.repartir( cartasMano ); }
		catch (Exception e) { e.printStackTrace(); }

		cartasRepartir.clear();
		return mano;
	}
}
