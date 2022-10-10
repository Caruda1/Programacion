
public class Main {
	public static void main (String[]args) {
		float gradosFarhenheit = 98.6f;
		
		float gradosCelsius;
		
		gradosCelsius = (gradosFarhenheit - Constantes.HERVIR_FAHRENHEIT) / Constantes.CORRECCION_CELSIUS;
		System.out.println("El resultado de esta operacion es:" + gradosCelsius);
	}

}
