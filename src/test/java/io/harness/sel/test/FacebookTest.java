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
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author diegopereiraeng
 */
public class FacebookTest {
    
    public FacebookTest() {
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
   
//   driver.switchTo().activeElement();
//   driver.findElement(By.id("mainContainer")).click();
//     //new Select(e).selectByIndex(1);
   //driver.findElement(By.name("reg_email_confirmation__"));
      //driver.findElement(By.name("websubmit")).click();

    
    }
    
   @Test
   public void testLogin() throws InterruptedException{
       driver.get("http://facebook.com");
       driver.findElement(By.id("email")).sendKeys("seleniumdummy2020@gmail.com");
       driver.findElement(By.id("pass")).sendKeys("P@ssword2020");
       driver.findElement(By.id("loginbutton")).click();
       driver.findElement(By.name("xhpc_message")).sendKeys("Hello Everyone");
       
//       By message=By.name("xhpc_message");
//        WebElement e13=driver.findElement(message);
//        e13.sendKeys("Hello Everyone!");
//        
        
//        WebElement e = driver.findElement(By.id("userNavigationLabel"));
//        Thread.sleep(1000);
//        e.click();

   }
   

@Test
public void testFacebook() throws InterruptedException{
     driver.get("https://www.facebook.com/");
        Options option=driver.manage();
        Window w=option.window();
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
        
        //Thread.sleep(3000);
       
        By search=By.xpath("//input[@name='q']");
        WebElement e90=driver.findElement(search);
        e90.sendKeys("IT Expert System,Inc");
        e90.submit();
       
             //Thread.sleep(3000);   
        driver.navigate().refresh();
        driver.navigate().back();
       
        By message=By.name("xhpc_message");
        WebElement e13=driver.findElement(message);
        e13.sendKeys("Hello Everyone!");

}
}