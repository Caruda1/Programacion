package practicaAplicacionITV;

import java.util.Scanner;

public class MenuPrincipal {
	public void mostrarMenu() {
		int menuElegido;
		do {
		System.out.println("**************APLICACIONITV**************");
		System.out.println("Introduzca la opcion elegida:");
		System.out.println("1. Introducir vehiculo.");
		System.out.println("2. Introducir propietario.");
		System.out.println("3. Dar precio ITV.");
		System.out.println("4. Pasar la ITV.");
		System.out.println("5. Imprimir informe de la ITV.");
		System.out.println("6. Salir de la aplicacion ITV.");
		
		Scanner sc = new Scanner(System.in);
		menuElegido = sc.nextInt();
		switch (menuElegido) {
		case 1:{
			Vehiculo vehiculo = new Vehiculo();
			vehiculo.imprimirVehiculo;
			break;
		}
		case 2:{
			Propietario propietario = new Propietario();
			propietario.imprimirPropietario;
			break;
		}
		}
		} while (menuElegido =!6);
	} 
}