package com.test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStepdefs {
    WebDriver driver;

    @Then("^I should see that title contains tutorials$")
    public void iShouldSeeThatTitleContainsTutorials() throws Throwable {
        assert driver.getTitle().toLowerCase().contains("tutorials");
        driver.close();
        driver.quit();
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Given("^I am on the home page of softpost$")
    public void iAmOnTheHomePageOfSoftpost() throws Throwable {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.yahoo.com");
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }
}
