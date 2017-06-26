package ar.edu.UNLAM.PB2;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class TragamonedasTest {
	@SuppressWarnings("deprecation")
	
	@Test
	public void valoresEnElRango() {
		Tragamonedas tragamonedas = new Tragamonedas(10);
		Integer minimo = 1;
		Integer maximo = 10;
		tragamonedas.jugar();

		Assert.assertTrue(tragamonedas.getTambor1() >= minimo&& tragamonedas.getTambor1() <= maximo);
		Assert.assertTrue(tragamonedas.getTambor2() >= minimo&& tragamonedas.getTambor2() <= maximo);
		Assert.assertTrue(tragamonedas.getTambor3() >= minimo&& tragamonedas.getTambor3() <= maximo);
	}
	

}
