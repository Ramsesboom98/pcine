package ec.edu.epn.git.dao;

import java.awt.List;

import ec.edu.epn.git.dto.FacturaDTO;
import ec.edu.epn.git.dto.PeliculaDTO;

public interface FacturaDAO {
	
	public boolean addFactura();
	public boolean deleteFactura();
	public boolean updateFactura();
	public List findAllFacturas();
	public FacturaDTO findFacturaById();
	

}
