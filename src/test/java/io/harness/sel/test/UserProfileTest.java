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
import org.openqa.selenium.WebDriver;

/**
 *
 * @author diegopereiraeng
 */
public class UserProfileTest {
    
    public UserProfileTest() {
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
        option.timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
    }
//
//    @Test
//    public void testUserProfile(){
// driver.get("file:///C:/Users/diegopereiraeng/Documents/user%20profile.html");
////        driver.findElements(By.tagName("input")).get(1).sendKeys("abc");
////        driver.findElements(By.tagName("input")).get(0).sendKeys("xyz");
////         driver.findElements(By.tagName("input")).get(4).click();
////         //driver.findElements(By.tagName("input")).get(1).getTagName();
////         
//         WebElement e=driver.findElement(By.tagName("select"));
//         new Select(e).selectByVisibleText("PhD");
         
         
   // }
    @Test
    public void testProfileRadio(){
        
        driver.get("file:///C:/Users/diegopereiraeng/Documents/user%20profile.html");
        //driver.findElements(By.name("g").get(1).click());
    }
    }
    

