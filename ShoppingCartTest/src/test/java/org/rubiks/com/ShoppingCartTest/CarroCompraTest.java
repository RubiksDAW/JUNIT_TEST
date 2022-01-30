package org.rubiks.com.ShoppingCartTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CarroCompraTest {
	
	private static CarroCompra cc;
	private static Producto t,c;
	
	@BeforeAll
	
	static void init() {
		cc = new CarroCompra();
		t = new Producto("Tele", 2122.6);
		c = new Producto("Coche", 3422.6);
	}
	
	
	@AfterAll
	static void finish() {
		cc=null;
	}
	
	@Test
	void testShoppingCart(){
		
		assertEquals(0, cc.getItemCount(), "Error");
	}

	@Test
	void testGetBalance(){
		
		cc.addItem(t);
		cc.addItem(c);
		assertEquals(56.2, cc.getBalance(), "Error");
		
	}

	@Test
	void testAddItem(){
		
		cc.addItem(t);
		assertEquals(1, cc.getItemCount(), "Error");
	}

	@Test
	void testRemoveItem(){
		
		
		cc.addItem(t);
		
		try {
		cc.removeItem(c);
		cc.removeItem(t);
		
		
		} catch (ExcepcionProductoNoEncontrado e) {
			
			fail();
		}
		assertEquals(0, cc.getItemCount(), "Error");
	}

	@Test
	void testGetItemCount(){
		
		assertEquals(0, cc.getItemCount());
		
	}

	@Test
	void testEmpty(){
		
		cc.addItem(t);
		cc.empty();
		assertEquals(0, cc.getItemCount(), "Error");
	}

}

