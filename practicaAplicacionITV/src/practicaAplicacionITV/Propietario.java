package practicaAplicacionITV;

import java.util.Scanner;

public class Propietario {
	Scanner sc = new Scanner(System.in);
	private String dni;
	private String nombre;
	private String apellido;
	
	public Propietario (String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		System.out.println("Cliente creado correctamente");
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni=dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
}
	
		
}

