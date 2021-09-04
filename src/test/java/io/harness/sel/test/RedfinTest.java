/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.harness.sel.test;

import io.harness.diegopereiraeng.junitselenium.DriverUtils1;
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
public class RedfinTest {
    
    public RedfinTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
   
    @Before
    public void setUp() {
       
        
    }
    
    @After
    public void tearDown() {
    }

   @Test
   public void testRedfin() throws InterruptedException{
        WebDriver driver=DriverUtils1.getChromeDriver();
       driver.get("http://www.redfin.com");
       driver.findElement(By.xpath("//div[@id='header-content']/header[2]/div[2]/button/span")).click();
       //driver.findElement(By.xpath("'//contains[@title= 'Sell Menu')]'")).click();
//       //driver.find_element_by_css_selector("[title^='Sell Menu']");
//       WebElement e=driver.findElement(By.cssSelector("[title*='Sell Menu']"));
////      Thread.sleep(1000);
//      e.click();
//      Thread.sleep(1000);
//      // driver.findElements(By.)
               
       //driver.findElement(By.linkText(linkText))
       //driver.findElement(By.id("topMenuWhySellRedfinLink")).click();
//       //driver.findElements(By.xpath((//input[@id='search-box-input'])[3]);
// //WebElement e=driver.findElement(By.partialLinkText("Sell"));
// driver.switchTo().activeElement();
//     new Select(e).selectByValue("Sell with Redfin");
//     
      
   }
}
