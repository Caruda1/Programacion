
public class ejercicio14parte2 {
	public static void main (String[]args) {
		float radio = 2f;
		float gradosGrados = 10f;
		
		//La formula es Área = (π * R2 * α∘) / 36
		
		float area = (Constantes.PI * (radio + radio) * gradosGrados) / 360;
		System.out.println("El area del circulo con radio" + radio+  "y con" +gradosGrados+ "grados del sector es" + area);
	}

}
