package estructuraControl2;

public class estructura6 {
	public static void main(String[]args) {
		 	
		int numero = 44;
		String talla;
		
		//Usamos switch para comprobar a que talla pertenece 
		switch (numero) {
		
		case 29:
			talla = "S";
			break;
			
		case 42:
			talla ="M";
			
		case 44:
			talla = "L";
			
		case 48:
			talla = "XL";
			break;
			
		default:
			talla = "Desconocida";
			break;
		}
		System.out.println("talla:" + talla);
	}
		
}
