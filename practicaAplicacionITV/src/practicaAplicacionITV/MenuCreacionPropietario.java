package practicaAplicacionITV;

import java.util.Scanner;

public class MenuCreacionPropietario {
	private String dni;
	private String nombre;
	private String apellido;
	Scanner sc = new Scanner(System.in);
	
	public Propietario mostrarMenuCreacionPropietario() {
		do {
			System.out.println("Por favor, introduzca el dni del propietario");
			dni = sc.nextLine();
			if (dni.equals("")) {
				System.out.println("ERROR: El DNI no puede estar vacio");
			}
		}while (dni.equals(""));
		do {
			System.out.println("Por favor, introduzca el nombre del propietario");
			nombre = sc.nextLine();
			if (nombre.equals("")) {
				System.out.println("ERROR: El nombre no puede estar vacio");
			}
		}while (nombre.equals(""));
		do {
			System.out.println("Por favor, introduzca el apellido del propietario");
			apellido = sc.nextLine();
			if (apellido.equals("")) {
				System.out.println("ERROR: El apellido no puede estar vacio");
			}
		}while (apellido.equals(""));
		Propietario p = new Propietario (dni, nombre, apellido);
		return p;
		
	}
}
