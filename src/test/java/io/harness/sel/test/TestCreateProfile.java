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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author diegopereiraeng
 */
public class TestCreateProfile {
    
    public TestCreateProfile() {
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
public void testCreateProfile(){
    
    
    
   /* By by=By.partialLinkText("Create free account");
    WebElement e=driver.findElement(by);
    e.click(); */
    
    
    /*by=By.id("MemberName");
    e=driver.findElement(by);
    e.sendKeys("SampleNL"); */
    
    driver.get("https://www.hotmail.com");
    driver.findElement(By.partialLinkText("Create free account")).click();
    driver.findElement(By.id("MemberName")).sendKeys("SampleNL");
//  driver.findElement(By.name("LiveDomainBoxList")).sendKeys("hotmail.com");
    driver.findElement(By.id("iSignupAction")).click();
}

@Test
public void testSignin() throws InterruptedException{
    driver.get("https://hotmail.com");
    driver.findElement(By.partialLinkText("Sign in")).click();
    Thread.currentThread().sleep(500);
   driver.findElement(By.id("i0116")).sendKeys("SelSample@hotmail.com");
    Thread.currentThread().sleep(1000);
// driver.findElement(By.className("btn-primary")).click();
driver.findElement(By.id("idSIButton9")).click();
//Thread.currentThread().sleep(3000);//explicit time out

WebElement e=driver.findElement(By.id("i0118"));
new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(e));
e.sendKeys("Sel@123");
 //used up driver.findElement(By.id("i0118")).sendKeys("Sel@123!");
 //driver.findElement(By.name("passwd")).sendKeys("Sel@123");
driver.findElement(By.name("KMSI")).click();
driver.findElement(By.id("idSIButton9")).click();
    
}



}
