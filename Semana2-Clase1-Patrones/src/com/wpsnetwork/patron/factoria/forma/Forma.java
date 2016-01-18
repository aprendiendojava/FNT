package com.wpsnetwork.patron.factoria.forma;


interface Forma {
	public static class Factory {
		enum TipoForma{
			CIRCULO(Circulo.class), RECTANGULO(Rectangulo.class), TRIANGULO(Triangulo.class);

			private Forma forma;

			TipoForma( Class forma ) {
				try { this.forma = (Forma) forma.newInstance(); }
				catch (Exception e) { e.printStackTrace(); }
			}

			public Forma getForma() { return forma; }
		}
		
		public static Forma nuevaForma( TipoForma tipo ) { return tipo.getForma(); }
	}
}
