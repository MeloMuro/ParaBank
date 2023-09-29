package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Parents{

    public Locators() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
}
