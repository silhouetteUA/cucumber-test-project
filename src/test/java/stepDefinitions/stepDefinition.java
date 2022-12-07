package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Collections;
import java.util.List;

public class stepDefinition {

    @Given("User is on banking landing page")
    public void user_is_on_landing_page()   {
        System.out.println("I'm on the landing");
    }

    @When("User login to application with username and password")
    public void user_enters_login_password()    {
        System.out.println("username and password has been submitted");
    }

    @And("users cards are displayed")
    public void usersCardsAreDisplayed() {
        System.out.println("Logged in: I see all my cards");
    }

    @Then("Homepage is populated")
    public void homepageIsPopulated() {
        System.out.println("Logged in: I see my homepage");
    }


    @When("User login to application with username {string} and password {string}")
    public void userLoginToApplicationWithUsernameAndPassword(String username, String password) {
        System.out.println("username = " + username + ";  password = " +password + ";");
    }

    @And("users cards are not displayed")
    public void usersCardsAreNotDisplayed() {
        System.out.println("Nothing to see here ...");
    }

    @And("cards are displayed {string}")
    public void cardsAreDisplayed(String attribute) {
        System.out.println("cards are displayed: " + attribute);
    }

    @When("User login to application with the details")
    public void userLoginToApplicationWithTheDetails(DataTable table) {
        List<List<String>> obj = Collections.singletonList(table.asList());
        System.out.println("name: "+ obj.get(0).get(0));
    }


    @When("^Account login with (.+) and password (.+) and email (.+)$")
    public void accountLoginWithUsernameAndPasswordPasswordAndEmailEmail(String login, String pass, String email) {
        System.out.println("login: " + login);
        System.out.println("pass: " + pass);
        System.out.println("email: " + email);
    }

    @Given("user opens browser")
    public void userOpensBrowser() {
        System.out.println("Browser opened");
    }

    @When("browser version is being checked")
    public void browserVersionIsBeingChecked() {
        System.out.println("Browser version is being checked");
    }

    @Then("check complete")
    public void checkComplete() {
        System.out.println("check complete !");
    }
}
