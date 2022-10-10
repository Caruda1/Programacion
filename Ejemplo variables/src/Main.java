
public class Main {
	
	public static void main(String[] args) {
		//declaramos la variable edad
		int edad;
		//declaramos la variable edad de jubilacion
		int edadJubilacion;
		//declaramos la variable que almacenara los años restantes hasta la jubilacion
		int anhosJubilacion;
		
		//inicializamos variables
		edad = 30;
		edadJubilacion = 67;
		
		//calculamos la resta y el resultado lo almacenamos en la variable anhosJubilacion
		anhosJubilacion = edadJubilacion - edad;
		System.out.println("Los años que te faltan para jubilarte son. " + anhosJubilacion);
		
	}

}
