package com.wpsnetwork.patron.observer;

public class Consola {
	public static void main( String...strings )
	{
		ControlDeVersiones cv = new ControlDeVersiones();
		cv.nuevoObservador(new EnviarCorreoNuevaVersion());
		cv.nuevoObservador(new EjecutarTestsUnitarios());

		cv.nuevaVersion( new Version("FNT", "Commit inicial", "README", "src/" ));
		cv.nuevaVersion( new Version("FNT", "Añadido .gitignore", ".gitignore" ));
	}
}
