package model.logic;

public class Comparendo implements Comparable<Comparendo>
{
	/**
	 * Identificador numericom del comparendo. Se usa en el compareTo
	 */
	private int objectId;
	
	/**
	 * Localidad en la que se crea el comparendo
	 */
	private String localidad;
	
	/**
	 * Coordenada 1, longuitud
	 */
	private double longuitud;
	
	/**
	 * Coordenada 2, latitud
	 */
	private double latitud;
	
	public Comparendo(int ob, String loc, double lon, double lat)
	{
		objectId = ob;
		localidad = loc;
		longuitud = lon;
		latitud = lat;
	}
	
	/**
	 *  Retorna el objectId
	 * @return ObjectId del comparendo
	 */
	public int darObjectId()
	{
		return objectId;
	}
	
	/**
	 *  Retorna la localidad
	 * @return localidad del comparendo
	 */	
	public String darLocalidad()
	{
		return localidad;
	}
	
	/**
	 *  Retorna la latitud
	 * @return latitud del comparendo
	 */
	public double darLatitud()
	{
		return latitud;
	}
	
	/**
	 *  Retorna la longuitud
	 * @return longuitud del comparendo
	 */
	public double darLonguitud()
	{
		return longuitud;
	}
	

	public int compareTo(Comparendo o) 
	{
		return (o.darObjectId()-objectId);
	}
}
