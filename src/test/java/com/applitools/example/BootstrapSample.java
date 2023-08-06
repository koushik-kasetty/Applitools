package com.applitools.example;

import com.applitools.eyes.selenium.Eyes;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapSample {

    @Test
    public void TestBootStapLayout(){
        WebDriver driver = new ChromeDriver();

        Eyes eyes = new Eyes();
        eyes.setApiKey("vbvibDbqrAg6MagqbtSy5103GuMfEcAVeINhGJ0OjTPHY110");
        eyes.open(driver,"Wellsfargo", "income-calculator");

        driver.get("https://www.wellsfargo.com/goals-credit/debt-to-income-calculator/");
        eyes.checkWindow();
        eyes.close();
    }
}
