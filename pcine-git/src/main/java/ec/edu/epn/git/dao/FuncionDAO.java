package ec.edu.epn.git.dao;

import java.awt.List;
import java.util.ArrayList;

import ec.edu.epn.git.dto.FuncionDTO;
import ec.edu.epn.git.dto.PeliculaDTO;

public interface FuncionDAO {
	
	public boolean addFuncion(FuncionDTO funcion);
	public boolean deleteFuncion();
	public boolean updateFuncion();
	public boolean cambioEstadoAsiento(int a,int b,int id);
	public ArrayList<FuncionDTO> findAllFunciones();
	public ArrayList<FuncionDTO> findAllFuncionesByIdPelicula(int idPel);
	public FuncionDTO findFuncionById(int id);
	
}
