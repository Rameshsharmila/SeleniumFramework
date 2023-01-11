package com.sha.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sha.config.ConfigFactory;
import com.sha.driver.DriverManager;
import com.sha.enums.WaitType;
import com.sha.reports.ExtentLogger;

public final class SeleniumUtils {
	
	private SeleniumUtils() {}

	//CLICK
	public static void click(By by, String elementName){
        WebElement element = waitUntilElementPresent(by);
        element.click();
        ExtentLogger.pass(elementName + " is clicked successfully");
    }

    public static void click(WebElement element){
        element.click();
    }

    public static void click(By by, WaitType waitType){
        WebElement element = null;
       
        if(waitType == WaitType.PRESENCE){
            element = waitUntilElementPresent(by);
        } 
        else if(waitType == WaitType.CLICKABLE){
            element = waitUntilElementToBeClickable(by);
        } 
        else if(waitType == WaitType.VISIBLE){
            element = waitUntilElementToBeVisible(by);
        }
        
        element.click();
    }

    public static void sendKeys(By by, String value, String elementName){
        WebElement element = waitUntilElementPresent(by);
        element.sendKeys(value);
       
        ExtentLogger.pass(value + " is entered "+ " successfully in "+elementName);
    }
    
    
    private static WebElement waitUntilElementToBeVisible(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    

    private static WebElement waitUntilElementPresent(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
       
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    
    
    private static WebElement waitUntilElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
       
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

}
