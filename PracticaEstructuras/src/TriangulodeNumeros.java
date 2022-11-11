import java.util.Scanner;

public class TriangulodeNumeros {
	int numero;

	public void imprimetriangulo() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca el numero de filas: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.nextLine();
		for ( int i=1; i<=numero; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
		public void imprimeTrianguloInvertido() {
			
		
		System.out.println("Introduzca el numero de filas: ");
		Scanner sc1= new Scanner(System.in);
		numero = sc1.nextInt();
		sc1.nextLine();
		for (int i=1; i<=numero; i++) {
			for (int j=numero; j>=i; j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
	}

}
