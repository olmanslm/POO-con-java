/**
 * 
 */
package com.ucreativa;

/**
 * @author Olman
 *
 */
public class Gato {
    /**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}

	private String nombre;
    private int edad;
    private String color;
    private String raza;
    
	/**
	 * Constructor
	 */
	public Gato(String nombre, int edad, String color, String raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", edad=" + edad + ", color=" + color + ", raza=" + raza + "]";
	}

}
