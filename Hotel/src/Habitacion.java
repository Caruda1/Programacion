import java.util.Scanner;

public class Habitacion {
	Scanner sc = new Scanner(System.in);
	private int numeroHabitacion;
	private int numeroPlanta;
	private boolean ocupada;
	
	public Habitacion (int numeroHabitacion, int numeroPlanta, boolean ocupada) {
		this.numeroHabitacion= numeroHabitacion;
		this.numeroPlanta = numeroPlanta;
		this.ocupada = false;
		System.out.println("Introduzca los datos para crear una habitacion......");
	}
	public int getnuemroHabitacion() {
		return numeroHabitacion;
	}
	public void setnumeroHabitacion(int numeroHabitacion) {
		System.out.println("Introduzca el numero de habitacion: "+this.numeroHabitacion);
	}
	public int getnumeroPlanta() {
		return numeroPlanta;
	}
	public void setnumeroPlanta(int numeroPlanta) {
		System.out.println("Introduzca el numero de planta: "+this.numeroPlanta);
	}
	{
	System.out.println("La habitacion con numero: "+this.numeroHabitacion+" en planta: "+this.numeroPlanta+" ha sido creada.");
}
}