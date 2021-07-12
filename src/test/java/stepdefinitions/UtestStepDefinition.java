package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.JoinToday;
import tasks.OpenUp;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage(){
       OnStage.setTheStage(new OnlineCast());
    }

    @Given("^A new user wants to register using the personal form$")
    public void aNewUserWantsToRegisterUsingThePersonalForm() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Pepito").wasAbleTo(OpenUp.thePage());
    }


    @When("^is registered correctly$")
    public void isRegisteredCorrectly(List<UtestData> data) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(
            JoinToday.withJoinButton()
        );
    }

    @Then("^validate label on last step of form$")
    public void validateLabelOnLastStepOfForm() {
        // Write code here that turns the phrase above into concrete actions

    }
}
