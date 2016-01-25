package com.wpsnetwork.primos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumPrimosTest {

	@Test
	public final void testCalculaPrimo() {
		int[] nPrimos = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};

		for( int i=0; i < nPrimos.length; i++ )
			assertEquals("No son primos", nPrimos[i], NumPrimos.calculaPrimo(i==0?2:nPrimos[i-1]+1, 100));
	}

}
