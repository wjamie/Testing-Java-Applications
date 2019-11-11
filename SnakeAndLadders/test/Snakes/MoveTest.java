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
public class MoveTest {
    
    public MoveTest() {
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
    @Test
    public void estCalculatePosition(){
       
        int expected13 = 13;
        assertEquals("Wrong value", expected13,  SnakesAndLadders.calculatePosition(1,12));
        
        int expected4 = 4;
        assertEquals("Wrong value", expected4,  SnakesAndLadders.calculatePosition(2,2));
    }

    
    
}
