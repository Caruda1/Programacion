package practicaHotel;

import java.util.Scanner;

public class practica {
	public void imprimirMenu() {
		int menuElegido;
		do {

			System.out.println(
					"***************************************************APLICACION RESERVAS HOTEL***************************************************");
			System.out.println("Introduzca los datos para crear un cliente......");
			System.out.println("Introduzca dni:");
			System.out.println("Introduzca el nombre:");
			System.out.println("Introduzca el apellido:");

			Scanner sc = new Scanner(System.in);
			menuElegido = sc.nextInt();
			switch (menuElegido) {

			case 1: {
				Dni numero = new Dni();
				numero.imprimirDni();
				break;
			}
			case 2: {
				Nombre texto = new Nombre();
				texto.imprimirNombre();
				break;
			}
			case 3: {
				Apellido texto = new Apellido();
				texto.imprimirApellido();
				break;
			}

			}

		} while (true);
	}
}
