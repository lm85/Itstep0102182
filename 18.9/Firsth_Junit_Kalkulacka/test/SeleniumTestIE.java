
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebElement;
import static junit.framework.TestCase.assertEquals;

/**
 * dodelat
 * @author Milan ZLamal
 */
public class SeleniumTestIE {

    private static final String URL = "http://localhost:8080/JSFKalkulacka/";
    private static final int TIMEOUT = 10;

    public WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("*******IE DRIVER*******");
        System.out.println("launching IE browser");
        System.setProperty("webdriver.ie.driver", "resources/IEDriverServer_3.6.0_win32.exe");
        driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void testVypocitej() {
        driver.get(URL);
        driver.manage().deleteAllCookies();
        WebElement cislo1 = driver.findElement(By.id("cislo1"));
        cislo1.clear();
        cislo1.sendKeys("1");
        WebElement cislo2 = driver.findElement(By.id("cislo2"));
        cislo2.clear();
        cislo2.sendKeys("1");
        Select operace = new Select(driver.findElement(By.id("operace")));
        operace.selectByValue("+");
        driver.findElement(By.id("odeslat")).click();
        assertEquals("2.0", driver.findElement(By.id("vysledek")).getText());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            System.out.println("Closing IE browser");
            driver.quit();
        }
    }
}
