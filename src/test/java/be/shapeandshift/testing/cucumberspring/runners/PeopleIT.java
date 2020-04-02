package be.shapeandshift.testing.cucumberspring.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@People",
        plugin = {"pretty", "json:target/cucumber/json/People.json", "html:target/cucumber/html/People.html"},
        strict = true
)
public class PeopleIT {

}
