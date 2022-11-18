import java.util.Scanner;

public class Cliente {
	Scanner sc = new Scanner(System.in);
	private String dni;
	private String nombre;
	private String apellido;
	private Habitacion habitacion;
	
	public Cliente (String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		System.out.println("Cliente con dni " +dni+ " , nombre: " +nombre+ " y apellido: " +apellido+ " CREADO. ");	
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		System.out.println("Introduzca el dni: " +this.dni);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("Introduzca el nombre: " +this.nombre);
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
		System.out.println("Introduzca el apellido: " +this.apellido);
	}
	
	}
