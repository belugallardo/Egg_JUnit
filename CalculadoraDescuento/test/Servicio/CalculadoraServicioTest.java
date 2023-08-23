/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author belugallardo
 */
public class CalculadoraServicioTest {
    
    public CalculadoraServicioTest() {
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
     * Test of calcularDescuento method, of class CalculadoraServicio.
     */
    @Test
    public void testCalcularDescuento() {
        System.out.println("calcularDescuento");
       
        CalculadoraServicio cs = new CalculadoraServicio();
        
       
        assertEquals(90, cs.calcularDescuento(100, 10));
       
       
    }
    
}
