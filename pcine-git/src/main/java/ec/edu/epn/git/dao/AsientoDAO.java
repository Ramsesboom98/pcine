package ec.edu.epn.git.dao;

import java.awt.List;

import ec.edu.epn.git.dto.AsientoDTO;
import ec.edu.epn.git.dto.PeliculaDTO;

public interface AsientoDAO {
	
	public boolean addAsiento();
	public boolean deleteAsiento();
	public boolean updateAsiento();
	public List findAllAsientos();
	public AsientoDTO findAsientoById();
	

}
