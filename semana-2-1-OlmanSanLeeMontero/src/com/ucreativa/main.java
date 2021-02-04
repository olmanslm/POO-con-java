/**
 * 
 */
package com.ucreativa;
/**
 * @author Olman
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instancia 1
		Gato gato1 = new Gato("Pixel", 10, "Blanco con gris", "comun");
		
		System.out.println(gato1.toString());
		
		// Instancia 2
		 Gato gato2 = new Gato("Happy", 9, "Blanca con gris", "comun");
		 
		 System.out.println(gato2.toString());
	}

}
