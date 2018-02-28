import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    private Header header;
    private NavigationPanel navigationPanel;

    public HomePage(WebDriver driver){
        this.driver=driver;
        this.header = new Header(this.driver);
        this.navigationPanel = new NavigationPanel(this.driver);
        PageFactory.initElements(driver, this);
    }
    public Header getHeader() {
        return header;
    }


}
