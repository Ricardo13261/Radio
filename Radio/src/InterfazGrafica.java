 /**
   * @InterfazGrafica.java  1.0 06/07/2014
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 21 Estructura de Datos
   * Autor: Brandon Méndez Carné: 13087
   *		Ricardo Franco Carné: 13261
   *		Samuel Maldonado Carné: 13
   * Interfaz gráfica: Gestiona los eventos del radio
   *
   */
//Importando librerias de java.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class InterfazGrafica extends JPanel 
							  implements ActionListener{
	/**ATRIBUTOS*/
	private static JFrame frame,frameControl;										//frame principal de la GUI y frame de control de errores.
	private JButton apagar,next, prev,addfav,uno, dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce, cambiarfrecuencia;					//BOTONES PARA LOS REQUISITOS DEL Radio	
	private static String  comapag="Apagar radio.",comaddfav="Agregar a favoritos.",comnext="Subir estacion",comprev="Bajar estacion";	//Comandos para controlar eventos
	private static String comuno="uno",comdos="dos",comtres="tres",comcuatro="cuatro",comcinco="cinco",comseis="seis",comsiete="siete",comocho="ocho",comnueve="nueve",comdiez="diez",comonce="once",comdoce="doce",comcambiarfrecuencia="cambiar frecuencia";
	private int actual=0,boton=0;											//Contadores
	private Radio radio;
	private String estacionactual="";												//Contiene la cancion actual en un String 
	private JLabel lb;																//Label que sirvio para un panel, para mostrar que esta sonando.
	

	//CONSTRUCTOR
	public InterfazGrafica(JFrame v){
		frameControl=v;
		radio = new Radio();
		//Construyendo paneles de la interfaz
		JComponent panelBanner=panelBanner();
		JComponent panelEncendido=panelEncendido();
		JComponent panelCambiaBanda=panelCambiaBanda();
		JComponent panelEstasonando=panelEstasonando();
		JComponent panelCambiaEstacion=panelCambiaEstacion();
		JComponent panelAgregarAFavoritos=panelAgregarAFavoritos();
		JComponent panelFavoritos=panelFavoritos();
		
		//Añadiendo al panel princradioal
		add(panelBanner);
		add(panelEncendido);
		add(panelCambiaBanda);
		add(panelEstasonando);
		add(panelCambiaEstacion);
		add(panelAgregarAFavoritos);
		add(panelFavoritos);
	}	
	
	
	  									  	
/**
  *	PANEL ENCENDIDO: Contiene un boton con el cual se encender o apagar el Radio.
  */						  
	protected JComponent panelEncendido(){
		JPanel panel = new JPanel(new GridLayout(0,1));		//Creando panel con un Gridlayout con 0 filas 1 columna

		panel.setBorder(BorderFactory.createTitledBorder(" Apagar o Encender Radio. ")); 		
		panel.setPreferredSize(new Dimension(180, 50));     //Cambiandolo de tamaño
		apagar= new JButton("Encender/Apagar Radio.");		//Creando botones
		apagar.setActionCommand(comapag);					//Comando de boton
		apagar.addActionListener(this);
		
		panel.add(apagar);									//Añadindo botones al panel
		return panel;
	}

/**
  *	PANEL FAVORITOS
  */						  
	protected JComponent panelFavoritos(){
		JPanel panel = new JPanel(new GridLayout(1,0));		//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder(" Favoritos. ")); 		
		panel.setPreferredSize(new Dimension(590, 55));         				//Cambiandolo de tamaño

		//Creando botones
		uno= new JButton("1");	
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
		
		//Asignando comandos a botones
		uno.setActionCommand(comuno);
		uno.addActionListener(this);
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
		
		//Añadindo botones al panel
		panel.add(uno);
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
  *	PANEL VER CANCION ACTUAL: muestra en un label la cancion actual que suena
  */						  
	protected JComponent panelEstasonando(){
		JPanel panel = new JPanel(new GridLayout(0,1));		//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder(" Esta sonando... ")); 		
		panel.setPreferredSize(new Dimension(580, 60));         				//Cambiandolo de tamaño
		lb = new JLabel(estacionactual);
		panel.add(lb);
		return panel;
	}
	
	
/** 
  *	PANEL PARA CAMBIAR DE ESTACION
  */						  
	protected JComponent panelCambiaEstacion(){
		JPanel panel = new JPanel(new GridLayout(0,1));							//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder("Cambiar de estacion.")); 		
		panel.setPreferredSize(new Dimension(190, 65));         				//Cambiandolo de tamaño

		//Creando botones
		next= new JButton("Subir.");	
		prev= new JButton("Bajar.");	
		//Asignando comandos a botones
		next.setActionCommand(comnext);
		next.addActionListener(this);
		prev.setActionCommand(comprev);
		prev.addActionListener(this);
		//Añadindo botones al panel
		panel.add(next);
		panel.add(prev);
		return panel;
	}	
	
/** 
  *	PANEL PARA CAMBIAR DE BANDA
  */						  
	protected JComponent panelCambiaBanda(){
		JPanel panel = new JPanel(new GridLayout(0,1));							//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder("Cambiar de Banda.")); 		
		panel.setPreferredSize(new Dimension(225, 65));         				//Cambiandolo de tamaño

		cambiarfrecuencia= new JButton("Cambiar Frecuencia (AM-FM).");			//Creando botones
	
		cambiarfrecuencia.setActionCommand(comcambiarfrecuencia);				//Asignando comandos a botones
		cambiarfrecuencia.addActionListener(this);

		panel.add(cambiarfrecuencia);											//Añadindo botones al panel
		return panel;
	}
	
	
/** 
  *	PANEL PARA AGREGAR UNA CANCION A FAVORITOS
  */						  
	protected JComponent panelAgregarAFavoritos(){
		JPanel panel = new JPanel(new GridLayout(0,1));							//Creando panel con un Gridlayout con 0 filas 1 columna
		panel.setBorder(BorderFactory.createTitledBorder("Agregar a Favoritos.")); 		
		panel.setPreferredSize(new Dimension(275, 65));         				//Cambiandolo de tamaño

		//Creando botones
		addfav= new JButton("Agregar a Favoritos.");	
		//Asignando comandos a botones
		addfav.setActionCommand(comaddfav);
		addfav.addActionListener(this);

		//Añadindo botones al panel
		panel.add(addfav);
		return panel;
	}
	
/** 
  *	PANEL PARA EL BANNER
  */
	protected JComponent panelBanner(){
		JPanel panel = new JPanel(new GridLayout(0,1));							//Creando panel con un Gridlayout con 0 filas 1 columna
		JLabel banner = new JLabel("", JLabel.CENTER);  						//Centrando banner              
		banner.setOpaque(true);        											//Haciendolo mas opaco
		banner.setPreferredSize(new Dimension(550, 325));         				//Cambiandolo de tamaño
        banner.setIcon(new ImageIcon("radio.jpg")); 							//Creando Imaege icon con parametro de direccion	
		JPanel bannerPanel = new JPanel(new BorderLayout());      				//Creando panel para banner
		bannerPanel.add(banner, BorderLayout.CENTER);        					//Centrado y agregando el banner al panel
		bannerPanel.setBorder(BorderFactory.createTitledBorder("Radio Version: ____ ")); 	//Colocandole texto al borde			
        panel.add(bannerPanel, BorderLayout.CENTER);							//Añadiendo al Frame
		return panel;
	}
	
/**
  *	GESTIONADOR DE EVENTOS: Permite gestionar todos los eventos de la clase.
  * @see ActionEvent
  * @see ActionListener
  */						  
	public void actionPerformed(ActionEvent e){
		String comando = e.getActionCommand();						//String del comando de accion			

		if(comando.equals(comapag)){								//Encender o apagar radio
			if(radio.isEncendido()){
				desactivaBotones();
				radio.setEncendido(false);
				lb.setText("");
			}else{
				activarBotones();
				radio.setEncendido(true);
			}
		}
		
		if(comando.equals(comcambiarfrecuencia)){								//Estacion Previa
			//radio.cambiarFrecuencia(boolean frecuencia);
		}
				
		if(comando.equals(comprev)){								//Estacion Previa
			//radio.bajarEstacion(boolean frecuencia);
		}
				
		if(comando.equals(comnext)){								//Estacion Siguiente
			//radio.subirEstacion(boolean frecuencia);
		}

		if(comando.equals(comaddfav)){								//Agregar una cancion a fav.
			try{
				int numero=Integer.parseInt(JOptionPane.showInputDialog(frameControl,"Introduzca en que numero de favoritos quiere que se coloque la emisora actual"));
			}catch(Exception e3){
					JOptionPane.showMessageDialog(frameControl," Revise la entrada de datos");
			}
		}
		
		if(comando.equals(comuno)){								//sacar favorito boton1
			boton=1;
			//radio.sacar(boton)
		}

		if(comando.equals(comdos)){								//sacar favorito boton2
			boton=2;
			//radio.sacar(boton)
		}
		
		if(comando.equals(comtres)){							//sacar favorito boton3
			boton=3;
			//radio.sacar(boton)
		}
		if(comando.equals(comcuatro)){							//sacar favorito boton4
			boton=4;
			//radio.sacar(boton)
		}
		if(comando.equals(comcinco)){								//sacar favorito boton5
			boton=5;
			//radio.sacar(boton)
		}
		if(comando.equals(comseis)){								//sacar favorito boton6
			boton=6;
			//radio.sacar(boton)
		}
		if(comando.equals(comsiete)){								//sacar favorito boton7
			boton=7;
			//radio.sacar(boton)
		}
		if(comando.equals(comocho)){								//sacar favorito boton8
			boton=8;
			//radio.sacar(boton)
		}
		if(comando.equals(comnueve)){								//sacar favorito boton9
			boton=9;
			//radio.sacar(boton)
		}
		if(comando.equals(comdiez)){								//sacar favorito boton10
			boton=10;
			//radio.sacar(boton)
		}
		if(comando.equals(comonce)){								//sacar favorito boton11
			boton=11;
			//radio.sacar(boton)
		}
		if(comando.equals(comdoce)){								//sacar favorito boton12
			boton=12;
			//radio.sacar(boton)
		}
		
	}//Final de gestionador de eventos	
	
	/**
	  * creandoInterfaz:Metodo que crea el Frame principal, el contenedor principal y muestra la interfaz grafica
	  * @see windowActivated */
    public void creandoInterfaz() {
        frame = new JFrame(" Radio.");			        //Creando la ventana principal
		frame.setPreferredSize(new Dimension(620, 730)); 	//colocar caracteristicas al frame (tamaño)
		
        this.setOpaque(true); 								//Se vuelve opaco el panel de contenido para que no sea diferenciado
        frame.setContentPane(this);							//Estableciendo el panel principal.
		frame.setResizable(false);							//Bloqueando la maximización de la ventana
		

		frame.setDefaultCloseOperation (WindowConstants.DO_NOTHING_ON_CLOSE);			//Asegurandose de que el evento foco se valla al Panel principal
        frame.addWindowListener(new WindowAdapter() {		//El evento foco se centra en este panel no importa que
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
        frame.setLocationRelativeTo(null);;		//Frame en el centro
		frame.setVisible(true);	
    }
	
	/**
	  * desactivaBotones: desactiva todos los botones
	  * @see windowActivated */
	public void desactivaBotones(){
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
	  * activarBotones: Permite activar botones de la interfaz.
	  * @see windowActivated */
	public void activarBotones(){
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
	}					
}