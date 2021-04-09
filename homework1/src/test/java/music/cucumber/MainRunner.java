package music.cucumber;

import org.junit.runner.RunWith;
import music.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/")

public class MainRunner extends TestBase{

}