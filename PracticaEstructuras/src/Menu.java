
public class Menu {
	public void imprimirMenu () {
		do {
		System.out.println("***************Menu**************");
		System.out.println("1. Imprimir los numeros naturales");
		System.out.println("2. Imprimir un triangulo rectangulo con numeros");
		System.out.println("3. Imprimir un triangulo rectangulo invertido con numeros");
		System.out.println("4. suma acumulada");
		System.out.println("5. Imprimir tabla de multiplicar");
		System.out.println("6. numero pares");
		System.out.println("7. Numeros primos");
		System.out.println("8. jugar piedra, papel o tijera");
		System.out.println("9. Salir");
		System.out.println("***********************************");
		System.out.println("Selecciona una opcion de Menu");
		
		Scanner sc = new Scanner(System.in);
		menuElegido = sc.nextInt();
		switch (menuElegido) {

		case 1:{
			Numeros numero = new Numeros();
			numero.imprimeNumerosNaturales();
			break;
		}
		case 2:{
			TriangulodeNumero num = new TriangulodeNumeros();
			num.imprimetriangulo();
			break;
		}
		case 3:{
			TriangulodeNumeros num = new TriangulodeNumeros();
			num.imprimetrianguloinvertido();
			break;
		
		}	
		case 4:{
			
		}
}
}
