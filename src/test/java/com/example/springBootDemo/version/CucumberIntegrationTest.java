package com.example.springBootDemo.version;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Administrator on 2018/11/15.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/cucumber/features")
public class CucumberIntegrationTest extends SpringIntegrationTest {
}
