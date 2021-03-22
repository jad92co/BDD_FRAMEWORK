package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.ID, using =searchBoxLocator ) public WebElement searchBox;
    @FindBy (how = How.ID, using =searchButtonLocator ) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;
    @FindBy (how = How.XPATH, using =helloSignInLocator ) public WebElement helloSignIn;
    @FindBy (how = How.XPATH, using =emailPhoneForSignInLocator ) public WebElement emailPhoneForSignIn;
    @FindBy (how = How.XPATH, using =passwordForSignInLocator ) public WebElement passwordForSignIn;
    @FindBy (how = How.XPATH, using =continueForSignInLocator ) public WebElement continueForSignIn;
    @FindBy (how = How.XPATH, using =signInSubmitLocator ) public WebElement signInSubmit;
    @FindBy (how = How.XPATH, using =helloUserLocator ) public WebElement helloUser;
    @FindBy (how = How.XPATH, using =errorMessageLocator ) public WebElement errorMessage;
    @FindBy (how = How.XPATH, using =customerNameLocator ) public WebElement customerName;
    @FindBy (how = How.XPATH, using =createYourAmazonAccountLocator ) public WebElement createYourAmazonAccount;




    public void enterProductName( String productName){
        searchBox.sendKeys(productName);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public void verifySearchResult(String expectedText){
        String actualText=searchText.getText();
        Assert.assertEquals("Product does not match",expectedText,actualText);
    }

    public void verifySearchResultNotMatch(String expectedText){
        String actualText=searchText.getText();
        Assert.assertNotEquals("Product does not match",expectedText,actualText);
    }

    public void verifyPageTitle(String expectedText){
        String actualText=driver.getTitle();
        Assert.assertEquals("Page Title not match",expectedText,actualText);
    }

    public void clickOnHelloSignIn(){
        helloSignIn.click();
    }
    public void enterEmailPhone( String emailPhone){
        emailPhoneForSignIn.sendKeys(emailPhone);
    }

    public void clickOnContinueForSignIn(){
        continueForSignIn.click();
    }
    public void enterPasswordForSignIn( String password){
        passwordForSignIn.sendKeys(password);
    }
    public void clickOnSignInSubmit(){
        signInSubmit.click();
    }

    public void verifyUserLoggedIn(String expectedText){
        String actualText=helloUser.getText();
        Assert.assertEquals("Product does not match",expectedText,actualText);
    }
    public void verifyErrorMessage(String expectedText){
        String actualText=errorMessage.getText();
        Assert.assertEquals("Product does not match",expectedText,actualText);
    }

    public void enterCustomerName( String name){
        customerName.sendKeys(name);
    }

    public void clickOnCreateYourAmazonAccount(){
        createYourAmazonAccount.click();
    }

}
