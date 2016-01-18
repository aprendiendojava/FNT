package com.wpsnetwork.patron.builder;

import java.util.ArrayList;
import java.util.List;

public final class IsoLinuxBuilder {

	private List<String> paquetes;
	public IsoLinuxBuilder() { paquetes = new ArrayList<>(); }
	
	public IsoLinuxBuilder addPaquete( String paquete ) { paquetes.add( paquete ); return this; }

	public IsoLinux construir() { return new IsoLinux( paquetes ); }
}
