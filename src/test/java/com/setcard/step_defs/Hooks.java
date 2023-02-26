package com.setcard.step_defs;

import com.setcard.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.setcard.utilities.Log4j;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){

        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();



    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }


       scenario.log(scenario.getName());
       scenario.log(String.valueOf(scenario.getStatus()));

       Log4j.endLog(scenario.getName());

       Driver.closeDriver();
    }
}
