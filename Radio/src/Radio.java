 /**
   * @Radio.java  1.0 07/07/2014
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 21 ED
   * Autor: Brandon Méndez Carné: 13087
   *
   * Radio: clase que tiene las caracteristicas de cualquier Radio
   *
   */

public class Radio implements Interfaz {

	/*ATRIBUTOS*/		
	private boolean encendido, frecuencia;											//Dice si esta encendido a apagado y la frecuencia AM o FM	
	private double favoritos[],fm;													//Arreglos Am y FM que contendran las frecuencias.
	private double am;																	//AM que contendra las estaciones en esa frecuencia

	/**
	  * Constructor que recibe todos los atributos y que el usuario le asigna valores. 
	  * @param encendido
	  * @param frecuencia
	  * @param favoritos
	  * @param fm
	  * @param am
	  * */
	public Radio(boolean encendido, boolean frecuencia, double[] favoritos, double fm, double am) {
		this.encendido = encendido;
		this.frecuencia = frecuencia;
		this.favoritos = favoritos;
		this.fm = fm;
		this.am = am;
	}
	/**
	  * Constructor que no recibe ningun parametro y que asigna los elementos comunes de un Radio
	  * */
	public Radio() {
		frecuencia=false;
		encendido=true;
		fm = 87.9;
		am = 530.0;
		favoritos=new double[12];
	}
	
	/**
	  * cambia la frecuencia a su valor logico contrario
	  * */
	public void cambiarFrecuencia(boolean frecuencia){
		this.frecuencia=!frecuencia;
	}

	/**
	  * Apaga el radio
	  * */
	public void apagar(){
		encendido=false;
	}
	
	/**
	  * Enciende El radio
	  * */
	public void encender(){
		encendido=true;
	}
	
	/**
	  * Guarda en una posicion especifica de la lista de favoritos
	  * @param boton: boton que esta apachando el usuario
	  * @param estacion: estacion actual que se guardara
	  * */
	public void guardar(int boton, double estacion){
		favoritos[boton-1]=estacion;												//coloca la estacion en el boton -1 ya que el arreglo empieza en 0
	}
	
	/**
	  * Baja la estacion dependiendo de la frecuencia en que se encuentre
	  * */
	public double bajarEstacion(){
		
		if(frecuencia){																//Si frecuencia es True es AM
			if (am==530){															//Si se esta en la primera posicion
				return am=1610;														//Se regresa a la ultima para hacer la vuelta
			}else{																	//sino se sigue bajando de estacion	
			return am-=10;															
			}		
		}else{																		//si la frecuencia es FM
			if (fm==87.9){															//Se verifica que si esta en la primera posicion
				return fm=107.9;													//Regrese a la ultima para que de la vuelta
			}else{																	//sino sigue bajando de estacion
				return fm-=0.2;
			}
		}
	}
	
	/**
	  * Sube la estacion dependiendo de la frecuencia en donde se encuentre el radio
	  * */
	public double subirEstacion(){
		
		if(frecuencia){																//Si frecuencia es True es AM
			if (am==1610){															//Si esta en la posicion mal alto
				return am=530;														//Baja a la mas baja para dar la vuelta
			}else{																	//Sino sigue subiendo de estacion	
			return am+=10;
			}		
		}else{																		//Si la frecuencia es FM
			if (fm==107.9){															//Si esta en la posicion mas alta
				return fm=87.9;														//Baja a la posicion mas baja para dar la vuelta
			}else{																	//Sino sigue subiendo de estacion
				return fm+=0.2;
			}
		}
	}
	
	
	/**
	  * Saca una emisora del arreglo de favoritos
	  * @param boton: en que posicion del arreglo
	  * */
	public double sacar(int boton){
		return favoritos[boton-1];
	}

	
	/**
	  * Sets y gets de la clase
	  * */
	public boolean getEncendido() {
		return encendido;
	}

	public boolean getFrecuencia() {
		return frecuencia;
	}

	public double getEstacionFM() {
		return fm;
	}

	public double getEstacionAM() {
		return am;
	}
	//Fin del programa
}
	
