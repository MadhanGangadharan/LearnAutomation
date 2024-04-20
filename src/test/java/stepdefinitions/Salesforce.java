package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import login.Loginmainclass;

public class Salesforce {

    Loginmainclass l =new Loginmainclass();

    @Given("user navigates to SalesforceLogin page {string}")
    public void user_navigates_to_salesforce_login_page(String url) {
        l.loadurl(url);
        //System.out.println(url);
    }
    @When("user fills in username {string} and password {string}")
    public void user_fills_in_username_and_password(String username, String password) {
        l.enterUsername(username, password);
//        System.out.println(username);
//        System.out.println(password);
    }

    @Then("Login should be successfully")
    public void loginShouldBeSuccessfully() {
        l.clickLoginbutton();
        System.out.println("Logged in Successfully");
    }
}
