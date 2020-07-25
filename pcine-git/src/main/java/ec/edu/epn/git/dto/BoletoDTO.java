package ec.edu.epn.git.dto;

import java.sql.Date;

public class BoletoDTO {
	
	private int idBoleto;
	private double precio;
	private String fechaEmision;
	private FuncionDTO funcion;
	private String asiento;
	
	public BoletoDTO(int idBoleto ,double precio, String fechaEmision, FuncionDTO funcion, String asiento) {
		super();
		this.idBoleto=idBoleto;
		this.precio = precio;
		this.fechaEmision = fechaEmision;
		this.funcion = funcion;
		this.asiento = asiento;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(String fechaEmision) {
		fechaEmision = fechaEmision;
	}
	public FuncionDTO getFuncion() {
		return funcion;
	}
	public void setFuncion(FuncionDTO funcion) {
		this.funcion = funcion;
	}
	public String getAsiento() {
		return asiento;
	}
	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}
	
	public int getIdBoleto() {
		return idBoleto;
	}
	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Boleto: "+idBoleto+"\nPrecio: "+precio+"\nFecha de Emision: "+fechaEmision+funcion+"\nAsiento: "+asiento.toUpperCase();
	}

}


/*LISTAR LAS PELICULAS*/