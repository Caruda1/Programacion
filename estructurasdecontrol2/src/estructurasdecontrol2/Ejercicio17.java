package estructurasdecontrol2;

public class Ejercicio17 {
	public static void main (String[]args) {
		int numero1= 3;
		int numero2= 7;
		int resultado =0;
		char operacion= 'x';
		boolean operacionCorrecta= true;
		
		switch (operacion) {
		
		case '+':
			resultado = numero1+numero2;
			break;
		
		case '-':
			resultado = numero1-numero2;
			break;
			
		case 'x':
			resultado = numero1 * numero2;
			break;
			
		case 'X':
			resultado= numero1 * numero2;
			
		case '/':
			resultado= numero1 / numero2;
			break;
		
		case '%':
			resultado = numero1 % numero2;
			break;
		default:
			operacionCorrecta = false;
		}
		if (operacionCorrecta) {
		System.out.println("resultado: " +resultado);
		
	}

	}
	}
