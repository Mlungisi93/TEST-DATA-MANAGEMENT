package com.expleo.tdm;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(//features = "classpath:features"
        features = "src/test/resources",
        glue = "com.expleo.tdm.StepDefs")

public class tdmTest {
}
