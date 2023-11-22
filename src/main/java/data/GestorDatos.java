package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestorDatos {
	private String direccionArchivoLibros;
	private String direccionArchivoUsuarios;

	public GestorDatos(String direccionArchivoLibros, String direccionArchivoUsuarios) {
		this.direccionArchivoLibros = direccionArchivoLibros;
		this.direccionArchivoUsuarios = direccionArchivoUsuarios;
	}

	// Métodos para establecer las direcciones de los archivos
	public void setDireccionArchivoLibros(String direccionArchivoLibros) {
		this.direccionArchivoLibros = direccionArchivoLibros;
	}

	public void setDireccionArchivoUsuarios(String direccionArchivoUsuarios) {
		this.direccionArchivoUsuarios = direccionArchivoUsuarios;
	}

	// Método para leer información de libros desde un archivo
	public void leerLibros() {
		try (BufferedReader br = new BufferedReader(new FileReader(direccionArchivoLibros))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				// Procesar la línea (puedes parsearla y almacenarla en tu sistema)
				System.out.println(linea); // Por ahora, simplemente imprimir la línea como ejemplo
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Método para escribir información de libros en un archivo
	public void escribirLibros(String informacionLibro) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(direccionArchivoLibros, true))) {
			bw.write(informacionLibro);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Método para leer información de usuarios desde un archivo
	public void leerUsuarios() {
		try (BufferedReader br = new BufferedReader(new FileReader(direccionArchivoUsuarios))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				// Procesar la línea (puedes parsearla y almacenarla en tu sistema)
				System.out.println(linea); // Por ahora, simplemente imprimir la línea como ejemplo
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Método para escribir información de usuarios en un archivo
	public void escribirUsuarios(String informacionUsuario) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(direccionArchivoUsuarios, true))) {
			bw.write(informacionUsuario);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}