
public class Practica1 {
	public static void main (String[]args) {
		System.out.println("========");
		System.out.println("Ejercicio1");
		System.out.println("========");
		int limite = 10;
		for (int i=0; i<=limite; i++) {
			System.out.println(i);
			i++;
		}
		System.out.println("========");
		System.out.println("Ejercicio2");
		System.out.println("========");
		int saltos=3;
		
		for (int i=0; i <=limite; i=i+saltos) {
			System.out.println(i);
			}
		System.out.println("========");
		System.out.println("Ejercicio3");
		System.out.println("========");
		for (int a = 10; a >= 1; a--) {
			System.out.print(a+" ");
		}	
		int i = 10;
		while (i >=1) {
			System.out.print(i+" ");
		i--;
		}
		int b = 10;
		do {
		System.out.print(b+" ");
		b--;
		}
		while (b >= 1);
		
		{
			System.out.println();
			{
		}
			System.out.println("========");
			System.out.println("Ejercicio5");
			System.out.println("========");
			  int max = 10;


		        for(int x = 2; x <= max; x++){
		            for(int i1 = 2; i1 < x; i1++){
		                if(x % i1 == 0)
		                    break;
		                else System.out.println(x + " es un número primo");
		}
		            System.out.println("========");
					System.out.println("Ejercicio7");
					System.out.println("========");
					int num = 5;
					for (int x1 = 0; x1 < num; x1++) {
					for (int o = 0; o < num; o++) {
						System.out.print(num);
					}
					System.out.println();
					}
					
}
		}
	}
}


