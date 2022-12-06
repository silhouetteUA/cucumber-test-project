package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
}
