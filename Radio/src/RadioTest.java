/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class RadioTest {
    
    public RadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cambiarFrecuencia method, of class Radio.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        Radio instance = new Radio();
        instance.cambiarFrecuencia();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.isFrecuencia()==true);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of apagar method, of class Radio.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        Radio instance = new Radio();
        instance.setEncendido(true);
        instance.apagar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertTrue(instance.isEncendido()==false);

    }

    /**
     * Test of encender method, of class Radio.
     */
    @Test
    public void testEncender() {
        System.out.println("encender");
        Radio instance = new Radio();
        instance.encender();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertTrue(instance.isEncendido()==true);

    }

    /**
     * Test of guardar method, of class Radio.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        int boton = 0;
        double estacion = 0.0;
        Radio instance = new Radio();
        instance.guardar(1, 85.9);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertTrue(instance.sacar(1)==85.9 );

    }

    /**
     * Test of bajarEstacion method, of class Radio.
     */
    @Test
    public void testBajarEstacion() {
        System.out.println("bajarEstacion");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.bajarEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subirEstacion method, of class Radio.
     */
    @Test
    public void testSubirEstacion() {
        System.out.println("subirEstacion");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.subirEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class Radio.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        int boton = 0;
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.sacar(boton);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of llenaLista method, of class Radio.
     */
    @Test
    public void testLlenaLista() {
        System.out.println("llenaLista");
        Radio instance = new Radio();
        instance.llenaLista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEncendido method, of class Radio.
     */
    @Test
    public void testIsEncendido() {
        System.out.println("isEncendido");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.isEncendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEncendido method, of class Radio.
     */
    @Test
    public void testSetEncendido() {
        System.out.println("setEncendido");
        boolean encendido = false;
        Radio instance = new Radio();
        instance.setEncendido(encendido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFrecuencia method, of class Radio.
     */
    @Test
    public void testIsFrecuencia() {
        System.out.println("isFrecuencia");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.isFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrecuencia method, of class Radio.
     */
    @Test
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        boolean frecuencia = false;
        Radio instance = new Radio();
        instance.setFrecuencia(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFavoritos method, of class Radio.
     */
    @Test
    public void testGetFavoritos() {
        System.out.println("getFavoritos");
        Radio instance = new Radio();
        double[] expResult = null;
        double[] result = instance.getFavoritos();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavoritos method, of class Radio.
     */
    @Test
    public void testSetFavoritos() {
        System.out.println("setFavoritos");
        double[] favoritos = null;
        Radio instance = new Radio();
        instance.setFavoritos(favoritos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndicefav method, of class Radio.
     */
    @Test
    public void testGetIndicefav() {
        System.out.println("getIndicefav");
        Radio instance = new Radio();
        int expResult = 0;
        int result = instance.getIndicefav();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIndicefav method, of class Radio.
     */
    @Test
    public void testSetIndicefav() {
        System.out.println("setIndicefav");
        int indicefav = 0;
        Radio instance = new Radio();
        instance.setIndicefav(indicefav);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArreglofm method, of class Radio.
     */
    @Test
    public void testGetArreglofm() {
        System.out.println("getArreglofm");
        Radio instance = new Radio();
        double[] expResult = null;
        double[] result = instance.getArreglofm();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArreglofm method, of class Radio.
     */
    @Test
    public void testSetArreglofm() {
        System.out.println("setArreglofm");
        double[] arreglofm = null;
        Radio instance = new Radio();
        instance.setArreglofm(arreglofm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArregloam method, of class Radio.
     */
    @Test
    public void testGetArregloam() {
        System.out.println("getArregloam");
        Radio instance = new Radio();
        int[] expResult = null;
        int[] result = instance.getArregloam();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArregloam method, of class Radio.
     */
    @Test
    public void testSetArregloam() {
        System.out.println("setArregloam");
        int[] arregloam = null;
        Radio instance = new Radio();
        instance.setArregloam(arregloam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionActualAM method, of class Radio.
     */
    @Test
    public void testGetEstacionActualAM() {
        System.out.println("getEstacionActualAM");
        Radio instance = new Radio();
        int expResult = 0;
        int result = instance.getEstacionActualAM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstacionActualAM method, of class Radio.
     */
    @Test
    public void testSetEstacionActualAM() {
        System.out.println("setEstacionActualAM");
        int estacionActualAM = 0;
        Radio instance = new Radio();
        instance.setEstacionActualAM(estacionActualAM);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionActualFM method, of class Radio.
     */
    @Test
    public void testGetEstacionActualFM() {
        System.out.println("getEstacionActualFM");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getEstacionActualFM();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstacionActualFM method, of class Radio.
     */
    @Test
    public void testSetEstacionActualFM() {
        System.out.println("setEstacionActualFM");
        double estacionActualFM = 0.0;
        Radio instance = new Radio();
        instance.setEstacionActualFM(estacionActualFM);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndiceArregloAM method, of class Radio.
     */
    @Test
    public void testGetIndiceArregloAM() {
        System.out.println("getIndiceArregloAM");
        Radio instance = new Radio();
        int expResult = 0;
        int result = instance.getIndiceArregloAM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIndiceArregloAM method, of class Radio.
     */
    @Test
    public void testSetIndiceArregloAM() {
        System.out.println("setIndiceArregloAM");
        int indiceArregloAM = 0;
        Radio instance = new Radio();
        instance.setIndiceArregloAM(indiceArregloAM);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndiceArregloFM method, of class Radio.
     */
    @Test
    public void testGetIndiceArregloFM() {
        System.out.println("getIndiceArregloFM");
        Radio instance = new Radio();
        int expResult = 0;
        int result = instance.getIndiceArregloFM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIndiceArregloFM method, of class Radio.
     */
    @Test
    public void testSetIndiceArregloFM() {
        System.out.println("setIndiceArregloFM");
        int indiceArregloFM = 0;
        Radio instance = new Radio();
        instance.setIndiceArregloFM(indiceArregloFM);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redondear method, of class Radio.
     */
    @Test
    public void testRedondear() {
        System.out.println("redondear");
        double numero = 0.0;
        int decimales = 0;
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.redondear(numero, decimales);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
