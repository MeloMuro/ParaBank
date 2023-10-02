package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Parents{

    public Locators() {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(xpath="//a[text()='Register']")
    public WebElement registerBtn;

    @FindBy(xpath="//input[@id='customer.firstName']")
    public WebElement firstName;

    @FindBy(xpath="//input[@id='customer.lastName']")
    public WebElement lastName;

    @FindBy(xpath="//input[@id='customer.address.street']")
    public WebElement address;

    @FindBy(xpath="//input[@id='customer.address.city']")
    public WebElement city;

    @FindBy(xpath="//input[@id='customer.address.state']")
    public WebElement state;

    @FindBy(xpath="//input[@id='customer.address.zipCode']")
    public WebElement zipCode;

    @FindBy(xpath="//input[@id='customer.ssn']")
    public WebElement ssn;

    @FindBy(xpath="//input[@id='customer.username']")
    public WebElement userName;

    @FindBy(xpath="//input[@id='customer.password']")
    public WebElement password;

    @FindBy(xpath="//input[@id='repeatedPassword']")
    public WebElement passwordRpt;

    @FindBy(xpath="//h1[@class='title']")
    public WebElement welcomeMsg;

    @FindBy(xpath="//input[@name='username']")
    public WebElement userName2;

    @FindBy(xpath="//input[@name='password']")
    public WebElement password2;

    @FindBy(xpath="//h1[text()='Accounts Overview']")
    public WebElement accountsOverview;

    @FindBy(xpath="//h1[text()='Error!']")
    public WebElement loginError;


}
