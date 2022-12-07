package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@Mytag")
    public void beforeMyTag()   {
        System.out.println("before MyTag Execution");
    }

    @After("@Mytag")
    public void afterMyTag()   {
        System.out.println("after MyTag Execution");
    }

}
