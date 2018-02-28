import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private Header header;
    private NavigationPanel navigationPanel;
    @FindBy(className="mw-dismissable-notice-close")
    private WebElement masquer;

    public HomePage(WebDriver driver){
        this.driver=driver;
        this.header = new Header(this.driver);
        this.navigationPanel = new NavigationPanel(this.driver);
        PageFactory.initElements(driver, this);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(masquer));
    }
    public Header getHeader() {
        return header;
    }
    public NavigationPanel getNavigationPanel() {
        return navigationPanel;
    }


}
