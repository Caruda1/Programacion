package practicaAplicacionITV;

import java.util.Scanner;

public class MenuPrincipal {
	
	int menuElegido;
	Vehiculo vehiculo;
	Propietario propietario;
	private boolean hayVehiculoCreado(Vehiculo vehiculo) {
		if (vehiculo != null) {
			
		return true;
	}else {
		return false;
	}
	}

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
			MenuCreacionVehiculo imprimirVehiculo = new MenuCreacionVehiculo();
			vehiculo = imprimirVehiculo.mostrarMenuCreacionVehiculo();
			break;
		}
		
		case 2:{
			MenuCreacionPropietario imprimirPropietario = new MenuCreacionPropietario();
			propietario = imprimirPropietario.mostrarMenuCreacionPropietario();
			break;
		}
		case 3:{
			if (hayVehiculoCreado(vehiculo)==false) {
				System.out.println("ERROR: tiene que tener un vehiculo creado para calcular ITV");
			}else {
				System.out.println("El precio de la ITV es: " +vehiculo.calculaPrecioITV());
				break;
			}
		
			}
			
		case 4:{
			MenuPasarITV pasarITV=new MenuPasarITV();
			pasarITV.mostrarMenuPasarITV(vehiculo);
			break;
		}
		case 5:{
			EmisionInforme emision=new EmisionInforme();
			emision.emiteInforme(vehiculo, propietario);
			break;
		}
			
		}
		} while (menuElegido != 6);
	}

	private boolean hayVehiculo(Vehiculo vehiculo2) {
		return false;
	}
}