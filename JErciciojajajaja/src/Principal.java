import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("digame el numero de perosnas que quiere introducir:");
		int numPersonas=sc.nextInt();
		sc.nextLine();
		Persona[]personas=new Persona [numPersonas];
		for (int i=1; i<=numPersonas; i++) {
			System.out.println("Digame el DNI de la persona"+i);
			String dni = sc.nextLine();
			System.out.println("Digame le n0mbre de la persona");
			String nombre = sc.nextLine();
			System.out.println("Digame el apellido de la persona");
			String a = sc.nextLine();
			
			Persona p = new Persona(dni, nombre, a);
			personas[i] = p;
		}
		}
}
