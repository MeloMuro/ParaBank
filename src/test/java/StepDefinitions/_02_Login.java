package StepDefinitions;


import Pages.Locators;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_Login {
    Locators Pbnk =new Locators();


    @When("Send keys user name as {string} password as {string} and click sign in button")
    public void sendKeysUserNameAsPasswordAsAndClickSignInButton(String userName2, String password2) {
        Pbnk.mySendKeys(Pbnk.userName2, userName2);
        Pbnk.mySendKeys(Pbnk.password2,password2);
        Pbnk.myClick(Pbnk.loginButton);
    }

    @Then("Fail message should de displayed")
    public void failMessageShouldDeDisplayed() { Pbnk.verifyContainsText(Pbnk.loginError, "Error!"); }


    @Then("User should login message")
    public void userShouldLoginMessage() { Pbnk.verifyContainsText(Pbnk.loginWelcome, "Welcome"); }

    @Then("Click to logout button")
    public void clickToLogoutButton() { Pbnk.myClick(Pbnk.logOut); }



}
