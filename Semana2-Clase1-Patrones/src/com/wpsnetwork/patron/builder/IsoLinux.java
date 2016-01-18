package com.wpsnetwork.patron.builder;

import java.util.List;

public final class IsoLinux {
	private final List<String> paquetes;

	IsoLinux( List<String> paquetes ) { this.paquetes = paquetes; }

	public List<String> getPaquetes() { return paquetes; }
}
