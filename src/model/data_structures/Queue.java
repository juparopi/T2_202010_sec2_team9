package model.data_structures;

public class Queue <T extends Comparable<T>> implements IQueue<T>{

	
	private int tamano;
	private NodoLista<T> primero;
	private NodoLista<T> ultimo;
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.tamano;
	}

	@Override
	public NodoLista<T> peek() {
		// TODO Auto-generated method stub
		return primero;
	}

	@Override
	public NodoLista<T> darUltimo() {
		// TODO Auto-generated method stub
		return ultimo;
	}

	@Override
	public void enqueue(T dato) {
		// TODO Auto-generated method stub
		NodoLista<T> nuevo = new NodoLista<T>(dato);
		if(primero == null){
			primero = nuevo;
			ultimo = nuevo;
			this.tamano++;
		}else{
			ultimo.cambiarSiguiente(nuevo);
			ultimo = ultimo.darSiguiente();
			this.tamano++;
		}
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		T aDevolver = null;
		if(primero != null){
			aDevolver = primero.darElemento();
			primero = primero.darSiguiente();
			this.tamano--;
		}
		
		return aDevolver;
	}

	@Override
	public T buscar(T dato) {
		// TODO Auto-generated method stub
		T encontrado = null;
		int i = 0;
		boolean encontro = false;
		NodoLista<T> corredor = primero;
		while(i < tamano && !encontro){
			if(corredor.darElemento()==dato){
				encontro = true;
				encontrado = corredor.darElemento();
			}
			i++;
		}
		return encontrado;
	}
	
	public boolean isEmpty(){
		boolean ans = false;
		if(tamano == 0){
			ans = true;
		}
		return ans;
	}

	
}
