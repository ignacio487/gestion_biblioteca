package data.dao;

import modelo.Libro;

import java.util.ArrayList;
import org.jooq.DSLContext;


public class BibliotecaDAO {

	public ArrayList<Libro> buscarLibros(DSLContext query, Libro libro) {
		return new ArrayList<>();
	}


	public boolean agregarLibro(DSLContext query,Libro libro) {
		return false;
	}

	public ArrayList<Libro> obtenerLibros(DSLContext query, Libro libro) {
		return new ArrayList<>();
	}

	public ArrayList<Libro> eliminarLibro(DSLContext query, Libro libro) {
		return new ArrayList<>();
	}
}