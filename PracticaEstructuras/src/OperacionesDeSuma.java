import java.util.Scanner;

public class OperacionesDeSuma {
	int numero;

	public void operacionesSuma() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un numero entero: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		sc.nextLine();
		for (int i=0; i<=numero; i++) {
			System.out.println(i+ " + "+numero+" + "));
		}
		
		
	}

}
