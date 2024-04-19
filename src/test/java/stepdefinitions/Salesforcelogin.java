package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Salesforcelogin {

    @Given("user navigates to SalesforceLogin page {string}")
    public void user_navigates_to_salesforce_login_page(String url) {
        System.out.println(url);
    }
    @When("user fills in username {string} and password {string}")
    public void user_fills_in_username_and_password(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }
    @Then("Login should be successfull")
    public void login_should_be_successfull() {
        System.out.println("Login successfull");

    }
}
