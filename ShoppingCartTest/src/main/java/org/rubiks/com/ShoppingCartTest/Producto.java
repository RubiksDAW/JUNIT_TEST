package org.rubiks.com.ShoppingCartTest;

public class Producto {
	private String title;
	private double price;
	
	public Producto (String t, double p) {
		this.title = t;
		this.price = p;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Producto) {
			Producto p = (Producto)o;
			return p.getTitle().equals(title);
		}
		return false;
	}
}

