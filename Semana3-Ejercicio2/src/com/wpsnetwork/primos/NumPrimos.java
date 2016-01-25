package com.wpsnetwork.primos;

public class NumPrimos {
	public static int calculaPrimo( int minimo, int maximo ) {
		int primo = minimo;
		if ( primo <= 1 )
			return 0;
		boolean esPrimo = false;
		do {
			esPrimo=false;
			int superior=(int) Math.sqrt( primo );
			int n;
			//for ( n = 2; n < superior; n += 2) {
			for ( n = 2; n <= superior; n += 1) {
				if ( primo%n == 0 ) {
					break;
				}
			}
			//if ( n >= superior ){
			if ( n > superior ){
				esPrimo = true;
			} else {
				primo++;
			}
		} while ( !esPrimo && primo < maximo );
		return esPrimo? primo : 0;
	}
}
