package ec.edu.epn.git;

public class Pelicula {
	
	private String nombre;
	private String genero;
	private int a�o;
	
	public Pelicula(String nombre, String genero, int a�o) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.a�o = a�o;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
