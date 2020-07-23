package ec.edu.epn.git.control;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ec.edu.epn.git.dto.PeliculaDTO;

public class ControlPeliculasTest {
	private ControlPeliculas control;
	
	@Before
	public void before() {
		this.control = new ControlPeliculas();
		control.addPelicula(new PeliculaDTO(0, "nombre", "genero", 2020, 200));
		control.addPelicula(new PeliculaDTO(1, "nombre", "genero", 2020, 200));
	}
	

	@Test
	public void testAddPelicula() {
		assertTrue(control.addPelicula(new PeliculaDTO(2, "nombre", "genero", 2020, 200)));
	}

	@Test
	public void testDeletePelicula() {
		assertTrue(control.deletePelicula(0));
	}
	

	@Test
	public void testFindAllPeliculas() {
		//fail("Not yet implemented");
		assertEquals(2, control.findAllPeliculas().size());
	}

	@Test
	public void testUpdatePelicula() {
		PeliculaDTO expected= new PeliculaDTO(0, "nombreasdf", "genero", 2020, 200);
		//assertEquals(expected.getIdPelicula() ,control.findPeliculaById(0).getIdPelicula());
		assertTrue(control.updatePelicula(0, expected));
	}

	@Test
	public void testFindPeliculaById() {
		PeliculaDTO expected= new PeliculaDTO(0, "nombre", "genero", 2020, 200);
		assertEquals(expected.getIdPelicula() ,control.findPeliculaById(0).getIdPelicula());
		
	}

}
