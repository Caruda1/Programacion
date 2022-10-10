
public class Main {
	public static void main (String[]args) {
		int minutos = 60000000;
		int años = 2;
		int dias = 7;
		int minutosEnAno = 60 * 24*365;
		int resultado;
		
		resultado = minutos / minutosEnAno;
		System.out.println("el resultado de la division es:" + resultado);
		
		resultado = (minutos/60/24) / 365;
		System.out.println("El resultado de esta operacion es:" + resultado);
		
	}
}
