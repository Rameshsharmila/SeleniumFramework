package com.sha.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sha.config.ConfigFactory;

public final class RemoteDriverFactory {
	
	private RemoteDriverFactory() {}
	
	public static WebDriver getRemoteDriver(String browserName) throws MalformedURLException {
		
		DesiredCapabilities capability = new DesiredCapabilities();
		WebDriver driver = null;
		String remoteurl = ConfigFactory.getConfig().remoteurl();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			capability.setBrowserName("chrome");
			
		} 
		else if(browserName.equalsIgnoreCase("firefox")) {
			capability.setBrowserName("firefox");
		}
		
		driver = new RemoteWebDriver(new URL(remoteurl),capability);
		return driver;
	}
	

}
