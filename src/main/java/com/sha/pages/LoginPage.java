package com.sha.pages;

import org.openqa.selenium.By;
import static com.sha.utils.SeleniumUtils.sendKeys;
import static com.sha.utils.SeleniumUtils.click;


public class LoginPage {
	
	private static final By TXTBOX_USERNAME = By.name("username");
	private static final By TXTBOX_PASSWORD = By.name("password");
	private static final By BTN_LOGIN = By.xpath("//button[@type='submit']");
	private static final By LNK_FORGOTPASSWORD = By.xpath("//p[text()='Forgot your password? ']");
	
	//Return the same page..Page Chaining
	private LoginPage setUserName(String username) {
		sendKeys(TXTBOX_USERNAME,username,"Username");
		return this;
	}
	
	private LoginPage setPassword(String password){
        sendKeys(TXTBOX_PASSWORD,password,"Password");
        return this;
    }
	
	
    private HomePage setLogin(){
        click(BTN_LOGIN, "Login Button"); 
        return new HomePage(); 
    }
    
    
    public HomePage loginToApplication(String username, String password){ 
        return setUserName(username)
                .setPassword(password)
                .setLogin();
    }
}
    
