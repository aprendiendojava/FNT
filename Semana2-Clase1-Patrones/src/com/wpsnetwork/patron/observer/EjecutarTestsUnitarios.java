package com.wpsnetwork.patron.observer;

public class EjecutarTestsUnitarios implements ObservadorVersiones {

	@Override
	public void nuevaVersion(Version v) {
		System.out.println( "Ejecutando tests unitarios en la nueva versi�n." );
		System.out.println( "PASANDO TESTS - El usuario " + v.getUsuario() + " ha añadido ell siguiente cambio: \"" + v.getDescripcion() + "\"" );
		v.getFicheros().stream().forEach(fichero->System.out.println("Test -> " + fichero + " -> OK" ));
	}

}
