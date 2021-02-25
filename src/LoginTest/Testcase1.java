package LoginTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Testcase1 {
WebDriver driver;
    
    @BeforeMethod
    public void LaunchBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/varshinihebbart/Downloads/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/home/varshinihebbart/Downloads/geckodriver");
        
        driver = new ChromeDriver();
        driver.get("https://www.simplilearn.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
    }
    
    @Test
    public void LoginTest() {
        
        LoginPage obj = new LoginPage(driver);
        obj.login("String UserName = sheet.getRow(1).getCell(0).getStringCellValue()", "String Password = sheet.getRow(1).getCell(1).getStringCellValue()");
        
        
    }
    
    @AfterMethod
    public void CloseBrowser() {
        driver.quit();
    }
}
