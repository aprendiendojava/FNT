package com.wpsnetwork.patron.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControlDeVersiones {
	private final Set<ObservadorVersiones> observadores = new HashSet<>();
	private List<Version> historial;

	public ControlDeVersiones() { historial = new ArrayList<>(); }

	public void nuevoObservador( ObservadorVersiones observador ) { observadores.add( observador ); }

	public void nuevaVersion( Version version ) {
		historial.add( version );
		observadores.stream().forEach( obs -> obs.nuevaVersion( version ));
	}
}
