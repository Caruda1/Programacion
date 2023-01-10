
public class Calculos {
	public void calculaMedia (int[]numeros) {
			int suma = 0;
			for(int valor : numeros) {
				suma += valor;
	}
			System.out.println("La media es: " +suma/numeros.length);
			}
		public void calculaProducto(int[]numeros) {
			int producto =1;
			for(int i=0; i< numeros.length; i++) {
				producto *=numeros[i];
			}
			System.out.println("El producto es: " +producto);
}
}
