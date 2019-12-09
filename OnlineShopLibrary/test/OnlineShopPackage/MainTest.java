/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineShopPackage;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jwalker15
 */
public class MainTest {
    
    public MainTest() {
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
     * Test of searchProduct method, of class Main.
     */
    @Test
    public void testSearchProduct() {
        System.out.println("searchProduct");
        ProductTest car = new ProductTest();
        String name = car.getName();
        String expResult = "Car";
        String result = Main.searchProduct(name);
        assertEquals(expResult, result);
      
       
    }

    
    
       @Test
    public void testReorder() {
        System.out.println("testReorder");
        ProductTest car = new ProductTest();
        int carStock = car.getStock();
        
        boolean expResult = true;
        boolean result = car.isReorder();
        assertEquals(expResult, result);
      
       
    }
    
    
    
    
    
    
    
    
    
    
    /**
     * Test of purchaseProduct method, of class Main.
     */
    
    /*
    @Test
    public void testPurchaseProduct() {
        System.out.println("purchaseProduct");
        String name = "";
        Main instance = new Main();
        instance.purchaseProduct(name);
        
        fail("Result not equal to expected");
    }
      */
}
