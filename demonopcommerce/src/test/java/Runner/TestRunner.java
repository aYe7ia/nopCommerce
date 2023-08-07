package Runner;

import Base.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"Steps"},
        tags = "@smoke"
)
public class TestRunner extends TestBase {

}
