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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author diegopereiraeng
 */
public class FacebookTestJoe {
    
    public FacebookTestJoe() {
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
        option.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
        //driver.quit();
    }

  @Test
public void testFacebookSignin(){
    driver.get("http://facebook.com");
    driver.findElement(By.name("firstname")).sendKeys("Rohela");
    driver.findElement(By.name("lastname")).sendKeys("Joe");
    driver.findElement(By.name("reg_email__")).sendKeys("seleniumdummy2020@gmail.com");
    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("seleniumdummy2020@gmail.com");
    driver.findElement(By.name("reg_passwd__")).sendKeys("P@ssword2020");
    WebElement e=driver.findElement(By.id("month"));
    new Select(e).selectByIndex(2);
    driver.findElement(By.id("day")).sendKeys("08");
    driver.findElement(By.id("year")).sendKeys("1988");
    driver.findElements(By.name("sex")).get(0).click();
   driver.findElement(By.name("websubmit")).click();
   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("IT Expert System,Inc");
   driver.findElement(By.xpath("//input[@name='q']")).submit();
}

   public void testLoginWarpper() throws InterruptedException{
   testLogin();
   testLogin();
   }
@Test
   public void testLogin() throws InterruptedException{
       driver.get("http://facebook.com");
       driver.findElement(By.id("email")).sendKeys("seleniumdummy2020@gmail.com");
       driver.findElement(By.id("pass")).sendKeys("P@ssword2020");
       driver.findElement(By.id("loginbutton")).click();
       //driver.quit();
       //driver.switchTo().alert().accept();
       //driver.findElement(By.name("xhpc_message")).sendKeys("Hello Everyone");
       //driver.switchTo().alert().accept();
}
}
