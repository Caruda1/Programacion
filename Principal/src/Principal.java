
public class Principal {

	public static void main(String args[]) {
		int primerNumero = 20;
		int segundoNumero = 5;

		int resultado;

		resultado = primerNumero + segundoNumero;
		System.out.println("La suma de los numeros es:" + resultado);
		System.out.println("Tambien se podria hacer asi, sin acumular el resultado en una veriable: "
				+ (primerNumero + segundoNumero));

		// La variable puede cambiar de valor
		resultado = primerNumero * segundoNumero;
		System.out.println("La multiplicacion de los dos numero es:" + resultado);

		resultado = primerNumero / segundoNumero;
		System.out.println("La division de los dos numeros es: " + resultado);

		resultado = primerNumero % segundoNumero;
		System.out.println("El resto de los dos numero es: " + resultado);

		// Diferencia entre ++primerNumero++
		System.out.println("Cuando no forman parte de una expresion el resultado es el mismo: ");
		++primerNumero; // Incrementa e uno la variable
		System.out.println("Valor de la variable primerNumero: " + primerNumero);
		primerNumero++;
		System.out.println("Valor de la variable primerNumero: " + primerNumero);
		
		//Pero cuando parte de una expresion la posicion del operador decidira si el valor se
		//incrementa (o decrementa) antes o despues de la evaluacion de la expresion
		primerNumero = 20; //volvemos a darle el valor de 20
		System.out.println(primerNumero);
		resultado = primerNumero - ++segundoNumero; // 20 - ( ++5 ), es decir, 20 - 6
		System.out.println("Resultado de la expresion: " + resultado);
		System.out.println("Valor de la variable segundoNumero: " + segundoNumero);
		
		//Comparar con esto:
		segundoNumero = 5; //Le volvemos a dar a la variable segundoNumero su valor original
		resultado = primerNumero - segundoNumero++; //  20 - 5 = 4 y despues de hacer la operacion suma 1 a la variable segundoNumero
		System.out.println("resultado de la expresion:" + resultado);
		System.out.println("Valor de la variable segundoNumero:" + segundoNumero);
		
		//Operadores relacionales. Con estos podremos tomar decisiones en el programa (lo veremos en un tema posterior)
		
		System.out.println("Resultado de comprar si primerNumero y segundoNumero son iguales: " + (primerNumero == segundoNumero));
		System.out.println("Resultado de comprar si primerNumero es mayor que segundoNumero:" + (primerNumero > segundoNumero));
		System.out.println("Resultado de comprar si primerNumero es menor que segundoNumero:" + (primerNumero < segundoNumero));
		System.out.println("resultado de comprar si primerNumero y segundoNumero son diferentes: " + (primerNumero != segundoNumero));
		
		//OPERACIONES DE ASIGNACION
		segundoNumero = primerNumero;
		System.out.println("Ahora segundoNumero vale lo mismo que primerNumero: " + segundoNumero);
		
		segundoNumero +=primerNumero; //Es equivalente a hacer segundoNumero = segundoNumero + primerNumero (20 + 20)
		System.out.println("Valor de la variable segundoNumero: " + segundoNumero);
		
		segundoNumero -= primerNumero; //Es equivalente a hacer segundoNumero = segundoNumero - primerNumero (40 - 20)
		System.out.println("Valor de la variable segundoNumero; " + segundoNumero);
		
		segundoNumero /= primerNumero; //Es equivalente a hacer segundoNumero / primerNumero (20/20)
		System.out.println("Valor de la variable segundoNumero: " + segundoNumero);
		
		segundoNumero *= primerNumero; //Es equivalente a hacer segundoNumero = segundoNumero * primerNumero (1 * 20)
		System.out.println("Valor de la variable segundoNumero: " + segundoNumero);
		
	}
}