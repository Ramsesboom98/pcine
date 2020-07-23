package ec.edu.epn.git;

public class Pelicula {
	
	private String nombre;
	private String genero;	
	
	public Pelicula(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
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
