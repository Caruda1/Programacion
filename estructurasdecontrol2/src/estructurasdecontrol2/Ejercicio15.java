package estructurasdecontrol2;

public class Ejercicio15 {
	public static void main (String[]args) {
		int limite = 7;
		int semilla1 = 0;
		int semilla2 = 1;
		int resultado = 1;
		System.out.print("Serie de fibonacci con limite " +limite+ " y con semilla " +semilla1+ " y " +semilla2+ " es: " +semilla1+ " , ");
		for(int i=0; i<=limite; i++) {
			System.out.print(resultado);
		resultado=semilla1+semilla2;
			
			semilla1=semilla2;
			semilla2=resultado;
			if (i<=(limite-1)) {
				System.out.print(", ");
			}
			
	}
			System.out.print(".");
	}
}
