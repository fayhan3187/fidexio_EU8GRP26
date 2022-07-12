package com.fidexio.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to each scenario and each step
 */

import com.fidexio.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value
        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        Driver.closeDriver();


    }
}