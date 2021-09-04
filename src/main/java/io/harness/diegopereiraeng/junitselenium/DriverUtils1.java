/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.harness.diegopereiraeng.junitselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


/**
 *
 * @author diegopereiraeng
 */
public class DriverUtils1 {
    
    public static WebDriver getChromeDriver(){
         System.setProperty("webdriver.chrome.driver", "/Users/diegopereira/Documents/Development/chromedriver");
        try {
            String seleniumServerURL = System.getenv("SELENIUM_SERVER_URL");
            if (seleniumServerURL == null){

                seleniumServerURL = "http://34.136.12.142:4444/wd/hub";
            }
            ChromeOptions chromeOptions = new ChromeOptions();
            return new RemoteWebDriver(new URL(seleniumServerURL), chromeOptions);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return new ChromeDriver();
        }



}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      getChromeDriver();
    }
    
}
