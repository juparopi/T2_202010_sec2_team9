package controller;

import java.util.Scanner;

import javax.swing.JFileChooser;

import java.io.*;

import model.data_structures.IQueue;
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
					//String ruta = "./data/comparendos_dei_2018.geojson";   // Comparendos totales
					String ruta = "./data/comparendos_dei_2018_small.geojson";     //Prueba comparendos
					modelo.cargarDatos(ruta);
				    view.printMessage("\nStack creado....");
				    view.printMessage("\nQueue creada....");
				    view.printMessage("\nNumero actual de comparendos " + modelo.darQueue().size());
				    Comparendo prim = modelo.darQueue().peek().darElemento();
				    view.printMessage("\nPrimer comparendo de la cola es: \nOnjectId ="+prim.darObjectId()+", localidad = "+prim.darLocalidad()+", longuitud = "+prim.darLonguitud()+", latitud = "+prim.darLatitud()+", Fecha :"+prim.darFecha()+", Clase Vehiculo :"+prim.darClaseVehi()+", Tipo Servicio : "+prim.darTipoServi()+", Infraccion : "+prim.darInfraccion());
				    Comparendo ult = modelo.darStack().peek();
				    view.printMessage("\nEL ultimo comparendo en el stack es: \nOnjectId ="+ult.darObjectId()+", localidad = "+ult.darLocalidad()+", longuitud = "+ult.darLonguitud()+", latitud = "+ult.darLatitud()+", Fecha :"+ult.darFecha()+", Clase Vehiculo :"+ult.darClaseVehi()+", Tipo Servicio : "+ult.darTipoServi()+", Infraccion : "+ult.darInfraccion()+"\n------------");
					break;

				case 2:
					IQueue<Comparendo> cola = modelo.requerimiento2();
					view.printMessage("\nEl numero maximo de comparendos seguidos con la misma infraccion es "+cola.size()+" y son:");
					for(int i = 0; i< cola.size();i++)
					{
						Comparendo comp = cola.dequeue();
						view.printMessage("\n Infraccion : "+comp.darInfraccion()+", OnjectId ="+comp.darObjectId()+", Fecha :"+comp.darFecha()+", Clase Vehiculo :"+comp.darClaseVehi()+", Tipo Servicio : "+comp.darTipoServi()+", Localidad : "+comp.darLocalidad());
					}
					break;

			}
		}
		
	}	
}