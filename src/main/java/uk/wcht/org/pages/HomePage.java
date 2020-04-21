package uk.wcht.org.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.wcht.org.utility.Utility;

/*
Created By Bhavesh
*/public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());



    @FindBy(xpath = "//span[contains(text(),'Your account')]")
    WebElement _yourAccount;

    public void clickOnYourAccount() {
        Reporter.log("Clicking on your account link : " + _yourAccount.toString() + "<br>");
        clickOnElement(_yourAccount);
        log.info("Clicking on your account link : " + _yourAccount.toString());
    }

}