package com.sha.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.sha.annotations.FrameworkAnnotation;
import com.sha.pages.LoginPage;
import com.sha.testdata.TestData;
import com.sha.utils.DataProviderUtils;

public class HomePageTest extends BaseTest{
	@FrameworkAnnotation
	@Test(description = "To check whether the user the title of orangehrm website homepage is displayed correctly",
            dataProvider = "getData", dataProviderClass = DataProviderUtils.class)
    public void titleValidationTest(TestData testdata) {

        LoginPage loginPage = new LoginPage();
        String actualTitle = loginPage
                .loginToApplication(testdata.username, testdata.password)
                .getHomePageTitle();

        Assert.assertEquals(actualTitle, testdata.expectedTitle);

    }

}
