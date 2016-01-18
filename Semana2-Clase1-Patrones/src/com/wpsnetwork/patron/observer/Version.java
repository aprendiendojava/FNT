package com.wpsnetwork.patron.observer;

import java.util.Arrays;
import java.util.List;

public class Version {
	private String usuario, descripcion;
	private List<String> ficheros;

	public Version( String usuario, String descripcion, String... ficheros ) {
		this.usuario = usuario;
		this.descripcion = descripcion;
		this.ficheros = Arrays.asList( ficheros );
	}

	public String        getUsuario() { return usuario; }
	public String    getDescripcion() { return descripcion; }
	public List<String> getFicheros() { return ficheros; }

	public String toString() { 
		return "usuario: " + usuario + ", revision " + ", descripcion: " + descripcion + ", ficheros: " + ficheros;
	}
}
