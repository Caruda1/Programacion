package estructuraControl2;

public class estructuraControl {
	public static void main(String[]args) {
		
		int numeroHijos = 1;
		boolean familiaMonoparental;
		familiaMonoparental = false;
		
		if (numeroHijos > 2 && familiaMonoparental) {
			System.out.println("La matricula sale gratis");
		}else if (numeroHijos > 3 && ! familiaMonoparental) {
			System.out.println("Tines un descuento en la matricula de u 10%");
		}else {
			System.out.println("Pagas como tol mundo");
			
		}
	}
}
