package uk.wcht.org.testsuit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.wcht.org.pages.HomePage;
import uk.wcht.org.pages.YourAccountPage;
import uk.wcht.org.testbase.TestBase;

/*
Created By Bhavesh
*/
public class YourAccountTest extends TestBase {

HomePage homePage;
YourAccountPage yourAccountPage;

@BeforeMethod
public void setUp(){
    homePage = new HomePage();
    yourAccountPage = new YourAccountPage();

}

@Test (groups = "regression")
    public void verifyUserShouldNavigateToAccountPage(){

    homePage.clickOnYourAccount();
    String expectedText = "It's easy to manage your tenancy with an online account.";
    String actualText = yourAccountPage.getWelcomeText();
    Assert.assertEquals(expectedText,actualText);

}

}
