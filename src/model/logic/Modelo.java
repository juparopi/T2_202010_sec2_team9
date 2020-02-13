package model.logic;

import com.sun.media.sound.AlawCodec;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

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
	
	public IQueue<Comparendo> requerimiento2()
	{
		IQueue<Comparendo> maximos = new Queue();
		IQueue<Comparendo> analizada = new Queue();
		int max = 0;
		int numAna = 1;
		String infraccionAna = queue.peek().darInfraccion();
		while(queue.isEmpty() == false)
		{
			Comparendo comparendo = queue.dequeue();
			if (comparendo.darInfraccion().equals(infraccionAna))
			{
				analizada.enqueue(comparendo);
				numAna++;
			}
			else 
			{
				if(numAna>max)
				{
					maximos = analizada;
					max = numAna;
					analizada = new Queue();
					infraccionAna = comparendo.darInfraccion();
					analizada.enqueue(comparendo);
					numAna++;
				}
			}
		}
		if(numAna>max)
		{
			maximos = analizada;
		}
		return maximos;
	}

}