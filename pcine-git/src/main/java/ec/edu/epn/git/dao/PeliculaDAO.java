package ec.edu.epn.git.dao;

import java.awt.List;
import java.util.ArrayList;

import ec.edu.epn.git.dto.PeliculaDTO;

public interface PeliculaDAO {
	
	public boolean addPelicula(PeliculaDTO pelicula);
	public boolean deletePelicula(int id);
	public boolean updatePelicula(int id, PeliculaDTO pelicula);
	public ArrayList<PeliculaDTO> findAllPeliculas();
	public PeliculaDTO findPeliculaById(int id);
	

}
