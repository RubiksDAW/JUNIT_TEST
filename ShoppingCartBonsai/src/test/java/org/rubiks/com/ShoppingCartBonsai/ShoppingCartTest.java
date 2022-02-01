package org.rubiks.com.ShoppingCartBonsai;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
	
		private static ShoppingCart sc;
		private static Product a;
		private static Product b;

	@BeforeAll
	static void iniciarCarrito() {
		
		 sc = new ShoppingCart();
		 a = new Product("Avion",2000.00);
		 b = new Product("Burro",30.0);
		
	}
	
	@AfterEach
	
	static void finish() {
		
		sc = null;
		
	}

	
	

	
	
	
	@Test
	void addItem() {
		
		Product b = new Product("Tele",34.0);
		sc.addItem(b);
		
		assertEquals(1,sc.getItemCount() );
		
		
		
		
	}
	
	@Test
	void removeItem() {
		sc.addItem(a);
		
		try {
			sc.removeItem(a);
			sc.removeItem(b);

			
		}
			
		catch(ProductNotFoundException e) {
			
			fail();
			
		}
		
		assertEquals(0,sc.getItemCount() );

		
		
	}
	
	@Test
	void testGetBalance() {
		
		sc.addItem(a);
		sc.addItem(b);
		
		assertEquals(2030.00,sc.getBalance(),"error");
		
		
	}
	
	@Test
	void testGetItemCount() {
		
		sc.addItem(a);
		sc.addItem(b);
		
		assertEquals(2,sc.getItemCount(),"error");
		
		
		
	}
	
	@Test
	void testEmpty() {
		
		sc.addItem(a);
		sc.empty();
		
		assertEquals(0, sc.getItemCount());
		
		
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
