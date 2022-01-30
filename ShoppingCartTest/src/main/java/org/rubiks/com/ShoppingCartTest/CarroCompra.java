package org.rubiks.com.ShoppingCartTest;

import java.util.ArrayList;
import java.util.Iterator;

public class CarroCompra {
	
	private ArrayList<Producto> items;
	
	public CarroCompra() {
		items = new ArrayList<Producto>();
	}
	
	public double getBalance() {
		double balance = 0.00;
		for (Iterator<Producto> i = items.iterator(); i.hasNext();){
			Producto item = i.next();
			balance += item.getPrice();
		}
		return balance;
	}
	
	public void addItem(Producto item) {
		items.add(item);
	}
	
	public void removeItem(Producto item)
			throws ExcepcionProductoNoEncontrado {
		if (!items.remove(item)) {
			throw new ExcepcionProductoNoEncontrado();}
	}
	
	public int getItemCount() {
		return items.size();
	}
	
	public void empty() {
		items.clear();
	}
}
