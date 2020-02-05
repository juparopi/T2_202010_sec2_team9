package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(Integer i =0; i< CAPACIDAD;i++){
			modelo.agregar(i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO
		assertEquals(0, modelo.darTamano());
		setUp2();
		assertEquals(CAPACIDAD, modelo.darTamano());
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
		setUp2();
		assertEquals(CAPACIDAD, modelo.darTamano());
	}

	@Test
	public void testBuscar() {
		setUp2();
		// TODO Completar la prueba
		Integer prueba = CAPACIDAD-1;
		Integer prueba2 = CAPACIDAD;
		assertEquals(prueba,modelo.buscar((CAPACIDAD-1)));
		assertNotEquals(prueba2, modelo.buscar(CAPACIDAD));
	}

	@Test
	public void testEliminar() {
		setUp1();
		setUp2();
		// TODO Completar la prueba
		Integer prueba = 2;
		modelo.eliminar(2);
		assertNotEquals(prueba, modelo.buscar(2));
		assertEquals(CAPACIDAD-1, modelo.darTamano());
		
	}

}