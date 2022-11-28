package practicaAplicacionITV;

import java.util.Scanner;

public class MenuCreacionVehiculo {
	private String matricula;
	private String caballos;
	private String modelo;
	private String combustible;
	Scanner sc = new Scanner(System.in);
	
	public void mostrarMenuCreacionVehiculo(){
		do {
			System.out.println("Por favor, introduzca la matricula del vehiculo");
			String matricula = sc.nextLine();
			if (matricula.equals("")) {
				System.out.println("ERROR: La matricula no puede estar vacia");
			}
		}while (matricula.equals(""));
		do {
			System.out.println("Por favor, introduzca la modelo del vehiculo");
			String modelo = sc.nextLine();
			if (modelo.equals("")) {
				System.out.println("ERROR: El modelo no puede estar vacio");
			}
		}while (modelo.equals(""));
		do {
			System.out.println("Por favor, introduzca los caballos del vehiculo");
			String caballos = sc.nextLine();
			if (caballos.equals("")) {
				System.out.println("ERROR: Los caballos no pueden estar vacios");
			}
		}while (caballos.equals(""));
		do {
			System.out.println("Por favor, introduzca el combustible del vehiculo");
			String combustible = sc.nextLine();
			if (combustible.equals("")) {
				System.out.println("ERROR: Debe introducir Diesel / Gasolina");
			}
		}while (combustible.equalsIgnoreCase("Diesel && Gasolina"));
	}
	}