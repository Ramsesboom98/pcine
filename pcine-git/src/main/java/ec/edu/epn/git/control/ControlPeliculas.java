package ec.edu.epn.git.control;
import java.util.ArrayList;

import ec.edu.epn.git.dao.PeliculaDAO;
import ec.edu.epn.git.dto.PeliculaDTO;

public class ControlPeliculas implements PeliculaDAO {
	ArrayList<PeliculaDTO> peliculas;
	public ControlPeliculas() {
		this.peliculas = new ArrayList<PeliculaDTO>();
	}
	public boolean addPelicula(PeliculaDTO pelicula) {
		return this.peliculas.add(pelicula);
	}
	public boolean deletePelicula(int idPelicula) {
		ArrayList<PeliculaDTO> data = findAllPeliculas();
		return data.remove(findPeliculaById(idPelicula));
	}
	public ArrayList<PeliculaDTO> findAllPeliculas() {
		return this.peliculas;
	}
	public boolean updatePelicula(int id, PeliculaDTO peliculaup) {
		ArrayList<PeliculaDTO> data = findAllPeliculas();
		if(data.set(id, peliculaup)!=null) {
			return true;
		}		
		return false;
	}
	public PeliculaDTO findPeliculaById(int id) {

		ArrayList<PeliculaDTO> data = findAllPeliculas();
		for(PeliculaDTO pelicula: data) {
			if(pelicula.getIdPelicula()==id) {
				return pelicula;
			}
		}
		return null;
	}	
}
