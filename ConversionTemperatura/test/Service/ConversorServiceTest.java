/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

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
public class ConversorServiceTest {
    
    public ConversorServiceTest() {
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
     * Test of convertirTemperatura method, of class ConversorService.
     */
    @Test
    public void testConvertirTemperatura() {
        System.out.println("convertirTemperatura");
        int cel = 31;
        String str = "k";
        ConversorService instance = new ConversorService();
        double expResult = 305.15;
        double result = instance.convertirTemperatura(cel, str);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
