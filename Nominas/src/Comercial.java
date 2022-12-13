
public class Comercial extends Empleado {
	
	private Double bonus;


	public Comercial(String dni, String nombre, Double sueldo, Double restencion, Double bonus) {
		super(dni, nombre, sueldo, restencion);
		this.bonus = bonus;
	}
	public Double calculaSalario() {
		return this.getSueldo() + this.bonus - this.getRetencion();
	}
}