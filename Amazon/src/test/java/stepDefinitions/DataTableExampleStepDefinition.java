package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTableExampleStepDefinition extends WebAPI {
    static HomePage homePage;

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    @Given("I click on Account & Lists")
    public void i_click_on_account_lists() {
        homePage.clickOnHelloSignIn();
    }


    @Given("I enter Email or mobile phone number")
    public void i_enter_email_or_mobile_phone_number(DataTable dataTable) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> data = dataTable.asLists(String.class);
        String email = data.get(1).get(0);
//        System.out.println(email);
        homePage.enterEmailPhone(email);
    }

    @Given("I click on continue button")
    public void i_click_on_continue_button() {
        homePage.clickOnContinueForSignIn();
    }

    @Given("I enter password")
    public void i_enter_password(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String password = data.get(1).get(0);
        homePage.enterPasswordForSignIn(data.get(1).get(0));
        //homePage.enterPasswordForSignIn(password);
       // System.out.println(password);

    }

    @Given("I enter password from table")
    public void i_enter_password_from_table(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String password = data.get(0).get(0);
        homePage.enterPasswordForSignIn(data.get(0).get(0));
        //homePage.enterPasswordForSignIn(password);
        // System.out.println(password);

    }

    @Given("I click on signIn Button")
    public void i_click_on_sign_in_button() {
        homePage.clickOnSignInSubmit();
    }

    @Then("I should see {string}")
    public void i_should_see(String user) {
        homePage.verifyErrorMessage(user);
    }


    @Given("I enter Email or mobile phone number from table")
    public void i_enter_email_or_mobile_phone_number_from_table(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String email = data.get(0).get(0);
        //System.out.println(email);
        homePage.enterEmailPhone(email);
    }


    @Given("I enter user information")
    public void i_enter_user_information(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String name = data.get(0).get(0);
        String email = data.get(1).get(0);
        String password = data.get(2).get(0);
        String rePassword = data.get(3).get(0);

        System.out.println(name);
        System.out.println(email);
        System.out.println(password);
        System.out.println(rePassword);

      homePage.enterCustomerName(name);

    }

    @When("I click on Create your Amazon account")
    public void i_click_on_create_your_amazon_account() {
    homePage.clickOnCreateYourAmazonAccount();
    }

    @Then("I verify amazon account created successfully")
    public void i_verify_amazon_account_created_successfully() {

    }


    @Given("I enter user information from table")
    public void i_enter_user_information_from_table(List<List<String>> table) {
        Map<String, String> map = TableDictionaryConverter(table);
        System.out.println(map.get("YourName"));
        System.out.println(map.get("Email"));
        System.out.println(map.get("Password"));
        System.out.println(map.get("ReEnterPassword"));

        homePage.enterCustomerName(map.get("YourName"));

    }

    public static synchronized Map<String, String> TableDictionaryConverter(List<List<String>> data) {
        Map<String, String> mapTable = new HashMap<>();
        for (List<String> rows : data) {
            mapTable.put(rows.get(0), rows.get(1));
        }
        return mapTable;
    }

    @Then("I enter user information from table using multiple column")
    public void i_enter_user_information_from_table_using_multiple_column(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String yourName = data.get(1).get(0);
        String email = data.get(1).get(1);
        String password = data.get(1).get(2);
        String reEnterPassword = data.get(1).get(3);


        System.out.println(yourName);
        System.out.println(email);
        System.out.println(password);
        System.out.println(reEnterPassword);

        homePage.enterCustomerName(yourName);

    }


}


