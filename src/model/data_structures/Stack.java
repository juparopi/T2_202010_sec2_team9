package model.data_structures;

public class  Stack<T extends Comparable<T>> implements IStack<T> {

	/**
	 * Capacidad maxima del arreglo
	 */
    private int tamanoMax;
	/**
	 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
	 */
    private int tamanoAct;
    /**
     * Arreglo de elementos de tamaNo maximo
     */
    private T elementos[ ];

    /**
     * Construir un arreglo con la capacidad maxima inicial.
     * @param max Capacidad maxima inicial
     */
	public Stack( )
    {
           elementos = (T[]) new Comparable[1];
           tamanoMax = 8;
           tamanoAct = 0;
    }
    
	public void push( T dato )
    {
           if ( tamanoAct == tamanoMax )
           {  // caso de arreglo lleno (aumentar tamaNo)
                tamanoMax = 2 * tamanoMax;
                T [ ] copia = elementos;
                elementos = (T[]) new Comparable[tamanoMax];
                for ( int i = 0; i < tamanoAct; i++)
                {
                 	 elementos[i] = copia[i];
                } 
        	    System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
           }	
           elementos[tamanoAct] = dato;
           tamanoAct++;
   }

	public int size() {
		return tamanoAct;
	}

	private T darElemento(int i) {
		// TODO implementar
		return elementos[i];
	}

	public T buscar(T dato) {
		// TODO implementar
		// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
		T rta = null;
		for(int i = 0; i < tamanoAct; i++)
		{
			if(dato.compareTo(darElemento(i)) == 0)
			{
				rta = darElemento(i);
			}
		}
		return rta;
	}

	public T pop() {
		T rta = null;
		rta = elementos[tamanoAct-1];
		elementos[tamanoAct-1] = null;
		return rta;
	}

	public boolean isEmpty() {
		return tamanoAct!=0?false:true;
	}

	public T peek() {
		return darElemento(tamanoAct-1);
	}
		
}