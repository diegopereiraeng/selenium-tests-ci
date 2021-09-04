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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author diegopereiraeng
 */
public class FacebookTestRohela {
    
    public FacebookTestRohela() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    WebDriver driver;
    WebDriver option;
    WebDriver w;
    
    @Before
    public void setUp() {
        driver = DriverUtils1.getChromeDriver();
        WebDriver.Options option= driver.manage();
        WebDriver.Window w=option.window();
        w.maximize();
        option.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
    }
public void testFacebook() throws InterruptedException{
     driver.get("https://www.facebook.com/");
        WebDriver.Options option=driver.manage();
        WebDriver.Window w=option.window();
        w.maximize();
        option.timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        String title=driver.getTitle();
        assertTrue(title.contains("Facebook"));
       
        By firstName=By.name("firstname");
        WebElement e3=driver.findElement(firstName);
        e3.sendKeys("Rohela");
       
        By lastName=By.name("lastname");
        WebElement e4=driver.findElement(lastName);
        e4.sendKeys("joe");
       
        By email=By.name("reg_email__");
        WebElement e5=driver.findElement(email);
        e5.sendKeys("seleniumdummy2020@gmail.com");
       
        By re_enterEmail=By.name("reg_email_confirmation__");
        WebElement e6=driver.findElement(re_enterEmail);
        e6.sendKeys("seleniumdummy2020@gmail.com");
       
        By password=By.name("reg_passwd__");
        WebElement e7=driver.findElement(password);
        e7.sendKeys("P@ssword2020");
       
        WebElement e20=driver.findElement(By.id("month"));
        new Select(e20).selectByIndex(2);
       
        By birthDay=By.id("day");
        WebElement e9=driver.findElement(birthDay);
        e9.sendKeys("24");
       
        By birthYear=By.id("year");
        WebElement e10=driver.findElement(birthYear);
        e10.sendKeys("1988");
       
        By gender=By.name("sex");
        WebElement e11=driver.findElement(gender);
        e11.click();
       
        driver.findElement(By.name("websubmit")).click();
        
        
         By message=By.name("xhpc_message");
        WebElement e13=driver.findElement(message);
        e13.sendKeys("Hello Everyone!");
}
@Test
        public void testFacebookLogin() throws InterruptedException{
     driver.get("https://www.facebook.com/");
        WebDriver.Options option=driver.manage();
        WebDriver.Window w=option.window();
        w.maximize();
        option.timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        String title=driver.getTitle();
        assertTrue(title.contains("Facebook"));
       
           
        By enterEmail=By.name("email");
        WebElement e=driver.findElement(enterEmail);
        e.sendKeys("redolent_r@yahoo.com");
       
        By enterPassword=By.id("pass");
        WebElement e2=driver.findElement(enterPassword);
        e2.sendKeys("sapphire2429#*");
       
               
        By login=By.id("loginbutton");
        WebElement e12=driver.findElement(login);
        
         By message=By.name("xhpc_message");
        WebElement e13=driver.findElement(message);
        e13.sendKeys("Hello Everyone!");
        }

}
