package org.rubiks.com.PersonaTest;

public class PruebaPersona {

	public PruebaPersona() {
		
	}

	public static void main(String[] args) {
		
		Persona maria = new Persona("Maria", 18, 'M', 100.8, 107.3);
		
		 maria.calcularIMC();
		 maria.esMayorDeEdad();
		 maria.comprobarSexo();
		 
		 System.out.println("Hola?");
	}
}
