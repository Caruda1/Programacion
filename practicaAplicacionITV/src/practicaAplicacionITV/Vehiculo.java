package practicaAplicacionITV;

import java.util.Scanner;

public class Vehiculo {
	Scanner sc = new Scanner(System.in);
	private String matricula;
	private String modelo;
	private String caballos;
	private String combustible;
	private String deficienciasLeves;
	private String deficienciasGraves;
	private boolean revisionPasada;
	private boolean revisionSuperada;

	public Vehiculo (String matricula, String modelo, String caballos, String combustible) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.caballos = caballos;
		this.combustible = combustible;
		System.out.println("Cliente con matricula "+matricula+" , modelo: "+modelo+" , caballos: "+caballos+" y combustible: "+combustible);	
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public String getCaballos() {
		return caballos;
	}
	public void setCaballos(String caballos) {
		this.caballos=caballos;
	}
	public String getCombustible() {
		return combustible;		
	}
	public void setCombustible(String combustible) {
		this.combustible=combustible;
	}
	public String getDeficienciasLeves() {
		return deficienciasLeves;
	}
	public void setDeficienciasLeves(String deficienciasLeves) {
		this.deficienciasLeves=deficienciasLeves;
	}
	public String getDeficienciasGraves() {
		return deficienciasGraves;
	}
	public void setDeficienciasGraves(String deficienciasGraves) {
		this.deficienciasGraves=deficienciasGraves;
	}
	public boolean getrevisionPasada() {
		return revisionPasada;
	}
	public void setrevisionPasada(boolean revisionPasada) {
		this.revisionPasada=revisionPasada;
	}
	public boolean getrevisionSuperada() {
		return revisionSuperada;
	}
	public void setrevisionSuperada(boolean revisionSuperada) {
		this.revisionSuperada=revisionSuperada;
	}
	public void calculaPrecioITV() {
		double valor;
		int caballosInt=Integer.parseInt(caballos);
		if (combustible.equalsIgnoreCase("Gasolina")) {
			if(caballosInt<=60) {
				valor=30;
			}else if (caballosInt>60&&caballosInt<=120) {
				valor=50;
			}else if (caballosInt>120&&caballosInt<=140) {
				valor=55;
			}else {
				valor=100;
			}
		}else {
			if(caballosInt<=60) {
				valor=30*1.3;
			}else if (caballosInt>60&&caballosInt<=120) {
				valor=50*1.3;
			}else if (caballosInt>120&&caballosInt<=140) {
				valor=55*1.3;
			}else {
				valor=100*1.3;
			
			}
		}
	}
	}
