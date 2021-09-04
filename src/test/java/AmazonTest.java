/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import io.harness.diegopereiraeng.junitselenium.DriverUtils1;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;

/**
 *
 * @author diegopereiraeng
 */
public class AmazonTest {
    
    public AmazonTest() {
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
        WebDriver.Options option= driver.manage();
        WebDriver.Window w=option.window();
        w.maximize();
        option.timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
    }

 @Test
 public void testAmazon(){
     Navigation nav = driver.navigate();
     nav.to("http://www.amazon.com");
     By by = By.id("nav-hamburger-menu");
     WebElement e= driver.findElement(by);
     //e.sendKeys("corona virus mask");
     e.submit();
     
 }
}
