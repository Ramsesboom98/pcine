package ec.edu.epn.git.dto;

import java.util.Date;

public class FuncionDTO {
	private int idFuncion;
	private String tipo;//seria 2d o 3d
	private String fechaFunc;
	private String hora; //14h00
	private PeliculaDTO pelicula;
	private SalaDTO sala;
	
	
	
	public FuncionDTO(int idFuncion, String tipo, String dechaFunc, String hora, PeliculaDTO pelicula, SalaDTO sala) {
		super();
		this.idFuncion = idFuncion;
		this.tipo = tipo;
		this.fechaFunc = dechaFunc;
		this.hora = hora;
		this.pelicula = pelicula;
		this.sala = sala;
	}
	
	public int getIdFuncion() {
		return idFuncion;
	}
	public void setIdFuncion(int idFuncion) {
		this.idFuncion = idFuncion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDechaFunc() {
		return fechaFunc;
	}
	public void setDechaFunc(String dechaFunc) {
		this.fechaFunc = dechaFunc;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public PeliculaDTO getPelicula() {
		return pelicula;
	}
	public void setPelicula(PeliculaDTO pelicula) {
		this.pelicula = pelicula;
	}
	public SalaDTO getSala() {
		return sala;
	}
	public void setSala(SalaDTO sala) {
		this.sala = sala;
	}
	//\n
	@Override
	public String toString() {
		
		return "\nFuncion: "+(idFuncion+1)+"\n"+pelicula+sala+ "\nFecha y hora: "+fechaFunc+" "+hora;
	}
	

}
