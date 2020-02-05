package model.data_structures;

public class NodoLista <T extends Comparable<T>> 
{
	/**
	 * Elemento que esta contenido en el nodo de la lista
	 */
	private T elemento;
	
	/**
	 * Siguiente nodo en la lista. Null si es el ultimo
	 */
	private NodoLista<T> siguiente;
	
	/**
	 * Se contruye el nodo conteniendo el elemento y sin siguiente
	 * @param pElemento elemento que esta contenido en el nodo
	 */
	public NodoLista(T pElemento)
	{
		elemento = pElemento;
		siguiente = null;
	}
	
	/**
	 * Cambia el siguiente nodo por el recibido por parametro
	 * @param pProximo nuevo Nodo siguiente
	 */
	public void cambiarSiguiente(NodoLista<T> pProximo)
	{
		siguiente = pProximo;
	}
	
	
	/**
	 *  Da el siguiente nodo del nodo actual.
	 * @return siguiente nodo. Null si no hay
	 */
	public NodoLista<T> darSiguiente()
	{
		return siguiente;
	}
	
	/**
	 * Da el elemento que esta contenido en el nodo
	 * @return elemento del nodo
	 */
	public T darElemento()
	{
		return elemento;
	}
		
	
}
