package com.cybertek.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions"

        ,dryRun=false
        ,tags = "@wip or @learn or @teacher"
)
public class CucumbarRunner {
}
