 /**
   * @InterfazGrafica.java  1.0 06/07/2014
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 21 Estructura de Datos
   * Autor: Brandon M�ndez Carn�: 13087
   *		Ricardo Franco Carn�: 13261
   *		Samuel Maldonado Carn�: 13153
   * Interfaz gr�fica: Gestiona los eventos del radio
   *
   */
//Importando librerias de java.
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class InterfazGrafica extends JPanel 
							  implements ActionListener{
	/**ATRIBUTOS**/
	private static JFrame frame,frameControl;										//frame principal de la GUI y frame de control de errores.
	private JButton apagar,next, prev,addfav,uno, dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce, cambiarfrecuencia;					//BOTONES PARA LOS REQUISITOS DEL Radio	
	private static String  comapag="Apagar radio.",comaddfav="Agregar a favoritos.",comnext="Subir estacion",comprev="Bajar estacion";				//Comandos para controlar eventos
	private static String comuno="uno",comdos="dos",comtres="tres",comcuatro="cuatro",comcinco="cinco",comseis="seis",comsiete="siete",comocho="ocho",comnueve="nueve",comdiez="diez",comonce="once",comdoce="doce",comcambiarfrecuencia="cambiar frecuencia";
	private Radio radio;															//Atributo de tipo radio para tener sus caracteristicas
	private JLabel lb,lblfrecuencia;												//Label que sirvio para un panel, para mostrar que esta sonando y la frecuencia.
	private double estacionact;														//Contiene la estacion actual en un double

	 /**
     * Constructor con un parametro que es un frame de control de errores
     * @param v El parámetro v es un frame que sirve para mostrarle errores de ingreso al usuario
     */
	public InterfazGrafica(JFrame v){
		frameControl=v;																//Panel de control de errores
		radio = new Radio();														//se crea el objeto
		//Construyendo paneles de la interfaz
		JComponent panelBanner=panelBanner();										//Panel para el banner, la imagen del radio
		JComponent panelEncendido=panelEncendido();									//Panel para el boton de encendido y apagado
		JComponent panelCambiaBanda=panelCambiaBanda();								//Panel para cambiar de AM y FM
		JComponent panelEstasonando=panelEstasonando();								//Panel para los lbl de lo que esta sonando y la frecuencia
		JComponent panelCambiaEstacion=panelCambiaEstacion();						//panel para cambiar estacion subir o bajar
		JComponent panelAgregarAFavoritos=panelAgregarAFavoritos();					//Panel con boton para ingresar a favoritos
		JComponent panelFavoritos=panelFavoritos();									// panel con los 12 botones de favoritos

		add(panelBanner);															//Se agregan todos los paneles al frame principal
		add(panelEstasonando);
		add(panelEncendido);
		add(panelCambiaBanda);
		add(panelCambiaEstacion);
		add(panelAgregarAFavoritos);
		add(panelFavoritos);
	}	
	
    /**
     * Método que devuelve el panel de encendido que es donde se encuentra el boton de encendido
     * @return JPanel con un boton
     */	  									  							  
	protected JComponent panelEncendido(){
		JPanel panel = new JPanel(new GridLayout(0,1));								//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder(" Apagar o Encender Radio. ")); 		
		panel.setPreferredSize(new Dimension(180, 50));     						//Cambiandolo de tamanio
		apagar= new JButton("Encender/Apagar Radio.");								//Creando botones
		apagar.setActionCommand(comapag);											//Comando de boton
		apagar.addActionListener(this);												//Asignando listener
		panel.add(apagar);															//Aniadindo botones al panel
		return panel;
	}

    /**
     * Método que devuelve el panel de favoritos que contiene 12 botones
     * @return JPanel con 12 botones para los favoritos
     */						  
	protected JComponent panelFavoritos(){
		JPanel panel = new JPanel(new GridLayout(1,0));								//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder(" Favoritos. ")); 			//Poniendolo texto al borde del panel
		panel.setPreferredSize(new Dimension(590, 55));         					//Cambiandolo de tamano

		uno= new JButton("1");														//Creando Botones
		dos= new JButton("2");	
		tres= new JButton("3");	
		cuatro= new JButton("4");	
		cinco= new JButton("5");	
		seis= new JButton("6");	
		siete= new JButton("7");	
		ocho= new JButton("8");	
		nueve= new JButton("9");	
		diez= new JButton("10");	
		once= new JButton("11");	
		doce= new JButton("12");	

		uno.setActionCommand(comuno);												//Asignando comando a cada boton
		uno.addActionListener(this);												//Asignando listener a cada boton
		dos.setActionCommand(comdos);
		dos.addActionListener(this);
		tres.setActionCommand(comtres);
		tres.addActionListener(this);
		cuatro.setActionCommand(comcuatro);
		cuatro.addActionListener(this);
		cinco.setActionCommand(comcinco);
		cinco.addActionListener(this);
		seis.setActionCommand(comseis);
		seis.addActionListener(this);
		siete.setActionCommand(comsiete);
		siete.addActionListener(this);
		ocho.setActionCommand(comocho);
		ocho.addActionListener(this);
		nueve.setActionCommand(comnueve);
		nueve.addActionListener(this);
		diez.setActionCommand(comdiez);
		diez.addActionListener(this);
		once.setActionCommand(comonce);
		once.addActionListener(this);
		doce.setActionCommand(comdoce);
		doce.addActionListener(this);
		
		panel.add(uno);																//Aniadiendo 12 botones al panel
		panel.add(dos);
		panel.add(tres);
		panel.add(cuatro);
		panel.add(cinco);
		panel.add(seis);
		panel.add(siete);
		panel.add(ocho);
		panel.add(nueve);
		panel.add(diez);
		panel.add(once);	
		panel.add(doce);
		return 	panel;
	}
	
    /**
     * Método que devuelve el panel con lo que esta sonando y la frecuencia actual
     * @return JPanel con 2 JLabels
     */							  
	protected JComponent panelEstasonando(){
		JPanel panel = new JPanel(new GridLayout(0,1));							//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder(" Esta sonando... ")); //Cambiando texto del borde		
		panel.setPreferredSize(new Dimension(150, 60));         				//Cambiandolo de tamanio
		lb = new JLabel("");													//Creando label con estacion actual
		panel.add(lb);
		lblfrecuencia = new JLabel("");											//lbl que le dice al usuario en que frecuencia se encuentra
		panel.add(lblfrecuencia);
		return panel;
		
	}
	
	/**
     * Método que devuelve el panel con los botones de subir y bajar en la estacion
     * @return JPanel con 2 botones para subir y bajar estacion
     */						  
	protected JComponent panelCambiaEstacion(){
		JPanel panel = new JPanel(new GridLayout(0,1));							//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder("Cambiar de estacion.")); 		
		panel.setPreferredSize(new Dimension(190, 65));         				//Cambiandolo de tamaÃ±o

		next= new JButton("Subir.");											 //Creando botones
		prev= new JButton("Bajar.");	

		next.setActionCommand(comnext);											//Asignando comandos a botones
		next.addActionListener(this);	
		prev.setActionCommand(comprev);
		prev.addActionListener(this);
		
		panel.add(next);														//AÃ±adindo botones al panel
		panel.add(prev);
		return panel;
	}	
	
	/**
     * Método que devuelve el panel con el boton para cambiar de frecuencia
     * @return JPanel con 1 boton para cambiar de frecuencia
     */							  
	protected JComponent panelCambiaBanda(){
		JPanel panel = new JPanel(new GridLayout(0,1));							//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder("Cambiar de Banda.")); 		
		panel.setPreferredSize(new Dimension(225, 65));         				//Cambiandolo de tamaÃ±o

		cambiarfrecuencia= new JButton("Cambiar Frecuencia (AM-FM).");			//Creando botones
	
		cambiarfrecuencia.setActionCommand(comcambiarfrecuencia);				//Asignando comandos a botones
		cambiarfrecuencia.addActionListener(this);

		panel.add(cambiarfrecuencia);											//AÃ±adindo botones al panel
		return panel;
	}
	
	
	/**
     * Método que devuelve el panel con el boton para agregar a favoritos
     * @return JPanel con 1 boton para agregar a favoritas la emisora actual
     */							  
	protected JComponent panelAgregarAFavoritos(){
		JPanel panel = new JPanel(new GridLayout(0,1));							//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder("Agregar a Favoritos.")); 		
		panel.setPreferredSize(new Dimension(275, 65));         				//Cambiandolo de tamaÃ±o

		addfav= new JButton("Agregar a Favoritos.");							//Creando botones
		
		addfav.setActionCommand(comaddfav);										//Asignando comandos a botones
		addfav.addActionListener(this);

		panel.add(addfav);														//Anadiendo botones al panel
		return panel;
	}
	
	/**
     * Método que devuelve el panel con el banner que contiene una imagen jpg de un radio
     * @return JPanel con una imagen
     */
	protected JComponent panelBanner(){
		JPanel panel = new JPanel(new GridLayout(0,1));							//Creando panel con un Gridlayout con 0 filas 1 columna
		JLabel banner = new JLabel("", JLabel.CENTER);  						//Centrando banner              
		banner.setOpaque(true);        											//Haciendolo mas opaco
		banner.setPreferredSize(new Dimension(550, 325));         				//Cambiandolo de tamaÃ±o
        banner.setIcon(new ImageIcon("radio.jpg")); 							//Creando Imaege icon con parametro de direccion	
		JPanel bannerPanel = new JPanel(new BorderLayout());      				//Creando panel para banner
		bannerPanel.add(banner, BorderLayout.CENTER);        					//Centrado y agregando el banner al panel
		bannerPanel.setBorder(BorderFactory.createTitledBorder("Radio Version: ____ ")); 	//Colocandole texto al borde			
        panel.add(bannerPanel, BorderLayout.CENTER);							//AÃ±adiendo al Frame
		return panel;
	}
	
/**
  *	GESTIONADOR DE EVENTOS: Permite gestionar todos los eventos de la clase.
  * @see ActionEvent
  * @see ActionListener
  */						  
	public void actionPerformed(ActionEvent e){									//Empieza el control de eventos
		String comando = e.getActionCommand();									//String del comando de accion			

		if(comando.equals(comapag)){											//Encender o apagar radio
			if(radio.isEncendido()){											//Si el radio esta encendido
				desactivaBotones();												//Se desactivan los botones	
				radio.setEncendido(false);										//Se cambia el estado a apagado
				lb.setText("");													//Y Se limpian los lbl cuando se apaga el radio
				lblfrecuencia.setText("");							
			}else{																//Sino entonces se enciende el radio
				activarBotones();												//Se activan los botones
				radio.setEncendido(true);										//Se coloca la bandera en true es decir encendido.
			}
		}
		
		if(comando.equals(comcambiarfrecuencia)){								//Estacion Previa
			radio.cambiarFrecuencia();											//Se llama al metodo que cambia de AM a FM			
			escribeAMFM();														//Se le muestra la frecuencia al usuario con un lbl
		}
		
				
		if(comando.equals(comprev)){											//Estacion Previa
			DecimalFormat df = new DecimalFormat("###.#");	       				//Se corta a 1 decimal
			lb.setText(String.valueOf(df.format(radio.bajarEstacion())));		//Colocando en el lbl la estacion del indice

		}
				
		if(comando.equals(comnext)){											//Estacion Siguiente
			DecimalFormat df = new DecimalFormat("###.#");	        
			lb.setText(String.valueOf(df.format(radio.subirEstacion())));		//Colocando en el lbl la estacion del indice
		}

		if(comando.equals(comaddfav)){											//Agregar una cancion a fav.
			try{
				int numero=Integer.parseInt(JOptionPane.showInputDialog(frameControl,"Introduzca en que numero de favoritos quiere que se coloque la emisora actual"));	//Pidiendo el numero de favoritos
				radio.guardar(numero,diceFrecuencia());							//Se guarda en la lista favoritos la estacion
			}catch(Exception e3){
					JOptionPane.showMessageDialog(frameControl," Revise la entrada de datos");		//Mensaje cuando ingresa un numero que no este entre 0-12
			}
		}
		
		if(comando.equals(comuno)){												//sacar favorito boton1
			muestraFav(1);														//Se coloca en el lbl la estacion guardada
			defiendeFavoritocero(1);											//Se evita que se imprima un 0 en el lbl
		}
		if(comando.equals(comdos)){												//sacar favorito boton2
			muestraFav(2);
			defiendeFavoritocero(2);
		}
		if(comando.equals(comtres)){											//sacar favorito boton3
			muestraFav(3);
			defiendeFavoritocero(3);
		}
		if(comando.equals(comcuatro)){											//sacar favorito boton4
			muestraFav(4);
			defiendeFavoritocero(4);
		}	
		if(comando.equals(comcinco)){											//sacar favorito boton5
			muestraFav(5);
			defiendeFavoritocero(5);
		}
		if(comando.equals(comseis)){											//sacar favorito boton6
			muestraFav(6);
			defiendeFavoritocero(6);
		}
		if(comando.equals(comsiete)){											//sacar favorito boton7
			muestraFav(7);
			defiendeFavoritocero(7);
		}
		if(comando.equals(comocho)){											//sacar favorito boton8
			muestraFav(8);
			defiendeFavoritocero(8);
		}
		if(comando.equals(comnueve)){											//sacar favorito boton9
			muestraFav(9);
			defiendeFavoritocero(9);
		}
		if(comando.equals(comdiez)){											//sacar favorito boton10
			muestraFav(10);
			defiendeFavoritocero(10);
		}
		if(comando.equals(comonce)){											//sacar favorito boton11
			muestraFav(11);
			defiendeFavoritocero(11);
		}
		if(comando.equals(comdoce)){											//sacar favorito boton12
			muestraFav(12);
			defiendeFavoritocero(12);
		}
	}//Final de gestionador de eventos	
	
	/**
	  * creandoInterfaz:Metodo que crea el Frame principal, el contenedor principal y muestra la interfaz grafica
	  * @see windowActivated */
    public void creandoInterfaz() {
        frame = new JFrame(" Radio.");			        						//Creando la ventana principal
		frame.setPreferredSize(new Dimension(620, 620)); 						//colocar caracteristicas al frame (tamaÃ±o)
		
        this.setOpaque(true); 													//Se vuelve opaco el panel de contenido para que no sea diferenciado
        frame.setContentPane(this);												//Estableciendo el panel principal.
		frame.setResizable(false);												//Bloqueando la maximizaciÃ³n de la ventana
		

		frame.setDefaultCloseOperation (WindowConstants.DO_NOTHING_ON_CLOSE);	//Asegurandose de que el evento foco se valla al Panel principal
        frame.addWindowListener(new WindowAdapter() {							//El evento foco se centra en este panel no importa que
			//Cerrando con confirmacion
		    public void windowClosing(WindowEvent we){
				int eleccion = JOptionPane.showConfirmDialog(null, "Desea salir?");
					if ( eleccion == 0) {
						System.exit(0);
					}  
			}
        });
        //Mostrando el frame
        frame.pack();
        frame.setLocationRelativeTo(null);;										//Frame en el centro
		frame.setVisible(true);	
    }
	
	/**
	  * Desactiva todos los botones del radio excepto el de encender y apagar
	  *  
	  * */
	public void desactivaBotones(){
		addfav.setEnabled(false);
		cambiarfrecuencia.setEnabled(false);
		next.setEnabled(false);
		prev.setEnabled(false);
		uno.setEnabled(false);
		dos.setEnabled(false);
		tres.setEnabled(false);
		cuatro.setEnabled(false);
		cinco.setEnabled(false);
		seis.setEnabled(false);
		siete.setEnabled(false);
		ocho.setEnabled(false);
		nueve.setEnabled(false);
		diez.setEnabled(false);
		once.setEnabled(false);
		doce.setEnabled(false);
	}
					
	/**
	  * Activa todos los botones del radio excepto el de encender y apagar
	  *  
	  * */
	public void activarBotones(){
		addfav.setEnabled(true);
		cambiarfrecuencia.setEnabled(true);
		next.setEnabled(true);
		prev.setEnabled(true);
		uno.setEnabled(true);
		dos.setEnabled(true);
		tres.setEnabled(true);
		cuatro.setEnabled(true);
		cinco.setEnabled(true);
		seis.setEnabled(true);
		siete.setEnabled(true);
		ocho.setEnabled(true);
		nueve.setEnabled(true);
		diez.setEnabled(true);
		once.setEnabled(true);
		doce.setEnabled(true);
		escribeAMFM();

	}
	
	/**
	  * Verifica si esta en am y fm luego escribe en el lbl la frecuencia y la estacion actual.
	  *  
	  * */
	public void escribeAMFM(){
		if (radio.isFrecuencia()){												//Si isFrecuencia() me devuelve True es AM
			lblfrecuencia.setText("AM");										//Se escribe en el lbl
			lb.setText(String.valueOf(radio.getAm()));							//Se escribe la estacion
		}else{																	//sino me devolvio FM y se escribe en el lbl
			lblfrecuencia.setText("FM");
			lb.setText(String.valueOf(radio.getFm()));
		}	
	}
	
	/**
	  * Me regresa la estacion actual dependiendo de la frecuencia AM o FM
	  *  
	  * */
	public double diceFrecuencia(){														
		if(radio.isFrecuencia()){												//Si la frecuencia es TRUE la radio esta en AM
			return estacionact=radio.getAm();									//Y regresa el numero de la estacion como doble	
		}else{																	//Sino regresa la estacion FM
			return estacionact=radio.getFm();
		}
	}
	
	/**
	  * Coloca en los lbl tanto la estacion guardada en una posicion de la lista favoritos como la frecuencia actual
	  *  @param boton: el boton que se apreto para saber en que favorito se encuentra
	  * */
	public void muestraFav(int boton){											
		if(radio.sacar(boton)!=0){												//Si la estacion sacada del arreglo de favoritos es diferente de cero
			DecimalFormat df = new DecimalFormat("###.#");	        
			lb.setText(String.valueOf(df.format(radio.sacar(boton))));						//Se coloca en el lbl la estacion actual
			if(radio.sacar(boton)%1==0){										//Se verifica si la estacion es entero quiere decir que es AM
				radio.setFrecuencia(true);										//Se coloca la frecuencia en AM
				lblfrecuencia.setText("AM");									//Se escribe en el lbl que se esta en la frecuencia AM
			}else{																//Sino quiere decir que es double
				radio.setFrecuencia(false);										//Y se coloca la frecuencia en FM
				lblfrecuencia.setText("FM");									//Se pone en el lbl en que frecuencia se encuentra
			}
		}else{
		}
	}
	
	/**
	  * Actualiza la frecuencia actual la cual fue modificada por un favorito
	  * @param boton: el boton en que se encuentra cuando se quiere actualizar la frecuencia
	  * */	
	public void actualizaFrecuencia(int boton){	
		if(radio.isFrecuencia()){												//Si la frecuencia es true es AM
			estacionact=radio.sacar(boton);										//se saca la frecuencia en la posicion de la lista de favoritos								
			radio.setAm((int) estacionact);										//se modifica la estacion actual AM
		}else{																	//Sino quiere decir que la frecuencia es FM
			estacionact=radio.sacar(boton);										//Se saca la frecuencia en la posicion del boton
			radio.setFm(estacionact);											//Se cambia el valor de la estacion en FM
		}
	}
	
	/**
	  * Defensiva que evita que se imprima la estacion actual si y solo si se tiene una estacion =0 
	  * @param boton: el boton en que se encuentra cuando se quiere actualizar la frecuencia
	  * */	
	public void defiendeFavoritocero(int boton){								
		if(radio.sacar(boton)==0){												//Si es cero no va a escribir en el lbl
		}else{																	//Sino si actualiza la frecuencia
			actualizaFrecuencia(boton);											//lo escribe en el lbl
		}
	}	
}
