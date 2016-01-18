package com.wpsnetwork.patron.observer;

public class EnviarCorreoNuevaVersion implements ObservadorVersiones {

	@Override
	public void nuevaVersion(Version v) {
		System.out.println( "ENVIANDO CORREO - El usuario " + v.getUsuario() + " ha añadido ell siguiente cambio: \"" + v.getDescripcion() + "\"" );
	}
}
