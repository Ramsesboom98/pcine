package ec.edu.epn.git.view;

import ec.edu.epn.git.control.ControlPeliculas;
import ec.edu.epn.git.dao.PeliculaDAO;
import ec.edu.epn.git.dto.PeliculaDTO;

public class PeliculaView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeliculaDAO pelicula = new ControlPeliculas();
		
		System.out.println("**CREATE**\n");
		//int idPelicula, String nombre, String genero, int año, int duracion
		System.out.println(pelicula.addPelicula(new PeliculaDTO(0,"Sonic","Comedia",2020,120)));
		System.out.println(pelicula.addPelicula(new PeliculaDTO(1,"IT-4","Comedia",2020,320)));
		System.out.println(pelicula.addPelicula(new PeliculaDTO(2,"Sonic-2","Drama",2020,120)));
		
		System.out.println("\n**Listado peliculas disponibles**\n");
		for (PeliculaDTO pel : pelicula.findAllPeliculas()) {
			System.out.println(pel);
		}
		
		System.out.println("");
		

	}

}
