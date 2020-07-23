package ec.edu.epn.git.dao;

import java.awt.List;

import ec.edu.epn.git.dto.BoletoDTO;

public interface BoletoDAO {
	
	public boolean addBoleto();
	public boolean deleteBoleto();
	public boolean updateBoleto();
	public List findAllBoletos();
	public BoletoDTO findBoletosById();
	

}
