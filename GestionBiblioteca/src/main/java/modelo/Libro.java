package modelo;

public class Libro {
	private String titulo;
	private String autor;
	private String ISBN;
	private String genero;
	private int año;

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

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAño() {
		return this.año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Libro(String titulo, Object autor_String_ISBN_String, String genero, int año) {
		super();
	}
}