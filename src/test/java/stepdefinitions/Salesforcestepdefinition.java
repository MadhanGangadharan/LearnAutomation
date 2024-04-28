package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import loginPage.SalesforceLoginPage;
import org.testng.Assert;

public class Salesforcestepdefinition {
    SalesforceLoginPage accessloginpage =new SalesforceLoginPage();

    @Given("user navigates to SalesforceLogin page {string}")
    public void user_navigates_to_salesforce_login_page(String url) {
        accessloginpage.loadurl(url);
    }
    @When("user fills in username {string} and password {string}")
    public void user_fills_in_username_and_password(String username, String password) {
        accessloginpage.enterUsername(username);
        accessloginpage.enterUserPassword(password);
    }
    @Then("Login should be successfully")
    public void loginShouldBeSuccessfully(){
        // click login button
        // title verification
        Assert.assertEquals(accessloginpage.clickLoginbutton(),"Home | Salesforce");
        accessloginpage.Quit();  // @before test and @after test
    }
    @Then("Login should fail with the error")
    public void loginShouldFailWithTheError() {
        Assert.assertEquals(accessloginpage.clickLoginbuttonNegative(),"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
        accessloginpage.Quit();

    }
    @Then("Login should be successfull and create a new account {string}")
    public void loginShouldBeSuccessfullAndCreateANewAccount(String acctName) {
        Assert.assertEquals(accessloginpage.clickLoginbutton(),"Home | Salesforce");
        accessloginpage.createNewAccount(acctName);

    }
}
