/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.harness.sel.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diegopereiraeng
 */
public class UnderstandAnnotationTest {
    
    public UnderstandAnnotationTest() {
    }
    
    @BeforeClass
    public static void setUpClass(){
        System.out.println("running SetUpClass()");
            
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("running tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("runnung setUp()");
    }
    
    @After
    public void tearDown() {
        System.out.println("running tearDown()");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         System.out.println("running testMethod()");}
}
