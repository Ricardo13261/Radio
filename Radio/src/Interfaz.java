 /**
   * @InterfazGrafica.java  1.0 06/07/2014
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 21 Estructura de Datos
   * Autor: Brandon M�ndez Carn�: 13087
   *		Ricardo Franco Carn�: 13261
   *		Samuel Maldonado Carn�: 13153
   * Interfaz: posee todos los metodos utilizados para el buen funcionamiento
   *
   */

public interface Interfaz{
	/**
	  * Cambia la frecuencia de un radio comun
	  * */
	public void cambiarFrecuencia();
	
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
}



