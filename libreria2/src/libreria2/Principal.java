package libreria2;

import java.util.zip.CRC32;

public class Principal {
	public static void main(String[]args) {
		
		Cliente c1 = new Cliente("Oscar", 18, "Mallorca");
		Cliente c2 = new Cliente("Pedro", 18, "CiudadReal");
		Cliente c3 = new Cliente("Juenito", 18, "Canarias");
		c1.setNombre ("Jose");
		c1.setEdad (-5);
		System.out.println("El nombre del cliente 1 es " +c1.getNombre()+ " y la de edad es  " +c1.getEdad());
		
		Libro libro1 = new Libro("Los minioms " , " PEPIYO ", 40);
		Libro libro2 = new Libro("PEPEPIG", " Dani " , 30);
		System.out.println("El precio del libro en dolars es de: " +libro1.convertirEurosADolares(20.0f));
		
		c1.darDeAltaCliente();
		c2.darDeAltaCliente();
		c3.darDeAltaCliente();
		
		System.out.println("El descuento a aplicar al cliente: " +c1.getNombre()+ "es: " +c1.calculaDescuento());
		
		c1.registraCompra(libro1);
		
		
		
		
				
	}

}
