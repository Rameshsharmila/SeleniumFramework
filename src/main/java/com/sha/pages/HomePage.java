package com.sha.pages;

import com.sha.driver.DriverManager;

public class HomePage {
	
	
	public String getHomePageTitle(){
        return DriverManager.getDriver().getTitle();
    }


}
