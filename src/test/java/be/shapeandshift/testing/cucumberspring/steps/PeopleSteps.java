package be.shapeandshift.testing.cucumberspring.steps;

import be.shapeandshift.testing.cucumberspring.CucumberSpringApplicationTests;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PeopleSteps extends CucumberSpringApplicationTests {

    @Given("^I set my parameters1$")
    public void setParameters1() {
        System.out.println("TEST 1");
    }
    @When("^I set my parameters2$")
    public void setParameters2() {
        System.out.println("TEST 1");
    }
    @Then("^I set my parameters3$")
    public void setParameters3() {
        System.out.println("TEST 1");
    }
}
