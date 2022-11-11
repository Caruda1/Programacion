import java.util.Scanner;

public class PiedraPapelTijera {
	int numero;
	public void jugarPiedraPapel() {
		// TODO Auto-generated method stub
		System.out.println("¿Piedra, papel o tijera?");
		System.out.println("1. -Piedra");
		System.out.println("2. -Papel");
		System.out.println("3. -Tijera");
		System.out.println("Introduzca un numero entero: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		sc.nextLine();
		
		int opcion=(int) (Math.random()*3+1);
		
		switch (numero) {
		
		case 1:
			if(opcion==1) {
				System.out.println("Has elegido piedra y yo piedra ¡Empate!");
			}else if(opcion==2) {
				System.out.println("Has elegido piedra y yo papel ¡He ganado!");
			}else {
				System.out.println("Has elegido piedra y yo tijera ¡Has ganado!");
			}
			
			break;
			
		case 2:
			if(opcion==1) {
				System.out.println("Has elegido papel y yo papel ¡Empate!");
			}else if(opcion==2) {
				System.out.println("Has elegido papel y yo tijera ¡He ganado!");
			}else {
				System.out.println("Has elegido papel y yo piedra ¡He perdido!");
				
			}
			
			break;
			
		case 3:
			if(opcion==1) {
				System.out.println("Has elegido tijera y yo tijera ¡Empate!");
			}else if(opcion==2) {
				System.out.println("Has elegido tijera y yo piedra ¡He gando!");
			}else {
				System.out.println("Has elegido tijera y yo papel ¡He perdido!");
				
			}
			
			break;
		}
		
		
		
	}

}
