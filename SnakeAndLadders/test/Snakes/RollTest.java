/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snakes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import snakesandladders.SnakesAndLadders;


/**
 *
 * @author jwalker15
 */
public class RollTest {
    
    public RollTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test

     public void testRoll()
     {
       
         int[] count = {0,0,0,0,0,0,0,0,0,0,0,0};
         
          for(int i=0; i<12000; i++){
          int result = SnakesAndLadders.roll(2,12);
          count [result -1] ++ ;
         }
          
          for (int i = 1; i < 12; i++) {
              System.out.println(count [i]);
         }
         
     }
}
