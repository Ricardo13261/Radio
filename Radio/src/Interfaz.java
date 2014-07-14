/**
* @Interfaz.java  1.0 06/07/2014
*
* Universidad del Valle de Guatemala.
* Seccion: 21 Estructura de datos
* Autor: Brandon Méndez Carné: 13087
*
* Interfaz: Clase que tiene las funcionalidades de un radio
*/
   
public interface Interfaz{
	/**
	  * Cambia la frecuencia de un radio comun
	  * */
	public void cambiarFrecuencia(boolean frecuencia);
	
	/**
	  * Apaga un radio
	  * */
	public void apagar();
	
	/**
	  * Enciende un radio
	  * */
	public void encender();
	
	/**
	  * Guarda una estacion en una lista especifica de un radio
	  * @param boton: el boton en donde quiere que se guarde
	  * @param la estacion que quiere guardar
	  * */
	public void guardar(int boton, double estacion);
	
	/**
	  * Baja la estacion de un radio en cualquier frecuencia
	  * */
	public double bajarEstacion();
	
	/**
	  * Sube la estacion de un radio en cualquier frecuencia
	  * */
	public double subirEstacion();
	
	/**
	  * Saca una estacion guardada en una lista con un cierto indice que lo dictamino el boton
	  * @param boton: donde esta guardada la estacion
	  * */
	public double sacar(int boton);
	
	/**
	  * Obtiene la frecuencia (Am o FM)
	  * */
	public boolean getFrecuencia();
	
	/**
	  * Obtiene el estado Encendido true o apagado false
	  * */
	public boolean getEncendido();
	
	/**
	  * Obtiene la estacion en AM
	  * */
	public double getEstacionAM();

	/**
	  * Obtiene la estacion en fM
	  * */
	public double getEstacionFM();
	
}



