package ec.edu.epn.git.control;
import java.awt.List;
import java.util.ArrayList;

import ec.edu.epn.git.dao.FuncionDAO;
import ec.edu.epn.git.dao.PeliculaDAO;
import ec.edu.epn.git.dto.FuncionDTO;
import ec.edu.epn.git.dto.PeliculaDTO;

public class ControlFunciones implements FuncionDAO {
	ArrayList<FuncionDTO> funciones;
	
	public ControlFunciones() {
		this.funciones = new ArrayList<FuncionDTO>();
	}

	public boolean addFuncion(FuncionDTO funcion) {
		return this.funciones.add(funcion);
	}

	public boolean deleteFuncion() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateFuncion() {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<FuncionDTO> findAllFunciones() {
		// TODO Auto-generated method stub
		return this.funciones;
	}

	public ArrayList<FuncionDTO> findAllFuncionesByIdPelicula(int idPel) {
		ArrayList<FuncionDTO> funcionesPelicula = new ArrayList<FuncionDTO>();
		for (FuncionDTO funcion : this.funciones) {
			if(funcion.getPelicula().getIdPelicula()==idPel) {
				funcionesPelicula.add(funcion);
			}
		}
		// TODO Auto-generated method stub
		return funcionesPelicula;
	}

	public FuncionDTO findFuncionById(int id) {
		ArrayList<FuncionDTO> data = findAllFunciones();
		for(FuncionDTO funcion: data) {
			if(funcion.getIdFuncion()==id) {
				return funcion;
			}
		}
		return null;
	}

	public boolean cambioEstadoAsiento(int a, int b,int id) {
		int aux[][] = findFuncionById(id).getSala().getAsientos();
		if(aux[a][b]==1) {
			return false;
		}else {
			aux[a][b]=1;
			findFuncionById(id).getSala().setAsientos(aux);
			return true;
		}
		
	}
	
}
