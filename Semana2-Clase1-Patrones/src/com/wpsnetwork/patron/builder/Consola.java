package com.wpsnetwork.patron.builder;

public class Consola {

	/* El patr�n BUILDER nos permite gestionar la l�gica de c�mo construir un objeto complejo fuera de la clase principal que lo define.
	 * Esto permite, por ejemplo, que la clase principal s�lo contenga la capa de datos.

	 * Este patr�n tambi�n permite forzar la INTEGRIDAD de los objetos de la clase principal (DistribucionLinux), de forma que en entornos
	 * distribuidos NUNCA vaya a existir un objeto DistribucionLinux a medio construir, cosa que podr�a ocurrir si se permitiera costruir
	 * el objeto e ir a�adi�ndole valores a posteriori.
	 * 
	 * En lugar de eso, usamos una clase BUILDER que podr� ir acumulando la especificaci�n del FUTURO objeto DistribucionLinux, y una vez
	 * consideremos que est� completa, entonces y no antes, construimos el objeto DistribucionLinux resultante.
	 */

	public static void main( String...strings ) {
		IsoLinuxBuilder  dlb = new IsoLinuxBuilder();
		IsoLinux linux = dlb.addPaquete( "GNOME" )
									.addPaquete( "GRUB" )
									.addPaquete( "SAMBA" )
									.addPaquete( "FIREFOX" )
									.construir();
		linux.toString();
	}
}
