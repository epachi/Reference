package com.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:ATM.feature",
        glue = "classpath:com.test",
        plugin = "html:target/selenium-reports"
)
public class TestDriver {
}
