package controller;

import java.util.Scanner;

import javax.swing.JFileChooser;

import java.io.*;

import model.logic.Comparendo;
import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;
	
	/* Instancia de la Vista*/
	private View view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}
		
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		Integer dato = null;
		Integer respuesta = null;

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
				case 1:
					view.printMessage("--------- \nSe realiza la carga de los comparendos: ");
					String ruta = "./data/comparendos_dei_2018.geojson";   // Comparendos totales
					//String ruta = "./data/comparendos_dei_2018_small.geojson";     //Prueba comparendos
					modelo.cargarDatos(ruta);
				    view.printMessage("\nLista creada....");
				    view.printMessage("\nNumero actual de comparendos " + modelo.darTamano());
				    Comparendo prim = modelo.darPrimero();
				    view.printMessage("\nPrimer comparendo es: \nOnjectId ="+prim.darObjectId()+", localidad = "+prim.darLocalidad()+", longuitud = "+prim.darLonguitud()+", latitud = "+prim.darLatitud()+", Fecha :"+prim.darFecha()+", Clase Vehiculo :"+prim.darClaseVehi()+", Tipo Servicio : "+prim.darTipoServi()+", Inraccion : "+prim.darInfraccion());
				    Comparendo ult = modelo.darUltimo();
				    view.printMessage("\nEL ultimo comparendo es: \nOnjectId ="+ult.darObjectId()+", localidad = "+ult.darLocalidad()+", longuitud = "+ult.darLonguitud()+", latitud = "+ult.darLatitud()+", Fecha :"+ult.darFecha()+", Clase Vehiculo :"+ult.darClaseVehi()+", Tipo Servicio : "+ult.darTipoServi()+", Inraccion : "+ult.darInfraccion()+"\n------------");
					break;

				case 2:
					view.printMessage("--------- \nDar ObjectID que desea buscar: ");
					dato = lector.nextInt();
					Comparendo comp = modelo.buscar(dato);
					if(comp == null)
					{
						view.printMessage("\nNo existe un comparendo con ese ObjectId\n---------");
					}
					else
					{
						view.printMessage("\nComparendo encontrado:\nOnjectId ="+comp.darObjectId()+", localidad = "+comp.darLocalidad()+", longuitud = "+comp.darLonguitud()+", latitud = "+comp.darLatitud()+", Fecha :"+comp.darFecha()+", Clase Vehiculo :"+comp.darClaseVehi()+", Tipo Servicio : "+comp.darTipoServi()+", Inraccion : "+comp.darInfraccion()+"\n---------");
					}
											
					break;

			}
		}
		
	}	
}