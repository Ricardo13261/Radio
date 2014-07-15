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
        boolean frecuencia = false;
        Radio instance = new Radio();
        instance.cambiarFrecuencia(true);
        assertTrue(instance.getFrecuencia()==true);                             //Se espera que la frecuencia cambie su valor a true es decir Am
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of apagar method, of class Radio.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        Radio instance = new Radio();
        instance.apagar();
        assertTrue(instance.getEncendido()==false);                              //Se espera que el estado sea False es decir apagado
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of encender method, of class Radio.
     */
    @Test
    public void testEncender() {
        System.out.println("encender");
        Radio instance = new Radio();
        instance.encender();
        assertTrue(instance.getEncendido()==true);                              //Se espera que el estado sea False es decir apagado
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        instance.guardar(1, 106.5);
        assertTrue(instance.sacar(1)==106.5);                              //Se espera que el estado sea False es decir apagado
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bajarEstacion method, of class Radio.
     */
    @Test
    public void testBajarEstacion() {
        System.out.println("bajarEstacion");
        Radio instance = new Radio();
        double expResult = 107.9;
        double result = instance.bajarEstacion();
        assertEquals(expResult, result, 0.0);  
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subirEstacion method, of class Radio.
     */
    @Test
    public void testSubirEstacion() {
        System.out.println("subirEstacion");
        Radio instance = new Radio();
        instance.cambiarFrecuencia(true);
        double expResult = 540;
        double result = instance.subirEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class Radio.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        int boton = 0;
        Radio instance = new Radio();
        double expResult = 0;
        double result = instance.sacar(1);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEncendido method, of class Radio.
     */
    @Test
    public void testGetEncendido() {
        System.out.println("getEncendido");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.getEncendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class Radio.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionFM method, of class Radio.
     */
    @Test
    public void testGetEstacionFM() {
        System.out.println("getEstacionFM");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getEstacionFM();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionAM method, of class Radio.
     */
    @Test
    public void testGetEstacionAM() {
        System.out.println("getEstacionAM");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getEstacionAM();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
