package ec.edu.epn.git.dao;

import java.awt.List;
import java.util.ArrayList;

import ec.edu.epn.git.dto.BoletoDTO;

public interface BoletoDAO {
	
	public boolean addBoleto(BoletoDTO boleto);
	public boolean deleteBoleto(int id);
	public boolean updateBoleto(int id, BoletoDTO boleto);
	public ArrayList<BoletoDTO> findAllBoletos();
	public BoletoDTO findBoletosById(int id);

}
