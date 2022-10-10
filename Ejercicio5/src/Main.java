
public class Main {
	public static void main (String[] args) {
		int primerNumero = 5;
		int segundoNumero = 8;
		int tercerNumero = 6;
		int cuartoNumero = 55;
		int quintoNumero = 9;
		int sextoNumero = 20;
		int septimoNumero = 15;
		int octavoNumero = 2;
		int novenoNumero = 3;
		int decimoNumero = -5;
		int onceavoNumero = -3;
		int cuartoquintoNumero = 64;
		
		int resultado;
		
		resultado = decimoNumero + segundoNumero;
		System.out.println("La suma de los dos numero es:" + resultado);
		resultado = decimoNumero + segundoNumero * tercerNumero;
		System.out.println("El resultado de estas operaciones es:" + resultado);
		
		resultado = cuartoNumero + quintoNumero;
		System.out.println("la suma de estos dos numero es:" + resultado);
		resultado = cuartoquintoNumero % quintoNumero;
		System.out.println("la division estos dos numero es:" + resultado);
		
		resultado = sextoNumero + onceavoNumero * primerNumero / segundoNumero;
		System.out.println("El resultado de estas operacion:" + resultado);
		
		resultado = primerNumero + septimoNumero / novenoNumero * octavoNumero % novenoNumero;
		System.out.println("El resultado de estas operaciones:" + resultado);
		
		
		
		
	}

}
