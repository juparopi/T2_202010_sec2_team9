package model.logic;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;
import model.data_structures.IListaEncadenada;
import model.data_structures.ListaEncadenada;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	/**
	 * Atributos del modelo del mundo
	 */
	private IListaEncadenada<Comparendo> datos;
	
	
	/**
	 * Constructor del modelo del mundo
	 */
	public Modelo()
	{
		datos = new ListaEncadenada<Comparendo>();
	}
	
	public void cargarDatos(String ruta)
	{
		JsonGsonProcessing objetoJsonGson = new JsonGsonProcessing( ruta);
		objetoJsonGson.iniciarLectura(objetoJsonGson, datos);
		datos = objetoJsonGson.darLista();
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamano();
	}

	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public Comparendo buscar(Integer dato)
	{
		Comparendo nuevo = new Comparendo(dato, "",0, 0,"","","","");
		return datos.buscar(nuevo);
	}
	
	/**
	 * Retorna el ultimo comparendo en agregarse a la lista
	 * @return ultimo comparendo agregado
	 */
	public Comparendo darUltimo()
	{
		return datos.darUltimo().darElemento();
	}
	
	/**
	 * Retorna el primer comparendo en ser agregado a la lista
	 * @return primer comparendo agregado
	 */
	public Comparendo darPrimero()
	{
		return datos.darPrimero().darElemento();
	}


}