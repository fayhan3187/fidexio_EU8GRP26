package com.fidexio.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty", //basically it just prints out additional information
                           // about the scenario that is being executed.
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/fidexio/step_definitions",
        dryRun = false,
        tags = "@FIDE-1064"
        // publish = true //enable a functionality from cucumber to generate a public link for the
                          // report of our final execution of our code

)
public class CukesRunner {
}
