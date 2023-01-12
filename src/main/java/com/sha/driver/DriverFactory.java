package com.sha.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sha.config.ConfigFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class DriverFactory {
	
	private DriverFactory() {}
	
	public static WebDriver getDriver(String browserName, String runmode) throws MalformedURLException {
		WebDriver driver = null;
		
		
		if(runmode.equalsIgnoreCase("local")) {
			
			driver = LocalDriverFactory.getLocalDriver(browserName);
			
		}
		else if(runmode.equalsIgnoreCase("remote")) {
			
			driver = RemoteDriverFactory.getRemoteDriver(browserName);
		}
		
		
		
		return driver;
	}

}
