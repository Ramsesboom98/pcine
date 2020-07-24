package ec.edu.epn.git.dto;

public class SalaDTO {
	private int id;
	private int capacidad;
	private int[][] asientos;	
	
	public SalaDTO(int id, int capacidad, int[][] asientos) {
		super();
		this.id = id;
		this.capacidad = capacidad;
		this.asientos = asientos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int[][] getAsientos() {
		return asientos;
	}
	public void setAsientos(int[][] asientos) {
		this.asientos = asientos;
	}
	//private void vaciarSala() {}
	

}
