
public class Constantes2 {
	public static void constantes2(String[] args) {
		
		float gradosFarhenheit = 98.6f; // Los tipos float los tenemos que declarar con una f junto al numero
		
		float gradosCentigrados;
		
		gradosCentigrados = (gradosFarhenheit - Constantes.GRADOS_CONGELACION_FAHRENHEIT) * Constantes.CORRECCION_CRECIMIENTO;
		
		System.out.println(gradosFarhenheit + " grados farhenheit son: " + gradosCentigrados + " grados centigrados ");
		
	}
}
