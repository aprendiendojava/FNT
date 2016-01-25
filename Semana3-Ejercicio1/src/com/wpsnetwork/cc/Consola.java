package com.wpsnetwork.cc;

import com.wpsnetwork.cc.entidades.CuentaCorriente;
import com.wpsnetwork.cc.loggers.LogCuentas;

public final class Consola {

	public static void main(String[] args) {
		CuentaCorriente cc1 = new CuentaCorriente( "1234534543", "FerN", 0 );
		CuentaCorriente cc2 = new CuentaCorriente( "9324234343", "Ahab", 400 );
		cc1.registrarObservador( LogCuentas.getInstance());
		cc1.solicitarMovimiento(+300);

		cc2.solicitarMovimiento(-100);
		cc2.registrarObservador( LogCuentas.getInstance());
		cc2.solicitarMovimiento(-150);

		cc1.solicitarMovimiento(-245);
		cc2.solicitarMovimiento(-250);
		cc2.solicitarMovimiento(+340);
	}

}
