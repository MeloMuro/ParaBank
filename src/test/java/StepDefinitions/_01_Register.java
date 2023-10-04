package StepDefinitions;

import Pages.Locators;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_Register {
    Locators Pbnk = new Locators();

    @Given("Navigate to para bank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("Click to register")
    public void clickToRegister() {
        Pbnk.myClick(Pbnk.registerBtn);
    }

    @Then("User should form message")
    public void userShouldFormMessage() {
        Pbnk.verifyContainsText(Pbnk.formButMess, "Signing up is easy");
    }

    @And("Send keys in locators")
    public void sendKeysInLocators(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i =0;  i<items.size(); i++) {
            WebElement e = Pbnk.getWebelement(items.get(i).get(0));
            String data = items.get(i).get(1);
            Pbnk.mySendKeys(e, data);

        }
    }

    @And("Click to register button")
    public void clickToRegisterButton() {
        Pbnk.myClick((Pbnk.registerOnyBtn));
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() { Pbnk.verifyContainsText(Pbnk.welcomeMsg, "Welcome");
    }
}
