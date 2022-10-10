
public class ejercicio13 {
	public static void main (String[] args) {
		float diametro = 2f;
		
		//La formula del cirulo Área = π * D2 / 4
		
		float area = Constantes.PI * (diametro * diametro) / 4;
		System.out.println("El area de la circunferencia con diametro:" + diametro + "es" + area);
	}

}
