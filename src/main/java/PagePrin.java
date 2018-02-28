import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagePrin {
    private WebDriver driver;

    @FindBy(id ="searchInput")
    private WebElement searchInput;
    @FindBy(id = "searchButton")
    private  WebElement searchButton;
    @FindBy(className = "lang4")
    private WebElement frenchButton;
    @FindBy(className = "lang1")
    private WebElement englishButton;
    @FindBy(className = "lang3")
    private WebElement spanishButton;



    public PagePrin(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void connexionPagePrincipale(){
        this.driver.get("https://www.wikivoyage.org/");
    }
    public HomePage clickFrenchButton(){
        frenchButton.click();
        return new HomePage(this.driver);
    }
    public HomePage clickEnglishButton(){
        englishButton.click();
        return new HomePage(this.driver);
    }
    public HomePage clickSpanishButton(){
        spanishButton.click();
        return new HomePage(this.driver);
    }
    public DestiPage destinationSearch(String destination){
        searchInput.sendKeys(destination);
        searchButton.click();
        return new DestiPage(this.driver);
    }

}
