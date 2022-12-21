package com.demoqa.step_defenitions;

import com.demoqa.utils.ConfigurationReader;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {
    @Before
    public void setUpApiRequest(){
        RestAssured.baseURI = ConfigurationReader.getProperty("apiUrl");
    }
}
