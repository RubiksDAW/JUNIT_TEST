package org.rubiks.com.PersonaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	
	
	@Test // Comprobamos que el metodo setSexo funciona (Solo acepta M o H como valores)
	
	public void setSexoTest() {
		
	    Persona maria = new Persona();
		
		maria.setSexo('H');
		
		char esperado = 'H';
		
		char resultado = maria.getSexo();
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test //Comprobamos que el metodo set peso funciona correctamente 
	public void setPesoTest() {
		Persona maria = new Persona();
		
		maria.setPeso(61);
		double esperado = 61;
		double resultado = maria.getPeso();
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test 
	
	public void setEdadTest() {
		
		Persona maria = new Persona();
		
		maria.setEdad(24);
		int esperado = 24;
		int resultado = maria.getEdad();
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	
	public void setAlturaTest() {
		
		Persona maria = new Persona();
		
		maria.setAltura(170);
		
		double esperado = 170 ;
		double resultado = maria.getAltura();
		
		assertEquals(esperado, resultado);
		
		
		
		
	}
	
			//HELP HELP HELP HELP HELP HELP
	@Test // ¿POR QÉ DEVUELVE UN VALOR INCORRECTO?
	
	public void calcularIMCTest() {
		
		Persona maria = new Persona("Maria", 24, 'M', 61, 1.70);
		
		
		
		int resultado = maria.calcularIMC();		
		int esperado = 0;
		
		
		assertEquals(esperado, resultado);
		
		
	}
	@Test // En este caso nos reportará error el método porque nuestro objeto Persona ha sido asignado como mayor de edad
	
	public void esMayorDeEdadTest() {
		
		Persona maria = new Persona("Maria", 24,'M');
		

		assertTrue(maria.esMayorDeEdad());
		
		
		
		
	}
	
	
	
	
	
	

}
