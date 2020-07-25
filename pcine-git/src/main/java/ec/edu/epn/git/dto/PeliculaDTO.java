package ec.edu.epn.git.dto;

public class PeliculaDTO {
	
	private int idPelicula;
	private String nombre;
	private String genero;
	private int año;
	private int duracion;//minutos 
	
	public PeliculaDTO(int idPelicula, String nombre, String genero, int año, int duracion) {
		//super();
		this.idPelicula = idPelicula;
		this.nombre = nombre;
		this.genero = genero;
		this.año = año;
		this.duracion = duracion;
	}
	public PeliculaDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\tNum. Pelicula:  "+(this.idPelicula+1)+"\n\tPelicula: \t"+this.nombre+"\n\tGenero: \t"+this.genero+"\n\tDuracion: \t"+this.duracion+"\n";
	}
	
}
