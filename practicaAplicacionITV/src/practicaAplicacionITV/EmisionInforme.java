package practicaAplicacionITV;

import java.util.Scanner;

public class EmisionInforme {
	Scanner sc = new Scanner(System.in);
	public void emiteInforme(Vehiculo v, Propietario p) {
	System.out.println("******************* INFORME ITV*********************");
	System.out.println("****************************************************");
	System.out.println("*****************Datos del propietario**************");
	System.out.println("");
	System.out.println("DNI: " +p.getDni());
	System.out.println("Apellido: " +p.getApellido());
	System.out.println("Nombre: " +p.getNombre());
	System.out.println("");
	System.out.println("****************************************************");
	System.out.println("******************Datos del vehiculo****************");
	System.out.println("****************************************************");
	System.out.println("Matricla: " +v.getMatricula());
	System.out.println("Modelo: " +v.getModelo());
	System.out.println("Caballos: " +v.getCaballos());
	System.out.println("Tipo de combustible: " +v.getCombustible());
	System.out.println("");
	System.out.println("*****************************************************");
	System.out.println("*******************DAtos de la ITV*******************");
	System.out.println("*****************************************************");
	System.out.println("ITV NO SUPERADA" +v.getrevisionSuperada());
	
	}
	private void imprimeDeficienciasGraves(Vehiculo vehiculo) {
		
	}
	private void imprimeDeficienciasLeves(Vehiculo vehiculo) {
		
	}
}

