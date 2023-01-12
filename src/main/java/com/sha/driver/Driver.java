package com.sha.driver;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.sha.config.ConfigFactory;

public final class Driver {
	
	private Driver() {}
	
	public static void initDriver() throws MalformedURLException {
		String browser = ConfigFactory.getConfig().browser();
		String runmode = ConfigFactory.getConfig().runmode();
		
		if(DriverManager.getDriver() == null) {
			WebDriver driver = DriverFactory.getDriver(browser,runmode);
			DriverManager.setDriver(driver);
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);
			DriverManager.getDriver().get(ConfigFactory.getConfig().url());
			
		}
	}
	
	public static void quitDriver() {
		if(DriverManager.getDriver()!=null) {
			DriverManager.getDriver().quit();
			DriverManager.setDriver(null);
		}
	}

}
