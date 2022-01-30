package org.rubiks.com.VideoJuegoSerieTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSerie {

	@Test
	public void testSetTitulo() {
		
		Serie s = new Serie("tituloprueba","creadorprueba");
		
		String esperado = "tituloprueba";
		String resultado = s.getTitulo();
		
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testSetCreador() {
		
		Serie s = new Serie("tituloprueba","creadorprueba");
		
		String esperado = "creadorprueba";
		String resultado = s.getcreador();
		
		assertEquals(esperado,resultado);
		
		
	}
	
	@Test 
	
	public void testEntregar() {
		
		Serie s = new Serie("tituloprueba","creadorprueba");
		
		
		s.entregar();
		
		
		boolean resultado = s.isEntregado();
		
		
		assertTrue(resultado);
		
	}
	
	@Test 
	
	public void testDevolver() {
		
		Serie s = new Serie("tituloprueba","creadorprueba");
		
		
		s.devolver();
		
		
		boolean resultado = s.isEntregado();
		
		
		assertFalse(resultado);
		
	}
	
	
	
	

}
