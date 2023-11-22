package modelo;

public class Usuario {
	private String nombre;
	private int numeroDeIdentificacion;
	private String direccion;
	private String numeroDeTelefono;
	private String correoElectronico;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDeIdentificacion() {
		return this.numeroDeIdentificacion;
	}

	public void setNumeroDeIdentificacion(int numeroDeIdentificacion) {
		this.numeroDeIdentificacion = numeroDeIdentificacion;
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

	public void setNumeroDeTelefono(String numerodeTelefono) {
		this.numeroDeTelefono = numerodeTelefono;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Usuario(String nombre, int numeroDeIdentificacion, String direccion, String numeroDeTelefono, String correoElectronico) {
		throw new UnsupportedOperationException();
	}
}