package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition  extends WebAPI {
    static HomePage homePage;

    // Cucumber Hook
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on amazon homePage")
    public void i_am_on_amazon_home_page() throws IOException {
    // Call Action method
        openBrowser("https://www.amazon.com/");

    }


    @And("I enter {string} in searchBox")
    public void i_enter_in_search_box(String productName) {
        // Action method
        homePage.enterProductName(productName);
    }


    @When("I click on search Button")
    public void i_click_on_search_button() {

    }

    @Then("I should see Hand Sanitizer is properly appear")
    public void i_should_see_hand_sanitizer_is_properly_appear() {

    }

    @Then("I should not see mobile is appear")
    public void i_should_not_see_mobile_is_appear() {

    }

    @Then("I verify Hand Sanitizer in product title")
    public void i_verify_hand_sanitizer_in_product_title() {

    }


}
