package ec.edu.epn.git.dao;

import java.awt.List;

import ec.edu.epn.git.dto.FuncionDTO;
import ec.edu.epn.git.dto.PeliculaDTO;

public interface FuncionDAO {
	
	public boolean addFuncion();
	public boolean deleteFuncion();
	public boolean updateFuncion();
	public List findAllFunciones();
	public FuncionDTO findFuncionById();
	

}
