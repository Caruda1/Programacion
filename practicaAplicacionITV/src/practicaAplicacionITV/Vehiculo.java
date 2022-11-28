package practicaAplicacionITV;

public class Vehiculo {
	private String matricula;
	private String modelo;
	private String caballos;
	private String combustible;
	private String deficienciasLeves;
	private String deficienciasGraves;
	boolean revisionPasada;
	boolean revisionSuperada;
	public Object imprimirVehiculo;

	public Vehiculo (String matricula, String modelo, String caballos, String combustible) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.caballos = caballos;
		this.combustible = combustible;
		System.out.println("Cliente con matricula "+matricula+" , modelo: "+modelo+" , caballos: "+caballos+" y combustible: "+combustible);	
	}
	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		System.out.println("Introduzca la matricula: "+this.matricula);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		System.out.println("Introduzca el modelo: "+this.modelo);
	}
	public String getCaballos() {
		return caballos;
	}
	public void setCaballos(String caballos) {
		System.out.println("Introduzca los caballos: "+this.caballos);
	}
	public String getCombustible() {
		return combustible;		
	}
	public void setCombustible(String combustible) {
		System.out.println("Introduzca su combustible: "+this.combustible);
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
