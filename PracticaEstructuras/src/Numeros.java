import java.util.Scanner;

public class Numeros {
	int numero;
	public void imprimirNumeroPrimos() {
		
	}

	public void imprimirNumerosNaturales() {
		System.out.println("Introduzca un numero: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		sc.nextLine();
		for (int i=0; i<=numero ;i++) {
			System.out.println(i);
		}
		
	}
	
	public void imprimirNumerosPares() {
		
	}

}
