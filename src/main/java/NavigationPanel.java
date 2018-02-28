import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPanel {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"n-mainpage\"]/a")
    private WebElement homePageButton;
    @FindBy(xpath ="//*[@id=\"n-help\"]/a")
    private WebElement helpButton;

    public  NavigationPanel(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public HomePage openHomePage(){
        this.homePageButton.click();
        return new HomePage(this.driver);
    }

    public HomePage openHelp(){
        this.helpButton.click();
        return new HomePage(this.driver);
    }

}
