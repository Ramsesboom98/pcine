package ec.edu.epn.git.dao;

import java.awt.List;

import ec.edu.epn.git.dto.PeliculaDTO;

public interface PeliculaDAO {
	
	public boolean addPelicula();
	public boolean deletePelicula();
	public boolean updatePelicula();
	public List findAllPeliculas();
	public PeliculaDTO findPeliculaById();
	

}
