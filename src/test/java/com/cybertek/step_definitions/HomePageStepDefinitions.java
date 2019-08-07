package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.SignInPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStepDefinitions {
    SignInPage signin=new SignInPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        System.out.println("I am opening the login page");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in as a team lead")
    public void user_logs_in_as_a_team_lead() {
        System.out.println("I am logging in");
        System.out.println("email: "+ConfigurationReader.getProperty("leader_email"));
        System.out.println("password: "+ConfigurationReader.getProperty("leader_password"));


        signin.emailLocator.sendKeys(ConfigurationReader.getProperty("leader_email"));
        signin.passwordLocator.sendKeys(ConfigurationReader.getProperty("leader_password"));
        signin.signInButtonLocator.click();
    }

    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {
    System.out.println("I can see homepage");
    MapPage mapPage= new MapPage();
    String expectedPageName="map";
        BrowserUtils.waitFor(5);
    String actualPageName=mapPage.mapPageNameLocator.getText();
        System.out.println(actualPageName);
        Assert.assertEquals(expectedPageName, actualPageName);

    }

    @When("user logs in as a student team member")
    public void user_logs_in_as_a_student_team_member() {
        System.out.println("logging as a student team member");
        //Do I have to use SignInPage every time to sign in?

        signin.emailLocator.sendKeys(ConfigurationReader.getProperty("student_username"));
        signin.passwordLocator.sendKeys(ConfigurationReader.getProperty("student_password"));
        signin.signInButtonLocator.click();
    }




    @When("user logs in as a teacher")
    public void user_logs_in_as_a_teacher() {
        System.out.println("logging as teacher");
        signin.emailLocator.sendKeys(ConfigurationReader.getProperty("team_leademail"));
        signin.passwordLocator.sendKeys(ConfigurationReader.getProperty("team_leadpassword"));
         signin.signInButtonLocator.click();


    }


}
