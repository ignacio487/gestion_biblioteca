package modelo;

import java.util.Vector;
import modelo.Libro;

public class Prestamo {
	private String fechaInicio;
	private String fechaDevolucion;
	private Vector<Libro> libro = new Vector<Libro>();
	private Usuario usuario;

	public String getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaDevolucion() {
		return this.fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Prestamo(String fechaInicio, String fechaDevolucion) {
		super();
	}
}