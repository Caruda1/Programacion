package estructurasdecontrol2;

public class Ejercicio7 {
	public static void main(String[] args) {
		int primerLado = 8;
		int segundoLado = 10;
		int tercerLado = 8;

		if (primerLado == segundoLado && primerLado == tercerLado) {
			System.out.println(" Son equilateros ");
		} else if (primerLado == tercerLado || primerLado == segundoLado || segundoLado == tercerLado) {
			System.out.println("el triangulo es isosceles");
		} else {
			System.out.println("El triangulo es escaleno");

		}

	}
}
