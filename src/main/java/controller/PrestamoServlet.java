package controller;

import modelo.Libro;

public class PrestamoServlet {

	public boolean prestarLibro(Libro libro) {
		if (libro != null) {
			if (comprobarDisponibilidad(libro)) {
				System.out.println("Libro prestado con éxito: " + libro.getTitulo());
				return true;
			} else {
				System.out.println("El libro no está disponible para préstamo.");
			}
		} else {
			System.out.println("Error: Intento de prestar un libro nulo.");
		}
		return false;
	}

	public boolean devolverLibro(Libro libro) {
		if (libro != null) {
			System.out.println("Libro devuelto con éxito: " + libro.getTitulo());
			return true;
		} else {
			System.out.println("Error: Intento de devolver un libro nulo.");
		}
		return false;
	}

	public boolean comprobar(Libro libro) {
		if (libro != null) {
			if (comprobarDisponibilidad(libro)) {
				System.out.println("El libro está disponible.");
				return true;
			} else {
				System.out.println("El libro no está disponible.");
			}
		} else {
			System.out.println("Error: Intento de comprobar un libro nulo.");
		}
		return false;
	}

	private boolean comprobarDisponibilidad(Libro libro) {
		return true;
	}
}