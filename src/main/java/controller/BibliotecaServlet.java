package controller;

import modelo.Libro;
import data.dao.BibliotecaDAO;
import org.jooq.DSLContext;

import java.util.ArrayList;

public class BibliotecaServlet {

	private BibliotecaDAO bibliotecaDAO;

	public BibliotecaServlet(DSLContext query) {
		this.bibliotecaDAO = new BibliotecaDAO();
	}

	public void agregarLibro(DSLContext query,Libro libro) {
		if (libro != null) {
			bibliotecaDAO.agregarLibro(query, libro);
			System.out.println("Libro agregado con éxito: " + libro.getTitulo());
		} else {
			System.out.println("Error: Intento de agregar un libro nulo.");
		}
	}

	public void buscarLibro(DSLContext query, Libro libro) {
		if (libro != null) {
			ArrayList<Libro> librosEncontrados = bibliotecaDAO.buscarLibros(query, libro);
			if (!librosEncontrados.isEmpty()) {
				System.out.println("Libros encontrados:");
				for (Libro encontrado : librosEncontrados) {
					System.out.println(encontrado.getTitulo());
				}
			} else {
				System.out.println("No se encontraron libros.");
			}
		} else {
			System.out.println("Error: Intento de buscar un libro nulo.");
		}
	}

	public ArrayList<Libro> obtenerLibros(DSLContext query, Libro libro) {
		ArrayList<Libro> listaLibros = bibliotecaDAO.obtenerLibros(query, libro);
		if (!listaLibros.isEmpty()) {
			System.out.println("Lista de libros:");
			for (Libro libroEnLista : listaLibros) {
				System.out.println(libroEnLista.getTitulo());
			}
		} else {
			System.out.println("La biblioteca está vacía.");
		}
		return listaLibros;
	}

	public void eliminarLibro(DSLContext query, Libro libro) {
		if (libro != null) {
			bibliotecaDAO.eliminarLibro(query, libro);
			System.out.println("Libro eliminado con éxito: " + libro.getTitulo());
		} else {
			System.out.println("Error: Intento de eliminar un libro nulo.");
		}
	}
}