import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    WebDriver driver;
    @FindBy(id="searchInput")
    private WebElement searchInput;
    @FindBy(id="searchButton")
    private WebElement searchButton;

    public Header(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public DestiPage destinationSearch(String destination){
         searchInput.sendKeys(destination);
         searchButton.click();
         return new DestiPage(driver);
    }

}
