import java.util.Scanner;

public class Menu {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int menuElegido;
	
	System.out.println("***********************************************");
	System.out.println("***********APLICACION RESERVAS HOTEL***********");
	System.out.println("***********************************************");
	System.out.println("Introduzca los datos para crear un cliente......");
	System.out.println("Introduzca el dni: ");
	String dni = sc.nextLine();
	System.out.println("Introduzca el nombre");
	String nombre = sc.nextLine();
	System.out.println("Introduzca el apellido");
	String apellido = sc.nextLine();
	
	Cliente clnt = new Cliente (dni, nombre, apellido);
	System.out.println("Introduzca los datos para crear una habitacion......");
	System.out.println("Introduzca el numero de habitacion: ");
	int numeroHabitacion = sc.nextInt();
	System.out.println("Introduzca el numero de planta: ");
	int numeroPlanta = sc.nextInt();
	System.out.println("La habitacion con numero: "+numeroHabitacion+" en planta: "+numeroPlanta+" ha sido creada.");
	System.out.println("¿Que operacion desea realizar ahora?");

	menuElegido = sc.nextInt();
	sc.nextLine();
	switch (menuElegido) {
	case 1: {
		
		
		
	}
	default:
		
	
	}while (menuElegido !=9);
}
}
