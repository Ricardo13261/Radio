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
public class Interfaz {
	private int estacionAM[];
	private double estacionFM[];
	private double favoritos[];
	private int contadorFM;
	private int contadorAM;
	private int posicionAM;
	private int posicionFM;
	private int estacionActualAM;
	private double estacionActualFM;
	
	public Interfaz(){
	estacionAM = new int [150];       //array de estaciones AM
	estacionFM = new double [150];		//array de estaciones FM
	favoritos= new double [15]; 			//array de favoritos
	contadorFM=0;
	contadorAM=0;
	posicionAM= 0;
	posicionFM= 0;
	estacionActualAM=0;
		for(double i=87.9;i<=107.9;i+=0.2){
			estacionFM[contadorFM]=i;
			contadorFM++;
			}
		for(int j=530;j<=1610;j+=10){
			estacionAM[contadorAM]=j;
			contadorAM++;
		}
	}
	
	public int SeleccionoAM(){
		if(posicionAM >108){
			posicionAM=0;
			estacionActualAM=estacionAM[posicionAM];
			posicionAM++;
			return estacionActualAM;
		}else{
			estacionActualAM=estacionAM[posicionAM];
			posicionAM++;
			return estacionActualAM;
		}
	}
	
	public double SeleccionoFM(){
		if(posicionFM>100){
			posicionFM=0;
			estacionActualFM=estacionFM[posicionFM];
			posicionFM++;
			return estacionActualFM;
		}else{
			estacionActualFM=estacionFM[posicionFM];
			posicionFM++;
			return estacionActualFM;	
		}
	}
	
	public void Guardar(boolean apachado, int numero,boolean banda){
		if (apachado==true && banda==true){  	//si apachado = true, el usuario guardo 
												//si banda =true FM
			favoritos[numero]=estacionActualFM;
			
		}else{									//de lo contrario AM
			favoritos[numero]=estacionActualAM;
		}
	}
	
	public double Mostrar(boolean reproducir, int numero){
			//el usuario quiere reproducir la emisora del favorito que el escogio
			return favoritos[numero];
		
	}
	public void apagar(){
		System.out.println("APAGANDO..");
	}
	public void encender(){
		System.out.println("HOLA JEFE :D");
	}
	
}

