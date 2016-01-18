package com.wpsnetwork.patron.singleton;

public final class ConexionDB {
	private static ConexionDB instance = new ConexionDB();

	// private TCPIP sesion;
	private int 	puerto = 4444;
	private String usuario = "usuarioDB",
					 clave = "claveDB",
					    ip = "127.0.0.1";

	private ConexionDB() { /*this.sesion = ObtenerSesionDB( ip, puerto, usuario, clave );*/ }

	public static ConexionDB getInstance() { return instance; }

	public String toString() { return "usuario: " + usuario + ", clave: " + clave + ", ip/puerto: " + ip + "/" + puerto; }
}
