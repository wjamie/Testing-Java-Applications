/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainsPackageTest;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import trainsPackage.Methods;
import trainsPackage.Train;
import static org.junit.Assert.*;

/**
 *
 * @author Walker
 */
public class MethodsIntegrationTests {
    
    public MethodsIntegrationTests() {
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
    public void testGetAllTrains() {
        System.out.println("getAllTrains test running...");
        String expResult = "all trains: [0947, 0953, 1003, 1004, 1007, 1022, 1032, 1034, 1039, 1041, 1051, 1101, 1104, 1105, 1132, 1137, 1140, 1150]";
        String result = Methods.getAllTrains();
        assertEquals("Expected string not equal to result string: ",expResult, result);
       
        System.out.println("done.");
    }

  
    
    @Test
    public void testGetTrainsAtPlatform() {
        System.out.println("getTrainsAtPlatform test running...");
        
        String platformQuery1 = "1";
        String platformQuery2 = "2";
        String platformQuery3 = "3";
        
        String expResult1 = "all trains at platform 1: [1007, 1041, 1101, 1137]";
        String expResult2 = "all trains at platform 2: [0947, 0953, 1004, 1032, 1105, 1132, 1140]";
        String expResult3 = "all trains at platform 3: [1003, 1022, 1034, 1039, 1051, 1104, 1150]";
        
        String result1 = Methods.getTrainsAtPlatform(platformQuery1);
        String result2 = Methods.getTrainsAtPlatform(platformQuery2);
        String result3 = Methods.getTrainsAtPlatform(platformQuery3);
        
        assertEquals(platformQuery1 + ": Expected string not equal to result string: ",expResult1, result1);
        assertEquals(platformQuery2 + ": Expected string not equal to result string: ",expResult2, result2);
        assertEquals(platformQuery3 + ": Expected string not equal to result string: ",expResult3, result3);
        
      
        System.out.println("done.");
      
    }

    
    
    @Test
    public void testGetLateTrains() {
        System.out.println("getLateTrains test running...");
        String expResult = "all late trains: [1007, 1150]    Please be advised these trains are running late, plan your journey accordingly";
        String result = Methods.getLateTrains();
        assertEquals("Expected string not equal to result string: ",expResult, result);
    
         System.out.println("done.");
    }

  
    
    @Test
    public void testGetTrainsAtStation() {
        System.out.println("getTrainsAtStation test running...");
       
        String stationQuery1 = "Ivybridge";
        String stationQuery2 = "Plymouth";
        String stationQuery3 = "Totnes";
        String stationQuery4 = "Exeter St Davids";
        String stationQuery5 = "London Paddington";
        String stationQuery6 = "Exmouth";
       
        String expResult1 = "all trains calling at Ivybridge: [0947]";
        String expResult2 = "all trains calling at Plymouth: [0947, 1004, 1032, 1105, 1140]";
        String expResult3 = "all trains calling at Totnes: [0947, 1004, 1032, 1105, 1140]";
        String expResult4 = "all trains calling at Exeter St Davids: [1003, 1022, 1034, 1039, 1051, 1104, 1137, 1150]";
        String expResult5 = "all trains calling at London Paddington: [1034, 1150]";
        String expResult6 = "all trains calling at Exmouth: [1039, 1137]";
        
        String result1 = Methods.getTrainsAtStation(stationQuery1);
        String result2 = Methods.getTrainsAtStation(stationQuery2);
        String result3 = Methods.getTrainsAtStation(stationQuery3);
        String result4 = Methods.getTrainsAtStation(stationQuery4);
        String result5 = Methods.getTrainsAtStation(stationQuery5);
        String result6 = Methods.getTrainsAtStation(stationQuery6);
                       
        assertEquals(stationQuery1 + ": Expected string not equal to result string: ", expResult1, result1);
        assertEquals(stationQuery2 + ": Expected string not equal to result string: ", expResult2, result2);
        assertEquals(stationQuery3 + ": Expected string not equal to result string: ", expResult3, result3);
        assertEquals(stationQuery4 + ": Expected string not equal to result string: ", expResult4, result4);
        assertEquals(stationQuery5 + ": Expected string not equal to result string: ", expResult5, result5);
        assertEquals(stationQuery6 + ": Expected string not equal to result string: ", expResult6, result6);
        
       
        System.out.println("done.");
    }

   
     // would use timeout rule however not sure if this version of junit uses it and with what syntax
    @Test
    public void testPopulate() {
        System.out.println("Populate test running...");
        
        ArrayList<Train> result = Methods.Populate();
        assertTrue(result != null);
        
       
       System.out.println("done.");
    }
    
}
