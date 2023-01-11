package com.sha.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sha.driver.Driver;

public class BaseTest {
	
	@BeforeMethod
    public void setUp() {
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }

}
