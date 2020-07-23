package ec.edu.epn.git.dao;

import java.awt.List;

import ec.edu.epn.git.dto.PeliculaDTO;
import ec.edu.epn.git.dto.SalaDTO;

public interface SalaDAO {
	
	public boolean addSala();
	public boolean deleteSala();
	public boolean updateSala();
	public List findAllSalas();
	public SalaDTO findSalaById();
	

}
