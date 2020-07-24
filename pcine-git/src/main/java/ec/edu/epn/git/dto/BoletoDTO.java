package ec.edu.epn.git.dto;

import java.sql.Date;

public class BoletoDTO {
	
	private double precio;
	private Date FechaEmision;
	private FuncionDTO funcion;
	private String asiento;
	
	public BoletoDTO(double precio, Date fechaEmision, FuncionDTO funcion, String asiento) {
		super();
		this.precio = precio;
		FechaEmision = fechaEmision;
		this.funcion = funcion;
		this.asiento = asiento;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Date getFechaEmision() {
		return FechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		FechaEmision = fechaEmision;
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
	
	

}


/*LISTAR LAS PELICULAS*/