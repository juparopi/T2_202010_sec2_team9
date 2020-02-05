package test.data_structures;

import model.data_structures.ArregloDinamico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArregloDinamico<T>{

	private ArregloDinamico arreglo;
	private static int TAMANO=100;
	
	@Before
	public void setUp1() {
		arreglo= new ArregloDinamico(TAMANO);
	}

	public void setUp2() {
		for(int i =0; i< TAMANO*2; i++){
			arreglo.agregar(""+i);
		}
	}

	@Test
	public void testArregloDinamico() {
		// TODO
		setUp1();
		assertEquals(TAMANO, arreglo.darCapacidad());
		assertEquals(0, arreglo.darTamano());
		assertNull(arreglo.darElemento(0));
	}

	@Test
	public void testDarElemento() {
		setUp2();
		// TODO
		assertEquals("3", arreglo.darElemento(3));
		assertEquals("150", arreglo.darElemento(150));
	}

}