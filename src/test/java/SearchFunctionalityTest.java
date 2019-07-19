import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchFunctionalityTest {
    private WebDriver driver;
    @BeforeTest
    public void createChromeDriver() {
        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void seachFunctionalityTestAndChek(){
        driver.get("http://nnmclub.to");
        WebElement buttonAuthorization = driver.findElement(By
                .xpath("//*[contains(text(),'Вход')]"));
        buttonAuthorization.click();
        WebElement login = driver.findElement(By.name("username"));
        login.sendKeys("Ксения00788");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("zadanie");
        WebElement buttonLogin =driver.findElement(By.className("mainoption"));
        buttonLogin.click();
        
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
