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
	
	
	EmisionInforme emision=new EmisionInforme();
	
	if (!v.getrevisionPasada()) {
		System.out.println("Todavia no ha pasado la ITV");
	}else if (v.getrevisionPasada()&& v.getrevisionSuperada());
		emision.imprimeDeficienciasLeves(v);
	} else if (v.getrevisionPasada()&& !v.getrevisionSuperada());
		emision.imprimeDeficienciasGraves(v);
	}
}
	private void imprimeDeficienciasGraves(Vehiculo v) {
		
	}
	private void imprimeDeficienciasLeves(Vehiculo v) {
		
	


