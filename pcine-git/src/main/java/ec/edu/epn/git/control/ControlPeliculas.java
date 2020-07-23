package ec.edu.epn.git.control;

import java.util.ArrayList;

import ec.edu.epn.git.dao.PeliculaDAO;
import ec.edu.epn.git.dto.PeliculaDTO;

public class ControlPeliculas implements PeliculaDAO {
	ArrayList<PeliculaDTO> peliculas;
	
	public ControlPeliculas() {
		// TODO Auto-generated constructor stub
		this.peliculas = new ArrayList<PeliculaDTO>();
	}
	

	public boolean addPelicula(PeliculaDTO pelicula) {
		// TODO Auto-generated method stub
		return this.peliculas.add(pelicula);
	}

	public boolean deletePelicula(int idPelicula) {
		// TODO Auto-generated method stub
		ArrayList<PeliculaDTO> data = findAllPeliculas();
		int index = 0;
		for(PeliculaDTO pelicula: data) {
			index = data.indexOf(pelicula);
			if(pelicula.getIdPelicula()==idPelicula) {
				data.remove(index);
				return true;
			}
		}
		return false;
		
	}

	public ArrayList<PeliculaDTO> findAllPeliculas() {
		// TODO Auto-generated method stub
		return this.peliculas;
	}


	public boolean updatePelicula(int id, PeliculaDTO pelicula) {
		// TODO Auto-generated method stub
		return false;
	}


	public PeliculaDTO findPeliculaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
