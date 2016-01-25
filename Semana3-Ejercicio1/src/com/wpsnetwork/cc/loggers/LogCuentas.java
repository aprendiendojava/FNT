package com.wpsnetwork.cc.loggers;

import java.util.ArrayList;
import java.util.List;

import com.wpsnetwork.cc.entidades.Movimiento;
import com.wpsnetwork.cc.entidades.ObservarMovimientos;

public final class LogCuentas implements ObservarMovimientos {
	private static List<Movimiento> movimientosRegistrados = new ArrayList<>();
	private static LogCuentas INSTANCE = new LogCuentas();

	private LogCuentas() {}
	public static LogCuentas getInstance() { return INSTANCE; }

	@Override
	public void tratarMovimiento( Movimiento movimiento ) {
		movimientosRegistrados.add( movimiento );
		imprimirLog( movimiento );
	}

	private void imprimirLog( Movimiento m ) {
		System.out.println( "Movimiento: " + m.hashCode()
			+ "\nFecha movimiento:   " + m.getFechaHora()
			+ "\nIdentificador CC:   " + m.getIdentificadorCC()
			+ "\nTitular CC:         " + m.getTitularCC()
			+ "\nImporte inicial:    " + m.getImportePartida()
			+ "\nImporte movimiento: " + m.getMovimiento()
			+ "\nErrores:            " + ( m.isAdmitido() ? "Sin errores" : m.getMotivoRechazo())
			+ "\n"
		);
	}
}
