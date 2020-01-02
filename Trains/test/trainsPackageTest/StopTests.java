/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainsPackageTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import trainsPackage.Stop;

/**
 *
 * @author Walker
 */
public class StopTests {
    
    public StopTests() {
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

 
    @Test
    public void testGetName() {
        System.out.println("getName");
        Stop instance = new Stop("TotnesTest", "10:23", "10:57");
        setUpClass();
        String expResult = "TotnesTest";
        String result = instance.getName();
        assertEquals(expResult, result);
       
    }

  
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "TotnesTest";
        Stop instance = new Stop("NotYetSet", "10:23", "10:57");
        instance.setName(name);
       
    }

  
    @Test
    public void testGetArrives() {
        System.out.println("getArrives");
        Stop instance = new Stop("TotnesTest", "10:23", "10:57");
        String expResult = "10:23";
        String result = instance.getArrives();
        assertEquals(expResult, result);
       
    }

 
    @Test
    public void testSetArrives() {
        System.out.println("setArrives");
        String arrives = "10:54";
        Stop instance = new Stop("TotnesTest", "Arrives not set", "10:57");
        instance.setArrives(arrives);
        
    }

  
    @Test
    public void testGetDeparts() {
        System.out.println("getDeparts");
        Stop instance = new Stop("TotnesTest", "10:23", "10:57");
        String expResult = "10:57";
        String result = instance.getDeparts();
        assertEquals(expResult, result);
       
    }

  
    @Test
    public void testSetDeparts() {
        System.out.println("setDeparts");
        String departs = "10:57";
        Stop instance = new Stop("TotnesTest", "10:23", "departs not set");
        instance.setDeparts(departs);
        
    }
    
}
