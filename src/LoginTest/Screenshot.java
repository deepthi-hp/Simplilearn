package LoginTest;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.IOException;
public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/home/deepthihptecnot/Downloads/chromedriver");
		// System.setProperty("webdriver.gecko.driver","/home/deepthihptecnot/Downloads/geckodriver");
		driver=new ChromeDriver();  
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        TakesScreenshot TSObj = (TakesScreenshot) driver;
        
        
        File image = TSObj.getScreenshotAs(OutputType.FILE);
        
        try {
            FileUtils.copyFile(image, new File("test.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
       
	}

}
