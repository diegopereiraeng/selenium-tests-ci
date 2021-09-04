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

/**
 *
 * @author diegopereiraeng
 */
public class UserProfile {
    
    public UserProfile() {
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

    @Test
    public void testUserProfile(){
        driver.get("file:///C://Users/diegopereiraeng/Documents/userprofile.html");
        driver.findElements(By.tagName("input")).get(1).sendKeys("abc");
    }
    
}
