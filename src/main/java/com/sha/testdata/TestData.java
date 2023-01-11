package com.sha.testdata;

import com.creditdatamw.zerocell.annotation.Column;


//Map the excel field header values
public class TestData {
	
		
		@Column(name = "testcasename", index = 0)
	    public String testCaseName;

	    @Column(name = "username",index = 1)
	    public String username;

	    @Column(name= "password",index = 2)
	    public String password;

	    @Column(name="expectedtitle",index=3)
	    public String expectedTitle;
	    
	    

}
