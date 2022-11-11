import java.util.Scanner;

public class TablaMultiplicar {
	int numero;

	public void tablaMultiplicar() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un numero entero: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		sc.nextLine();
		 System.out.println("Tabla del " + numero);
	        for(int i = 1; i<=10; i++){
	             System.out.println(numero + " * " + i + " = " + numero*i);
		
	}
	}
}
