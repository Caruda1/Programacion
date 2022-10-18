package estructurasdecontrol2;

public class ejercicio4 {
	public static void main(String[] args) {
		int año = 2022;

		if (año % 400 == 0) {
			System.out.println("El año es bisiesto");
		} else if (año % 4 == 0 && año % 100 != 0) {
			System.out.println(" El año es bisiesto si:");
		} else {
			System.out.println("El año no es bisiesto");

		}
	}
}