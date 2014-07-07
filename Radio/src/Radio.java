
public class Radio {
	private Boolean banda;
	private int estacionAM[];
	private double estacionFM[];
	private int contadorFM;
	private int contadorAM;
	private int posicionAM;
	private int posicionFM;
	private int estacionActualAM;
	private double estacionActualFM;
	
	public Radio(){
	estacionAM = new int [100];
	estacionFM = new double [100];
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
	
	
}
