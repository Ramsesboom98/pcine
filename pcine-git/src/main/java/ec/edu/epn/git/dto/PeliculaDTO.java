package ec.edu.epn.git.dto;

public class PeliculaDTO {
	
	private String nombre;
	private String genero;
	private int año;
	
	public PeliculaDTO(String nombre, String genero, int año) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.año = año;
	}
	public PeliculaDTO() {
		// TODO Auto-generated constructor stub
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
