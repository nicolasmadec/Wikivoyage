import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPanel {
    private WebDriver driver;

    @FindBy(id="n-mainpage")
    private WebElement homePageButton;
    @FindBy(id="n-help")
    private WebElement helpButton;

    public  NavigationPanel(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void openHomePage(){
        this.homePageButton.click();
    }

    public void openHelp(){
        this.helpButton.click();
    }

}
