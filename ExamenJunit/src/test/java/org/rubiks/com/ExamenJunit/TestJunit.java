package org.rubiks.com.ExamenJunit;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJunit extends CoreMatchers{
	private Cuenta c;
	private Empleado e;
	private Movimiento m;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void init() {
		
		c = new Cuenta("1234","Manolo");
		e = new Empleado("Alejandro","Martinez",41);
		m = new Movimiento();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void getSaldoTest() throws IngresoNegativoException {
		
		c.ingresar("paga", 100.0);
		
		assertEquals(100.0, c.getSaldo());
		
		
	}
	
	@Test
	
	void plusTest() {
		//Deberia devolver true porque nuestro empleado tiene más de 40 años
		//REALIZADO CON EL MATCHER DE HAMCREST
		
		assertThat(e.plus(100), is(true));
		
	}
	
	@Test
	
	void equalsTest() {
		
		assertTrue(e.equals(e));
		
	}
	
	@Test
	
	void edadTest() {
		//Compara la edad establecida con la que esperamos que devuelva
		assertEquals(41, e.getEdad());
		
		
	}
	
	@Test
	
	void getImporteTest() {
		
		
		//Nos reporta un error diciendo que this.m es null
		m.setImporte(1000.00);
		
		assertEquals(1000.00,m.getImporte());
		
		
	}
	
	@Test
	
	void setConceptoTest() {
		
		m.setConcepto("Paga");
		
		assertEquals("Paga",m.getConcepto());
		
		
	}
	
	@Test
	
	void ingresarTest() throws IngresoNegativoException {
		
		c.ingresar("Paga", 100.00);
		
		assertEquals(100.00,c.getSaldo());
		
	}
	
	@Test 
	
	void retirarTest() throws IngresoNegativoException, SaldoInsuficienteException {
		
		c.ingresar("Paga", 100.00);
		
		c.retirar("Cobro paga", 100.00);
		
		assertEquals(0.00,c.getSaldo());
		
		
	}
	
	
	
	
	

}
