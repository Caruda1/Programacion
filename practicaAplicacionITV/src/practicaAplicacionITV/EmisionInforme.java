package practicaAplicacionITV;

public class EmisionInforme {
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
	}else if (v.getrevisionPasada()&& v.getrevisionSuperada()) {
		emision.imprimeDeficienciasLeves(v);
	} else if (v.getrevisionPasada()&& !v.getrevisionSuperada()) {
		emision.imprimeDeficienciasGraves(v);
	}
	System.out.println("");
	System.out.println("");
	System.out.println("Precio ITV------->" +v.calculaPrecioITV());
	System.out.println("");
	System.out.println("");
	}
	private void imprimeDeficienciasLeves(Vehiculo v) {
		if (v.getDeficienciasLeves()==null) {
			System.out.println("No hay deficiencias leves.");
			System.out.println("ITV superada");
	}else {
		System.out.println("Deficiencias leves: " +v.getDeficienciasLeves());
		System.out.println("ITV superada");
	}
	}
	private void imprimeDeficienciasGraves(Vehiculo v) {
		if (v.getDeficienciasLeves()==null) {
			System.out.println("ITV NO superada");
			System.out.println("Deficiencias graves: " +v.getDeficienciasGraves());
		}else {
			System.out.println("ITV no superada");
			System.out.println("Deficiencias graves: " +v.getDeficienciasGraves());
			System.out.println("Deficiencias Leves: " +v.getDeficienciasLeves());
		}
	}
	}
		
	


