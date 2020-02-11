package model.data_structures;

public class Stack<T extends Comparable<T>> implements IStack<T> {

	/**
	 * Capacidad maxima del arreglo
	 */
	private int tamanoMax;
	/**
	 * Numero de elementos presentes en el arreglo (de forma compacta desde la
	 * posicion 0)
	 */
	private int tamanoAct;
	/**
	 * Arreglo de elementos de tamaNo maximo
	 */
	private ArregloDinamico<T> elementos;

	/**
	 * Construir un arreglo con la capacidad maxima inicial.
	 * 
	 * @param max
	 *            Capacidad maxima inicial
	 */
	public Stack() {
		tamanoMax = 8;
		tamanoAct = 0;
		elementos = new ArregloDinamico<T>(tamanoMax);
	}

	public void push( T dato )
	{
		elementos.agregar(dato);
		tamanoAct++;
	}

	public int size() {
		return tamanoAct;
	}

	public T buscar(T dato) {
		return elementos.buscar(dato);
	}

	public T pop() {
		T rta = null;
		rta = elementos.darElemento(tamanoAct-1);
		elementos.eliminarUltimo();
		return rta;
	}

	public boolean isEmpty() {
		return tamanoAct != 0 ? false : true;
	}

	public T peek() {
		return elementos.darElemento(tamanoAct - 1);
	}

}