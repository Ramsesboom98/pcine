package ec.edu.epn.git.control;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ec.edu.epn.git.dto.FuncionDTO;
import ec.edu.epn.git.dto.PeliculaDTO;
import ec.edu.epn.git.dto.SalaDTO;

public class ControlFuncionesTest {
	private ControlFunciones control;
	
	@Before
	public void before() {
		this.control = new ControlFunciones();
		control.addFuncion(new FuncionDTO(0, "2D", "12-08-2020", "13H00",  new PeliculaDTO(0,"Sonic","Comedia",2020,120), new SalaDTO(0, 8, 15)));
		control.addFuncion(new FuncionDTO(1, "2D", "12-08-2020", "17H00",  new PeliculaDTO(0,"Sonic","Comedia",2020,120), new SalaDTO(0, 8, 15)));
		
	}

	@Test
	public void testAddFuncion() {
		assertTrue(control.addFuncion(new FuncionDTO(2, "2D", "12-08-2020", "13H00",  new PeliculaDTO(0,"Sonic","Comedia",2020,120), new SalaDTO(2, 8, 15))));
	}

	@Test
	public void testDeleteFuncion() {
		assertTrue(control.deleteFuncion(0));
	}

	@Test
	public void testUpdateFuncion() {
		FuncionDTO updt = new FuncionDTO(0, "3D", "12-08-2020", "19H00",  new PeliculaDTO(0,"Sonic","Comedia",2020,120), new SalaDTO(2, 8, 15));
		assertTrue(control.updateFuncion(0, updt));
	}

	@Test
	public void testFindAllFunciones() {
		assertEquals(2, control.findAllFunciones().size());
	}

	@Test
	public void testFindAllFuncionesByIdPelicula() {
		assertEquals(2, control.findAllFuncionesByIdPelicula(0).size());
	}

	@Test
	public void testFindFuncionById() {
		FuncionDTO expected = new FuncionDTO(2, "2D", "12-08-2020", "11H00",  new PeliculaDTO(0,"Sonic","Comedia",2020,120), new SalaDTO(0, 8, 15));
		control.addFuncion(expected);
		assertEquals(expected,control.findFuncionById(2));
	}

	@Test
	public void testCambioEstadoAsiento() {
		// cambioEstadoAsiento(int a, int b,int id) 		
		assertTrue(control.cambioEstadoAsiento(1, 1, 0));
	}

}
