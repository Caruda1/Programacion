package estructuraControl2;

public class estructura10 {
	public static void main (String[]args) {
		
		int semanas = 3;
		int dias = 7;
		
		// El for exterior imprimira las semanas
		for (int i = 1; i <= semanas; i++) {
			System.out.println("Semana:" + i);
			//El for interior imprimira los dias
			for (int j = 1; j <= dias; j++) {
				System.out.println(" dia:" +j);
			}
		}
	}

}
