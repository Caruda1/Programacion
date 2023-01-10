package principalLibrerias;

import java.util.Scanner;

public class Principal {
	
	int menuElegido;
	Geo geo;
	Conversiones conversiones;
	
	public void mostrarMenu() {
		int menuElegido;
		
		do {
		System.out.println("MENU PRINCIPAL APLICACION UTILIDADES VARIAS");
		System.out.println("*******************************************");
		System.out.println("Elija la opcion que desee:");
		System.out.println("1. Hacer calculos geometricos");
		System.out.println("2. Hacer conversiones sistema imperial/metrico");
		System.out.println("3. Calculos medicos");
		System.out.println("4. Salir de la aplicacion");
		
		Scanner sc = new Scanner(System.in);
		menuElegido = sc.nextInt();
		
		switch (menuElegido) {
		
		case 1:{
			MenuCalculosGeometricos imprimirGeo = new MenuCalculosGeometricos();
			geo = imprimirGeo.mostrarMenuCalculosGeometricos();
			break;
		}
		case 2:{
			MenuConversionesSistemas imprimirConversiones = new MenuConversionesSistemas();
			imprimirConversiones.mostrarMenuConversionesSistemas();
			break;
		}
		case 3:{
			MenuCalculosMedicos imprimirCalculos = new MenuCalculosMedicos();
			imprimirCalculos.mostrarMenuCalculosMedicos();
			break;
		}
		case 4:{
			
			break;
		}
		}
	
	}while(menuElegido !=5);
	}
}

