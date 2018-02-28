import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    private WebDriver driver;

    @BeforeClass
    public static void before()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    }
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void quit(){
        driver.quit();
    }
    @Test
    public void destinationSearchFromFrenchHomePage(){
        PagePrin pagePrincipale = new PagePrin(this.driver);
        pagePrincipale.connexionPagePrincipale();
        String destination = System.getProperty("destination1");
        pagePrincipale.clickFrenchButton().getHeader().destinationSearch(destination);
    }
    @Test
    public void destinationSearchFromPagePrincipale(){
        PagePrin pagePrincipale = new PagePrin(this.driver);
        pagePrincipale.connexionPagePrincipale();
        pagePrincipale.destinationSearch("Paris");
    }

    @Test
    public void destinationSearchFromDestinationPage(){
        PagePrin pagePrincipale = new PagePrin(this.driver);
        pagePrincipale.connexionPagePrincipale();
        String destination1 = System.getProperty("destination1");
        String destination2 = System.getProperty("destination2");
        pagePrincipale.destinationSearch(destination1).getHeader().destinationSearch(destination2);
    }

    @Test
    public void openHomePageFromDestination(){
        PagePrin pagePrin = new PagePrin(this.driver);
        pagePrin.connexionPagePrincipale();
        String destination1 =System.getProperty("destination1");
        pagePrin.clickFrenchButton().getHeader().destinationSearch(destination1).getNavigationPanel().openHomePage();
    }




}
