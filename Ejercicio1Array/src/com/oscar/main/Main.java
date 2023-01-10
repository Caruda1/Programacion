package com.oscar.main;

import java.util.Scanner;

public class Main {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		int [] numeros = new int [5];
		int numero;
		for (int i=0; i<5; i++) {
			System.out.println("Introduzca el numero, porfavor");
			 numero = sc.nextInt();
		sc.nextLine();
			numeros[i] = numero;
		}
		int suma =0;
		for (int i=0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		System.out.println(suma / numeros.length);
		
		int producto = 1;
		
		for (int i=0; i<numeros.length; i++) {
			producto *= numeros[i];
		}
		System.out.println("el producto es: " +producto);
//		producto = 1;
//		for (int valor : numeros) {
//			producto = producto * valor;
//			
//		}
//		Calculos calculos = new Calculos();
	//	
//		calculos.calculosMedia(numeros);
	//}
	}
//		Solicitar al usuario el número de números que quiere introducir.
		Scanner sc = new Scanner (System.in);
		int numero;
		System.out.println("Cuantos numeros quiere introducir?");
		numero=sc.nextInt();
		sc.nextLine();
//		Crear un array del tamaño indicado por el usuario.
		int [] numeros = new int [numero];
//		resto de funcionalidades
		for (int i=0; i<numero; i++) {
			System.out.println("Introduzca el numero, porfavor");
			 numero = sc.nextInt();
		sc.nextLine();
			numeros[i] = numero;
		}
	
}
	

}

