import java.util.Scanner;

public class Main {
	public static void main (String[]args) {
//		Solicitar al usuario el número de números que quiere introducir.
		Scanner sc = new Scanner (System.in);
		int numero;
		System.out.println("Cuantos numeros quiere introducir?");
		numero=sc.nextInt();
		sc.nextLine();
//		Crear un array del tamaño indicado por el usuario.
		int [] numeros = new int [numero];
//		resto de funcionalidades
		for (int i=0; i<=numero; i++) {
			System.out.println("Introduzca el numero, porfavor");
			 numero = sc.nextInt();
		sc.nextLine();
			numeros[i] = numero;
		}
	
}
	}
