package org.rubiks.com.ShoppingCartBonsai;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
	
		private static ShoppingCart sc;
		private static Product p;

	@BeforeAll
	static void iniciarCarrito() {
		
		ShoppingCart sc = new ShoppingCart();
		Product a = new Product("Avion",2000.00);
		Product b = new Product("Burro",30.0);
		
	}

	@AfterAll
	static void finish() {
		
		sc = null;
		
	}

	
	
	
	@Test
	
	void addItem() {
		sc.addItem(a);
		
		assertEquals(1,sc.getItemCount() );
		
		
		
		
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
