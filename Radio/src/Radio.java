
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


public class Radio {
	public Radio() {
		super();
	}


	//Atributos		
	private boolean encendido;		//Dice si esta encendido a apagado
	private boolean sintonia;		//Indica si esta en AM o FM
	private int favoritos[];
	private int indicefav;			//dice en que posicion de la lista favoritos se esta
	private double arreglofm[], arregloam[];	//Arreglos Am y FM que contendran las sintonias.
	
	
	//Constructores
	public Radio(boolean encendido, boolean sintonia, int[] favoritos,
			int indicefav, double[] arreglofm, double[] arregloam) {
		super();
		this.encendido = encendido;
		this.sintonia = sintonia;
		this.favoritos = favoritos;
		this.indicefav = indicefav;
		this.arreglofm = arreglofm;
		this.arregloam = arregloam;
	}


	public boolean isEncendido() {
		return encendido;
	}


	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}


	public boolean isSintonia() {
		return sintonia;
	}


	public void setSintonia(boolean sintonia) {
		this.sintonia = sintonia;
	}


	public int[] getFavoritos() {
		return favoritos;
	}


	public void setFavoritos(int[] favoritos) {
		this.favoritos = favoritos;
	}


	public int getIndicefav() {
		return indicefav;
	}


	public void setIndicefav(int indicefav) {
		this.indicefav = indicefav;
	}


	public double[] getArreglofm() {
		return arreglofm;
	}


	public void setArreglofm(double[] arreglofm) {
		this.arreglofm = arreglofm;
	}


	public double[] getArregloam() {
		return arregloam;
	}


	public void setArregloam(double[] arregloam) {
		this.arregloam = arregloam;
	}
	
	
}