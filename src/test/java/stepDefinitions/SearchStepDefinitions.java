package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class SearchStepDefinitions extends BaseTest {

    By searchBox = By.name("q");

    @Given("browser is open")
    public void browser_is_open(){
        setUp();
    }

    @And("user is on the google main page")
    public void user_is_on_the_google_main_page() {
        driver.get("https://www.google.com");
    }
    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        //driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        waitFor(4).until(ExpectedConditions.elementToBeClickable(driver.findElement(searchBox)));
        driver.findElement(searchBox).sendKeys("automation step by step");
    }
    @And("hits enter")
    public void hits_enter() {
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }
    @Then("user is navigated to the search results")
    public void user_is_navigated_to_the_search_results() throws TimeoutException {
       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       // System.out.println(driver.getPageSource());
        waitFor(10).until(d -> driver.getPageSource().contains("Automation Step by Step: NEVER STOP LEARNING"));
        Assert.assertTrue(driver.getPageSource().contains("Automation Step by Step: NEVER STOP LEARNING"));
        tearDown();
    }
}
