package com.sha.tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sha.driver.Driver;

public class BaseTest {
	
	@BeforeMethod
    public void setUp() throws MalformedURLException {
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }

}
