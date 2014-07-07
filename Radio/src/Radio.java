
public class Radio {
	private Boolean banda;
	private int estacionAM[];
	private double estacionFM[];
	private int contadorFM;
	private int contadorAM;
	
	public Radio(){
	estacionAM = new int [100];
	estacionFM = new double [100];
	contadorFM=0;
	contadorAM=0;
		for(double i=87.9;i<=107.9;i+=0.2){
			estacionFM[contadorFM]=i;
			contadorFM++;
			}
		for(int j=530;j<=1610;j+=10){
			estacionAM[contadorAM]=j;
			contadorAM++;
		}
		
	}
}
