import java.util.Scanner;

public class OperacionesDeSuma {
	int numero;


	public void operacionesSuma() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un numero entero: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		sc.nextLine();
		int resultado=0;
		for (int i=0; i<=numero; i++) {
			System.out.print(i+ " + ");
			resultado= resultado+i;
		}
		System.out.println(" = "+resultado);
		
		
	}

}
