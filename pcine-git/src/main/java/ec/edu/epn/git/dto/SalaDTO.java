package ec.edu.epn.git.dto;

public class SalaDTO {
	private int id;
	private int capacidadF,capacidadC;
	private int[][] asientos;
	
	
	public SalaDTO(int id, int capacidadF, int capacidadC) {
		super();
		this.id = id;
		this.capacidadF = capacidadF;
		this.capacidadC = capacidadC;
		this.asientos = new int[capacidadF][capacidadC];
		this.vaciarSala();	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacidadF() {
		return capacidadF;
	}
	public void setCapacidadF(int capacidadF) {
		this.capacidadF = capacidadF;
	}
	public int getCapacidadC() {
		return capacidadC;
	}
	public void setCapacidadC(int capacidadC) {
		this.capacidadC = capacidadC;
	}
	public int[][] getAsientos() {
		return asientos;
	}
	public void setAsientos(int[][] asientos) {
		this.asientos = asientos;
	}	
	
	
	private void vaciarSala() {
		for (int i = 0; i < this.asientos.length; i++) {
			for (int j = 0; j < this.asientos[i].length; j++) {
				this.asientos[i][j]=0;				
			}
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Sala: "+(this.id+1);
	}

}
