package ec.edu.epn.git.view;

import ec.edu.epn.git.control.ControlPeliculas;
import ec.edu.epn.git.dao.PeliculaDAO;
import ec.edu.epn.git.dto.PeliculaDTO;

public class PeliculaView {	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		PeliculaDAO cPelicula = new ControlPeliculas();
		
		System.out.println("**CREATE**\n");
		//int idPelicula, String nombre, String genero, int año, int duracion
		System.out.println(cPelicula.addPelicula(new PeliculaDTO(0,"Sonic","Comedia",2020,120)));
		System.out.println(cPelicula.addPelicula(new PeliculaDTO(1,"IT-4","Comedia",2020,320)));
		System.out.println(cPelicula.addPelicula(new PeliculaDTO(2,"Sonic-2","Drama",2020,120)));
		imprimirPeliculas(cPelicula);
		
		System.out.println("**UPDATE**");
		cPelicula.updatePelicula(1, new PeliculaDTO(1,"IT-4","Terror",2020,320));
		
		imprimirPeliculas(cPelicula);
		
		System.out.println("**DELETE**\n");
		
		cPelicula.deletePelicula(2);
		imprimirPeliculas(cPelicula);
		
		System.out.println("**Busqueda por id**");
		System.out.println(cPelicula.findPeliculaById(0));
		
	}
	public static void imprimirPeliculas(PeliculaDAO cPelicula ) {
		System.out.println("\n**Listado peliculas disponibles**\n");
		for (PeliculaDTO pel : cPelicula.findAllPeliculas()) {
			System.out.println(pel);
		}
	}
	

}



/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeliculaDAO cPelicula = new ControlPeliculas();
		
		System.out.println("**CREATE**\n");
		//int idPelicula, String nombre, String genero, int año, int duracion
		System.out.println(cPelicula.addPelicula(new PeliculaDTO(0,"Sonic","Comedia",2020,120)));
		System.out.println(cPelicula.addPelicula(new PeliculaDTO(1,"IT-4","Comedia",2020,320)));
		System.out.println(cPelicula.addPelicula(new PeliculaDTO(2,"Sonic-2","Drama",2020,120)));
		imprimirPeliculas(cPelicula);
		
		System.out.println("**UPDATE**\n");
		cPelicula.updatePelicula(1, new PeliculaDTO(1,"IT-4","Terror",2020,320));
		
		imprimirPeliculas(cPelicula);
		
		System.out.println("**DELETE**\n");
		
		cPelicula.deletePelicula(2);
		imprimirPeliculas(cPelicula);
		
		System.out.println("**Busqueda por id**");
		System.out.println(cPelicula.findPeliculaById(0));
		

	}
	public static void imprimirPeliculas(PeliculaDAO cPelicula ) {
		System.out.println("\n**Listado peliculas disponibles**\n");
		for (PeliculaDTO pel : cPelicula.findAllPeliculas()) {
			System.out.println(pel);
		}
		
	}
*/
