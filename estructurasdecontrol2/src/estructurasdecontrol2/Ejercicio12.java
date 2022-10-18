package estructurasdecontrol2;

public class Ejercicio12 {
	public static void main (String[]args) {
		int potencia = 5;
		int resultadoP = 2;
		int resultado = 1;
		
		for (int i = 1 ; i<= potencia ; i++) {
		resultado = resultadoP*resultado;
				}
			System.out.println("El resultado de elevar " +resultadoP+ " a " +potencia+ " es: " +resultado);
	
	}

}
