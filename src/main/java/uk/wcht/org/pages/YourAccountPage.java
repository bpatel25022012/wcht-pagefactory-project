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
*/
public class YourAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(YourAccountPage.class.getName());


@FindBy (xpath = "//span[contains(text(),\"It's easy to manage your tenancy with an online ac\")]")
    WebElement _welcomeText;


public String getWelcomeText(){
    Reporter.log("Getting text from : " + _welcomeText.toString() + "<br>");
    log.info("Getting text from " +_welcomeText.toString());
    return getTextFromElement(_welcomeText);
}

}
