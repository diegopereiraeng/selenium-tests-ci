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
public class EmailTest {
    
    public EmailTest() {
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
        option.timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
    }

   @Test
   public void testCreateProfile(){
       driver.get("http://hotmail.com");
       //By by=By.partialLinkText("Create free account");
       //WebElement e=driver.findElement(by);
       //e.click();
       
       //driver.findElement(By.partialLinkText("Create free account")).click();
       
       driver.findElement(By.xpath("//input[@id='MemberName']")).sendKeys("sampleNL");
       
       //by=By.id("Member Name");
       //e=driver.findElement(by);
       //e.sendKeys("sampleNL");
       
       
       driver.findElement(By.id("MemberName")).sendKeys("sampleNL");
      // driver.findElement(By.name("LiveDomainBoxList")).sendKeys("hotmail.com");
       driver.findElement(By.id("iSignupAction")).click();
       
       driver.findElement(By.xpath("//input[@name='LiveDomainBoxList']")).sendKeys("hotmail.com");
       
   }
   @Test
   public void testSignin() throws InterruptedException{
      driver.get("http://www.hotmail.com"); // Navigate
        driver.findElement(By.partialLinkText("Sign in")).click();
        driver.findElement(By.id("i0116")).sendKeys("SelSample@hotmail.com");
        driver.findElement(By.className("btn-primary")).click();
        Thread.currentThread().sleep(3000);
        driver.findElement(By.name("passwd")).sendKeys("Sel@123!");
        driver.findElement(By.name("KMSI")).click();
        driver.findElement(By.id("idSIButton9")).click();
   }
   
   
}

