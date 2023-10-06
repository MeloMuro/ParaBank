package StepDefinitions;

import Pages.ahmetLocators;
import Pages.ahmetLocators2;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AhmetNewAccount {
    ahmetLocators ahmet=new ahmetLocators();
    ahmetLocators2 ahmet2=new ahmetLocators2();
    @Then("Click to new open new account")
    public void clickToNewOpenNewAccount() {
    ahmet2.myClick(ahmet2.newAccountButton);
    }

    @And("Select savings")
    public void selectSavings() {
     //   wait.until(ExpectedConditions.elementToBeClickable(ahmet2.selectAccount));

        Select select=new Select(ahmet2.selectAccount);
        select.selectByIndex(0);
    }
    @And("User should verify less money amount")
    public void userShouldVerifyLessMoneyAmount() {
        ahmet2.verifyContainsText(ahmet2.vertifyAmount,"100");
    }

    @And("Select amount money")
    public void selectAmountMoney() {
        Select select=new Select(ahmet2.selectAccount);
        select.selectByIndex(0);
    }

    @And("Click to new account button")
    public void clickToNewAccountButton() {
        ahmet2.myClick(ahmet2.newAccountSubmit);
    }


    @Then("User should open successfully new account and congragulate")
    public void userShouldOpenSuccessfullyNewAccountAndCongragulate() {
        ahmet2.verifyContainsText(ahmet2.accountRatify,"number");
        ahmet2.verifyContainsText(ahmet2.congratulate,"Congratulations");
    }
}
