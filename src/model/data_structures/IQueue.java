package model.data_structures;

public interface IQueue <T extends Comparable<T>>{
	
	public int size();
	
	public NodoLista<T> peek();
	
	public NodoLista<T> darUltimo();
	
	public void enqueue(T dato);
	
	public T dequeue( );
	
	public T buscar(T dato);
	
	public boolean isEmpty();

}