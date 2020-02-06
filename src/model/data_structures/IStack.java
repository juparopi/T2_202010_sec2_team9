package model.data_structures;

public interface  IStack<T extends Comparable<T>>{
	
	/**
	 * Retornar el numero de elementos presentes en el stack
	 * @return
	 */
	int darTamano( );
	
	/**
	 * Agregar un dato al final del stack 
	 * @param dato nuevo elemento
	 */
	public void push( T dato );
	
	/**
	 * Buscar un dato en el stack.
	 * @param dato Objeto de busqueda en el stack
	 * @return elemento encontrado en el stack (si existe). null si no se encontro el dato.
	 */
	public T buscar(T dato);
	
	/**
	 * Eliminar el ultimo dato del stack.
	 * @param dato Objeto de pop
	 */
	public T pop();
	
	
	public boolean isEmpty();
	
	/**
	 * Entrega el ultimo dato del stack sin sacarlo
	 * @return Dato del stack en ultima parte
	 */
	public T peek();

}