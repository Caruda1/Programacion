package libreria2;

public class Libro {
		
		private String titulo;
		private String autor;
		private float precio;

	public Libro(String titulo, String autor, float precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutro(String autor) {
		this.autor = autor;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float convertirEurosADolares(float euros) {
		return euros * 1.15f;
	}
}
                  