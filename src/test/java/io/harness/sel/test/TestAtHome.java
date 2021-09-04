/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.harness.sel.test;

import io.harness.diegopereiraeng.junitselenium.DriverUtils1;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;

/**
 *
 * @author diegopereiraeng
 */
public class TestAtHome {

    public TestAtHome() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }
 WebDriver driver;
    @Before
    public void setUp() {
         driver = DriverUtils1.getChromeDriver();
        Options option=driver.manage();
        Window W=option.window();
        W.maximize();
        option.timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        
        //driver.quit();
    }
    @Test
    public void testGoogleSearch() {
       
        
        driver.get("http://www.google.com");
        By by=By.name("q");
        WebElement e=driver.findElement(by);
        e.sendKeys("Selenium Jobs");
        e.submit();
        
        String title=driver.getTitle();
        assertTrue(title.contains("Selenium Jobs"));
        
        
        
    }
      /*
        @Test
        public void testNavigation(){
        
      Navigation Nav=driver.navigate();
      Nav.to("http://www.itexps.com");
      Nav.to("http://www.google.com");
            Nav.to("https://microsoft.com");
            Nav.back();
            Nav.forward();
            Nav.refresh();
    } */

}
