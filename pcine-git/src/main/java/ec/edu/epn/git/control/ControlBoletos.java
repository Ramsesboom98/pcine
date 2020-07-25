package ec.edu.epn.git.control;

import java.awt.List;
import java.util.ArrayList;

import ec.edu.epn.git.dao.BoletoDAO;
import ec.edu.epn.git.dto.BoletoDTO;
import ec.edu.epn.git.dto.FuncionDTO;
import ec.edu.epn.git.dto.PeliculaDTO;

public class ControlBoletos implements BoletoDAO {
	ArrayList<BoletoDTO> boletos = new ArrayList<BoletoDTO>();
	
	public ControlBoletos() {
		this.boletos= new ArrayList<BoletoDTO>();
	}

	public boolean addBoleto(BoletoDTO boleto) {
		return this.boletos.add(boleto);
	}

	public boolean deleteBoleto(int id) {
		ArrayList<BoletoDTO> data = findAllBoletos();
		return data.remove(findBoletosById(id));
	}

	public boolean updateBoleto(int id, BoletoDTO boleto) {
		ArrayList<BoletoDTO> data = findAllBoletos();
		if(data.set(id, boleto)!=null) {
			return true;
		}		
		return false;
	}

	public ArrayList<BoletoDTO> findAllBoletos() {
		return this.boletos;
	}

	public BoletoDTO findBoletosById(int id) {
		ArrayList<BoletoDTO> data = findAllBoletos();
		for(BoletoDTO boleto: data) {
			if(boleto.getIdBoleto()==id) {
				return boleto;
			}
		}
		return null;
	}

}
