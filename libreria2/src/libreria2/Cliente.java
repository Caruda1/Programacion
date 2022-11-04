package libreria2;

public class Cliente {
	
	private String nombre;
	private int edad;
	private String ciudad;
	
	public Cliente(String nombre, int edad, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
	}
	public float calculaDescuento() {
		if (edad < 20){
			return 4.5f;
		}
		return 3.0f;
	}
	public void darDeAltaCliente() {
		System.out.println("Cliente dado de alte en la BBDD");
	}
	public void registraCompra(Libro libro) {
		System.out.println("Compra registrada: " +libro.getTitulo());
	}
	public Cliente() {
		// Codigo a ejecutar cuando se cree un objeto Cliente
		System.out.println("Creando un objeto Cliente...");
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if (edad < 0) {
			this.edad = 15;
		}else {
			this.edad = edad;
		}
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
}