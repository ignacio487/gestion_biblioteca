package modelo;

public class Libro {
	private String titulo;
	private String autor;
	private String ISBN;
	private Sring genero;
	private int a�o;

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return this.ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public Sring getGenero() {
		return this.genero;
	}

	public void setGenero(Sring genero) {
		this.genero = genero;
	}

	public int getA�o() {
		return this.a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public Libro(String titulo, Object autor_String_ISBN_String, String genero, int a�o) {
		throw new UnsupportedOperationException();
	}
}