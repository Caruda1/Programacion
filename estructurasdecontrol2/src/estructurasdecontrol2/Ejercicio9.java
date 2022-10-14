package estructurasdecontrol2;

public class Ejercicio9 {
	public static void main (String[]args) {
		int x = 0;
		int y = 0;
		
		if (x>0 && y>0) {
			System.out.println("Pertenece al cuadrante I");
		}else if (x>0 && y<0) {
			System.out.println("Pertenece al cuadrante IV");
		}else if (x<0 && y>0) {
			System.out.println("Pertenece al cuadrante II");
		}else if (x<0 && y<0) {
			System.out.println("Pertenece al cuadrante III");
		}else {
			System.out.println("Pertenece al origen");
			
		
		}
		}

}

