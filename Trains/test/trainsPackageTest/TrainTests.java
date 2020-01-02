/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainsPackageTest;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import trainsPackage.Stop;
import trainsPackage.Train;

/**
 *
 * @author Walker
 */
public class TrainTests {
    
    public TrainTests() {
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
    public void testGetPlatform() {
        System.out.println("getPlatform");
        ArrayList<Stop> stopsArrayInstanceTest = new ArrayList<Stop>(); 
        Stop instance1 = new Stop("TotnesTest", "10:23", "10:56");
        Stop instance2 = new Stop("PlymTest", "10:27", "10:35");
        stopsArrayInstanceTest.add(instance1);
        stopsArrayInstanceTest.add(instance2);
        Train instance = new Train("1", "11:49", "11:59", stopsArrayInstanceTest);
        String expResult = "1";
        String result = instance.getPlatform();
        assertEquals(expResult, result);
     
    }

   
    @Test
    public void testSetPlatform() {
        System.out.println("setPlatform");
        ArrayList<Stop> stopsArrayInstanceTest = new ArrayList<Stop>(); 
        Stop instance1 = new Stop("TotnesTest", "10:23", "10:56");
        Stop instance2 = new Stop("PlymTest", "10:27", "10:35");
        stopsArrayInstanceTest.add(instance1);
        stopsArrayInstanceTest.add(instance2);
        String platform = "1";
        Train instance = new Train("not set", "11:49", "11:59", stopsArrayInstanceTest);
        instance.setPlatform(platform);
        
       
    }

   
    @Test
    public void testGetDeparts() {
        System.out.println("getDeparts");
        ArrayList<Stop> stopsArrayInstanceTest = new ArrayList<Stop>(); 
        Stop instance1 = new Stop("TotnesTest", "10:23", "10:56");
        Stop instance2 = new Stop("PlymTest", "10:27", "10:35");
        stopsArrayInstanceTest.add(instance1);
        stopsArrayInstanceTest.add(instance2);
        Train instance = new Train("1", "11:49", "11:59", stopsArrayInstanceTest);
        String expResult = "11:49";
        String result = instance.getDeparts();
        assertEquals(expResult, result);
       
    }

    
    @Test
    public void testSetDeparts() {
    
        System.out.println("setDeparts");
        
        ArrayList<Stop> stopsArrayInstanceTest = new ArrayList<Stop>(); 
        Stop instance1 = new Stop("TotnesTest", "10:23", "10:56");
        Stop instance2 = new Stop("PlymTest", "10:27", "10:35");
        stopsArrayInstanceTest.add(instance1);
        stopsArrayInstanceTest.add(instance2);
        String departs = "11:49";
        Train instance = new Train("1", "not set", "11:59", stopsArrayInstanceTest);
        instance.setDeparts(departs);
        
    }

   
    @Test
    public void testGetExpected() {
      
        System.out.println("getExpected");
        
        ArrayList<Stop> stopsArrayInstanceTest = new ArrayList<Stop>(); 
        Stop instance1 = new Stop("TotnesTest", "10:23", "10:56");
        Stop instance2 = new Stop("PlymTest", "10:27", "10:35");
        stopsArrayInstanceTest.add(instance1);
        stopsArrayInstanceTest.add(instance2);
        Train instance = new Train("1", "11:49", "11:59", stopsArrayInstanceTest);
        String expResult = "11:59";
        String result = instance.getExpected();
        assertEquals(expResult, result);
      
    }

 
    @Test
    public void testSetExpected() {
      
        System.out.println("setExpected");
        
        ArrayList<Stop> stopsArrayInstanceTest = new ArrayList<Stop>(); 
        Stop instance1 = new Stop("TotnesTest", "10:23", "10:56");
        Stop instance2 = new Stop("PlymTest", "10:27", "10:35");
        stopsArrayInstanceTest.add(instance1);
        stopsArrayInstanceTest.add(instance2);
         
        String expected = "11:59";
        Train instance = new Train("1", "11:49", "not set", stopsArrayInstanceTest);
        instance.setExpected(expected);
        
    }
    
}
