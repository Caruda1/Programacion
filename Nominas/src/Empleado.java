
public class Empleado {
	private String dni;
	private String nombre;
	private Double sueldo;
	private Double retencion;
	
	public void altaEmpleado() {
		System.out.println("dando de alta al empleado: "+nombre);
	}
	public Double calculaSalario() {
		return this.sueldo - this.retencion;
	}
	public Empleado(String dni, String nombre, Double sueldo, Double retencion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.retencion = retencion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public Double getRetencion() {
		return retencion;
	}
	public void setRetencion(Double retencion) {
		this.retencion = retencion;
	}
	
}
