package varios;

public class AreaRectangulo {
	public static void main (String[]args) {
		int ladoUno = 5;
		int ladoDos = 8;
		int areaTotal;
		
		areaTotal = calculoArea (ladoUno, ladoDos);
		muestraResultado(areaTotal);
		}
	
	public static int calculoArea (int lado1, int lado2) {
		return lado1 * lado2;
	}
	
	public static void muestraResultado (int resultado) {
		System.out.println("el area calculada es: " +resultado);
	}
	}
