package runpackage;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = {"src/test/java/features/logintest.feature"},
        //path of step definition file
        glue = {"stepdefinitions"}
        //tags="@smoke"
)
public class Testrunner {
}
