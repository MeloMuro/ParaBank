package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ahmetLocators2 extends Parents {
    public ahmetLocators2() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath="//a[text()='Open New Account']")
    public WebElement newAccountButton;


    @FindBy(xpath=" //select[@id='type']")
    public WebElement selectAccount;
    //Select account=new Select(savings);
    @FindBy(xpath="  //*[@id=\"rightPanel\"]/div/div/form/p[2]/b/text()")
    public WebElement vertifyAmount;

    @FindBy(xpath="/ //a[@id='newAccountId']")
    public WebElement accountNo;

    @FindBy(xpath="//input[@type='submit']")
    public WebElement newAccountSubmit;

    @FindBy(xpath="//a[@id='fromAccountId']")
    public WebElement accountRatify;

    @FindBy(xpath="//*[@id=\"rightPanel\"]/div/div/p[1]")
    public WebElement congratulate;




    //a[text()='Open New Account']
    //select[@id='type']
    //input[@type='submit']
    //a[@id='newAccountId']

    //a[@id='fromAccountId']
}
