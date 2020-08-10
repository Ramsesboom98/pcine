package ec.edu.epn.git.control;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ec.edu.epn.git.dto.BoletoDTO;
import ec.edu.epn.git.dto.FuncionDTO;
import ec.edu.epn.git.dto.PeliculaDTO;
import ec.edu.epn.git.dto.SalaDTO;

public class ControlBoletosTest {
	private ControlBoletos control;
	
	@Before
	public void before() {
		this.control = new ControlBoletos();
	//BoletoDTO(int idBoleto ,double precio, String fechaEmision, FuncionDTO funcion, String asiento)
		control.addBoleto(new BoletoDTO(0, 5.80 , "fechaEmision", 
				new FuncionDTO(0, "2D", "12-08-2020", "13H00",  new PeliculaDTO(0,"Sonic","Comedia",2020,120), new SalaDTO(0, 8, 15)), "A1"));
		control.addBoleto(new BoletoDTO(1, 5.80 , "fechaEmision", 
				new FuncionDTO(0, "2D", "12-08-2020", "13H00",  new PeliculaDTO(0,"Sonic","Comedia",2020,120), new SalaDTO(0, 8, 15)), "A2"));
	}

	@Test
	public void testAddBoleto() {
		assertTrue(control.addBoleto(new BoletoDTO(2, 5.80 , "fechaEmision", 
				new FuncionDTO(0, "2D", "12-08-2020", "13H00",  new PeliculaDTO(0,"Sonic","Comedia",2020,120), new SalaDTO(0, 8, 15)), "A3")));
	}

	@Test
	public void testDeleteBoleto() {
		assertTrue(control.deleteBoleto(0));
	}

	@Test
	public void testUpdateBoleto() {
		BoletoDTO update = new BoletoDTO(1, 5.80 , "fechaEmision", 
				new FuncionDTO(0, "2D", "12-08-2020", "13H00",  new PeliculaDTO(0,"Sonic","Comedia",2020,120), new SalaDTO(0, 8, 15)), "B2");
		//assertTrue(control.updateBoleto(1, update));
		assertTrue(false);
	}

	@Test
	public void testFindAllBoletos() {
		assertEquals(2, control.findAllBoletos().size());
	}

	@Test
	public void testFindBoletosById() {
		BoletoDTO expected = new BoletoDTO(2, 5.80 , "fechaEmision", 
				new FuncionDTO(0, "2D", "12-08-2020", "13H00",  new PeliculaDTO(0,"Sonic","Comedia",2020,120), new SalaDTO(0, 8, 15)), "C2");
		control.addBoleto(expected);
		assertEquals(expected,control.findBoletosById(2));
	}

}
