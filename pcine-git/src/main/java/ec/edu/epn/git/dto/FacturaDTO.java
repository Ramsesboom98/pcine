package ec.edu.epn.git.dto;

import java.util.ArrayList;

public class FacturaDTO {
	private int idFactura;
	private ArrayList<BoletoDTO> listaBoletos;
	private String nombre,cedula,direccion,correo,telefono;
	private double valorTolal;
	public FacturaDTO(int idFactura, ArrayList<BoletoDTO> listaBoletos, String nombre, String cedula, String direccion,
			String correo, String telefono, double valorTolal) {
		super();
		this.idFactura = idFactura;
		this.listaBoletos = listaBoletos;
		this.nombre = nombre;
		this.cedula = cedula;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.valorTolal = valorTolal;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public ArrayList<BoletoDTO> getListaBoletos() {
		return listaBoletos;
	}
	public void setListaBoletos(ArrayList<BoletoDTO> listaBoletos) {
		this.listaBoletos = listaBoletos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public double getValorTolal() {
		return valorTolal;
	}
	public void setValorTolal(double valorTolal) {
		this.valorTolal = valorTolal;
	}
	
	
}
