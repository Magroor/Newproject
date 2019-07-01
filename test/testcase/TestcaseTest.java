/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sp16-bse-078
 */
public class TestcaseTest {
    
    public TestcaseTest() {
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
     * Test of main method, of class Testcase.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Testcase.main(args);
       
    }

    /**
     * Test of sum method, of class Testcase.
     */
    @Test
    public void testSum() {
        System.out.println("sum0");
        int n1 = 0;
        int n2 = 0;
        double expResult = 0.0;
        double result = Testcase.sum(n1, n2);
        assertEquals(expResult, result, 0.0);
        
        
    }
    
       @Test
    public void testSum1() {
        System.out.println("sum1");
        int n1 = 0;
        int n2 = 0;
        double expResult = 0.0;
        double result = Testcase.sum(n1, n2);
       assertEquals(10.0, Testcase.sum(7, 3), 10.0);
        
    }
    
          @Test
    public void testSum2() {
        System.out.println("sum2");
        int n1 = 0;
        int n2 = 0;
        double expResult = 0.0;
        double result = Testcase.sum(n1, n2);
      assertEquals(6.0, Testcase.sum(-4, -2), 6.0);
        
    }
    

    /**
     * Test of sub method, of class Testcase.
     */
    @Test
    public void testSub() {
        System.out.println("sub0");
        int n1 = 0;
        int n2 = 0;
        double expResult = 0.0;
        double result = Testcase.sub(n1, n2);
        assertEquals(4.0, Testcase.sub(7, 3), 4.0);
       
     
    }

    
      @Test
    public void testSub1() {
        System.out.println("sub1");
        int n1 = 0;
        int n2 = 0;
        double expResult = 0.0;
        double result = Testcase.sub(n1, n2);
       
        assertEquals(-4.0, Testcase.sub(3, 7), -4.0);
     
    }
    
      @Test
    public void testSub2() {
        System.out.println("sub2");
        int n1 = 0;
        int n2 = 0;
        double expResult = 0.0;
        double result = Testcase.sub(n1, n2);
     
        assertEquals(-2.0, Testcase.sub(4, 2), -2.0);
     
    }
    
    
    /**
     * Test of div method, of class Testcase.
     */
    @Test
    public void testDiv() {
        System.out.println("div0");
        int n1 = 0;
        int n2 = 0;
        double expResult = 0.0;
        double result = Testcase.div(n1, n2);
        assertEquals(expResult, result, 0.0);

    }
    
       @Test
    public void testDiv1() {
        System.out.println("div1");
     
        assertEquals(5.0, Testcase.div(10, 2), 5.0);
       
    }
    
       @Test
    public void testDiv2() {
        System.out.println("div2");
  
        assertEquals(2.0, Testcase.div(10, 5), 2.0);
    }

    /**
     * Test of mul method, of class Testcase.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        int n1 = 0;
        int n2 = 0;
        double expResult = 0.0;
        double result = Testcase.mul(n1, n2);
        assertEquals(expResult, result, 0.0);
        assertEquals(1.0, Testcase.mul(1, 1), 1.0);
         assertEquals(10.0, Testcase.mul(2, 5), 10.0);
        
    }
    
    
        @Test
    public void testMul1() {
        System.out.println("mul");
        int n1 = 0;
        int n2 = 0;
        double expResult = 0.0;
        double result = Testcase.mul(n1, n2);

        assertEquals(1.0, Testcase.mul(1, 1), 1.0);
        
        
    }
    
        @Test
    public void testMul2() {
        System.out.println("mul");
        int n1 = 0;
        int n2 = 0;
        double expResult = 0.0;
        double result = Testcase.mul(n1, n2);
  
         assertEquals(10.0, Testcase.mul(2, 5), 10.0);
        
    }
}
