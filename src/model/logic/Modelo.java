package model.logic;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;
import model.data_structures.IListaEncadenada;
import model.data_structures.IQueue;
import model.data_structures.IStack;
import model.data_structures.ListaEncadenada;
import model.data_structures.Queue;
import model.data_structures.Stack;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	/**
	 * Atributos del modelo del mundo
	 */
	private IStack<Comparendo> stack;
	private IQueue<Comparendo> queue;
	
	
	/**
	 * Constructor del modelo del mundo
	 */
	public Modelo()
	{
		queue = new Queue();
		stack = new Stack();
	}
	
	public void cargarDatos(String ruta)
	{
		JsonGsonProcessing objetoJsonGson = new JsonGsonProcessing( ruta);
		objetoJsonGson.iniciarLectura(objetoJsonGson, stack,queue);
		stack = objetoJsonGson.darStack();
		queue = objetoJsonGson.darQueue();
	}
	
	public IStack<Comparendo> darStack()
	{
		return stack;
	}
	
	public IQueue<Comparendo> darQueue()
	{
		return queue;
	}

}