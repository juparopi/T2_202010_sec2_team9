package test.data_structures;

import model.data_structures.ListaEncadenada;
import model.data_structures.NodoLista;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestListaEncadenada<T> {

	private ListaEncadenada lista;
	private static int TAMANO=100;
	
	@Before
	public void setUp1() {
		lista = new ListaEncadenada();
	}

	public void setUp2() {
		for(Integer i =0; i< TAMANO; i++){
			lista.agregar(i);
		}
	}

	@Test
	public void testArregloDinamico() {
		// TODO
		setUp1();
		assertEquals(0, lista.darTamano());
		assertNull(lista.darPrimero());
	}

	@Test
	public void testDarPrimero(){
		setUp2();
		// TODO
		Integer rta = 0;
		assertEquals(rta, lista.darPrimero().darElemento());
	}
	
	@Test
	public void testEliminar(){
		setUp2();
		lista.eliminar(0);
		lista.eliminar(50);
		assertEquals(1, lista.darPrimero().darElemento());
		assertNull(lista.buscar(50));
		}
	@Test
	public void testBuscar(){
		setUp2();
		assertEquals(4, lista.buscar(4));
		assertNull(lista.buscar(150));
	}
	

}