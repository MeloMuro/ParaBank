package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Parents{

    public Locators() {
        PageFactory.initElements(GWD.getDriver(),this);
    }



    @FindBy(linkText="Register")
    public WebElement registerBtn;

    @FindBy(xpath="//*[@id=\"rightPanel\"]/h1")
    public WebElement formButMess;


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

    @FindBy(xpath="//input[@id='customer.phoneNumber']")
    public WebElement phoneNmr;


    @FindBy(xpath="//input[@id='customer.ssn']")
    public WebElement ssn;

    @FindBy(xpath="//input[@id='customer.username']")
    public WebElement userName;

    @FindBy(xpath="//input[@id='customer.password']")
    public WebElement password;

    @FindBy(xpath="//input[@id='repeatedPassword']")
    public WebElement passwordRpt;


    @FindBy(xpath="//input[@value='Register']")
    public WebElement registerOnyBtn;

    @FindBy(xpath="//h1[@class='title']")
    public WebElement welcomeMsg;

    @FindBy(xpath="//input[@name='username']")
    public WebElement userName2;

    @FindBy(xpath="//input[@name='password']")
    public WebElement password2;

    @FindBy(xpath="//input[@value='Log In']")
    public WebElement loginButton;

    @FindBy(xpath="//*[@id='leftPanel']/p/b")
    public WebElement loginWelcome;

    @FindBy(xpath="//*[@id='leftPanel']/ul/li[8]/a")
    public WebElement logOut;

    @FindBy(xpath="//h1[text()='Accounts Overview']")
    public WebElement accountsOverview;

    @FindBy(xpath="//h1[text()='Error!']")
    public WebElement loginError;


    public WebElement getWebelement(String strElement) {
        switch (strElement){
            case "firstName": return this.firstName;
            case "lastName": return this.lastName;
            case "address": return this.address;
            case "city": return this.city;
            case "state": return this.state;
            case "zipcode": return this.zipCode;
            case "phoneNmr": return this.phoneNmr;
            case "ssn": return this.ssn;
            case "userName": return this.userName;
            case "password": return this.password;
            case "passwordRpt": return this.passwordRpt;
            case "userName2": return this.userName2;
            case "password2": return this.password2;
        }
        return null;
    }
}
