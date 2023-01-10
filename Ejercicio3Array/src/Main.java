
public class Main {
	public static void main(String[]args) {
		int[] numeros = new int[] {28, 98, 128, 73, 217};
		int mayor = numeros[0];
		for (int i=1; i<numeros.length; i++) {
			if (numeros[i]>mayor) {
				mayor = numeros[i];
			}
		
		System.out.println("El mayor es: " +mayor);		
	}
	int[] numeros1 = new int[] {38, 89, 674, 974, 98, 2};
	int menor = numeros1[0];
	for (int i=1; i>numeros1.length; i++) {
		if (numeros1[i]<menor) {
			menor = numeros1[i];			
		}
		System.out.println("EL menor es: " +menor);
}
}
}        
