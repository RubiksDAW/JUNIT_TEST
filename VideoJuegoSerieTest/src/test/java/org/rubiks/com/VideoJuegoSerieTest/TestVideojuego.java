package org.rubiks.com.VideoJuegoSerieTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVideojuego {

	@Test
	public void testSetTitulo() {
		
		Videojuego v = new Videojuego();
		
		v.setTitulo("test");
		
		String esperado = "test";
		String resultado = v.getTitulo();
		
		assertEquals(esperado,resultado);
		
		
	}

	@Test
	public void testSetHorasEstimadas() {
		
		Videojuego v = new Videojuego();
		
		v.setHorasEstimadas(10);
		
		int esperado = 10;
		int resultado = v.getHorasEstimadas();
		
		assertEquals(esperado,resultado);
		
	}

	@Test
	public void testSetcompañia() {
		
		Videojuego v = new Videojuego();
		
		v.setcompañia("compañia");
		
		String esperado = "compañia";
		String resultado = v.getcompañia();
		
		assertEquals(esperado,resultado);
	}
	
	

	@Test
	public void testEntregar() {
		Videojuego v = new Videojuego();
		
		
		v.entregar();
		
		
		boolean resultado = v.isEntregado();
		
		
		assertTrue(resultado);
	}
	
	
	

	@Test
	public void testDevolver() {
		
		Videojuego v = new Videojuego();
		
		
		v.devolver();
		
		
		boolean resultado = v.isEntregado();
		
		
		assertFalse(resultado);
	}

}
