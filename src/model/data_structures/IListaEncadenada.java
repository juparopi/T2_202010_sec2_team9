package model.data_structures;

public interface  IListaEncadenada<T extends Comparable<T>> {

	/**
	 * Retornar el tamaño de la lista
	 * @return Cantidad de nodos
	 */
	int darTamano( );

	/**
	 * Retornar el primer nodo
	 * @return Primer nodo de la lista, null si no existe
	 */
	public NodoLista<T> darPrimero( );
	
	/**
	 * Retornar el ultimo nodo
	 * @return Ultimo nodo de la lista, null si no existe
	 */
	public NodoLista<T> darUltimo( );

	/**
	 * Agregar nodo 
	 * @param dato nuevo elemento
	 */
	public void agregar( T dato );
		
	/**
	 * Buscar un dato en la lista
	 * @param dato Objeto de busqueda en la lista
	 * @return elemento encontrado en el arreglo (si existe). null si no se encontro el dato.
	 */
	public T buscar(T dato);
	
	/**
	 * Eliminar un dato de la lista
	 * @param dato Objeto de eliminacion en el arreglo
	 * @return dato eliminado, null si no se encontro dato a eliminar
	 */
	public T eliminar( T dato );

}