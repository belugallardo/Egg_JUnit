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
public class ValidadorServicioTest {

    public ValidadorServicioTest() {
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
     * Test of esValido method, of class ValidadorServicio.
     */
    @Test
    public void testEsValido() {
        System.out.println("esValido");
        String cont = "1gH!fetl";
        ValidadorServicio instance = new ValidadorServicio();
        boolean expResult = true;
        boolean result = instance.esValido(cont);
        assertEquals(expResult, result);

    }

    @Test
    public void testNoEsValido() {
        System.out.println("No es valido");
        String cont = "1gl!fetl";
        ValidadorServicio instance = new ValidadorServicio();
        assertFalse( instance.esValido(cont));
        
    }
    @Test
    public void testValido2() {
        System.out.println("Es valido2");
        String cont = "1gH!fetl";
        ValidadorServicio instance = new ValidadorServicio();
        assertTrue( instance.esValido(cont));
        
    }

}
