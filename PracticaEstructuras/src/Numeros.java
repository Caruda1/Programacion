import java.util.Scanner;

public class Numeros {
	int numero;
	public void imprimirNumerosPrimos() {
		System.out.println("Introduzca un numero entero: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		sc.nextLine();
		boolean esPrimo=false;
		int contador=0;
		System.out.print("Los numeros primos de "+numero+" a cero son: ");
		for (int i=0; i<=numero; i++) {
			if (i == 1 || i == 0 || i == 4)
				continue;
		
			
			esPrimo = true;
			for (int a=2; a<=i / 2; ++a) {
				if (i%a == 0) {
					esPrimo = false;
					continue;
				}
			}
			if ((esPrimo == true)&&(i<=numero)) {
				System.out.print(i+" ");
				contador++;
			}
		}
		System.out.println("");
		System.out.println("Total: "+contador+" primos." );
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
		System.out.println("Introduzca un numero entero: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		sc.nextLine();
		int intervalos=2;
		int contador=0;
		System.out.println("Los numeros pares de "+numero+" a cero son: ");
		for (int i=0; i<=numero; i=i+intervalos) {
			System.out.print(i+" ");
			contador++;
		}
		System.out.println(" ");
		System.out.println("Total: " +contador+ " pares ");
		
	}


		
	}


