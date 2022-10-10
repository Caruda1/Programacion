package estructuraControl2;

public class estructuras12 { 
	public static void main(String[]args) {
		
		int n = 10;
		while (n > 0) {
			n--;
			if (n == 1 || n == 5) {
				
				continue;
				/*
				 * no se ejecutaria el bloque de programacion que esta despues del if, se
				 * continua con la siguiente recepcion
				 */
			}
			System.out.println("El valor de n es:" + n);
			
		}
}

}
