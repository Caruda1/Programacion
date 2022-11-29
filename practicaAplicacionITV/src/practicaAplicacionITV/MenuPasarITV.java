package practicaAplicacionITV;

import java.util.Scanner;

public class MenuPasarITV {
	Scanner sc = new Scanner(System.in);
	public void mostrarMenuPasarITV(Vehiculo vehiculo) {
		int menu;
		String deficienciasLeves;
		
		
		System.out.println("***Menu Pasar ITV***");
		System.out.println("Elija la opcion que desee ejecutar.");
		System.out.println("1. Pasar la ITV sin deficiencias.");
		System.out.println("2. Pasar la ITV con deficiencias leves.");
		System.out.println("3. No pasa la ITV.");
		
		menu = sc.nextInt();
		sc.nextLine();
		
		
		switch(menu) {
		case 1:
			vehiculo.setrevisionPasada(true);
			vehiculo.setrevisionSuperada(true);
			return;
		case 2:
			System.out.println("Introduzca la deficiencia leve observada");
			deficienciasLeves=sc.nextLine();
			vehiculo.setDeficienciasLeves(deficienciasLeves);
			vehiculo.setrevisionPasada(true);
			vehiculo.setrevisionSuperada(true);
		case 3:
			System.out.println("Introduzca la deficiencia grave observada");
			String deficienciasGraves=sc.nextLine();
			vehiculo.setDeficienciasGraves(deficienciasGraves);
			System.out.println("Introduzca la deficiencia leve observada");
			deficienciasLeves=sc.nextLine();
			if(deficienciasLeves.equals("")) {
				vehiculo.setDeficienciasLeves(null);
			}else {
				vehiculo.setDeficienciasLeves(deficienciasLeves);
			}
			vehiculo.setrevisionPasada(true);
			vehiculo.setrevisionSuperada(false);
			break;
			default:
				System.out.println("El numero no esta entre el 1 y 3");   
			
		
		
		}
		
	
}


}
