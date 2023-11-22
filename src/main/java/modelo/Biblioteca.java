package modelo;

import java.util.Vector;
import modelo.Libro;

public class Biblioteca {
	private String nombre;
	private String direccion;
	private String numeroDeTelefono;
	private Vector<Libro> libro = new Vector<Libro>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumeroDeTelefono() {
		return this.numeroDeTelefono;
	}

	public void setNumeroDeTelefono(String numeroDeTelefono) {
		this.numeroDeTelefono = numeroDeTelefono;
	}

	public Biblioteca(String nombre, String direccion, String numeroDeTelefono) {
		throw new UnsupportedOperationException();
	}
}