package LoginTest;

import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragnDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver","/home/deepthihptecnot/Downloads/chromedriver");
				// System.setProperty("webdriver.gecko.driver","/home/deepthihptecnot/Downloads/geckodriver");
				driver=new ChromeDriver();  
				driver.get("http://demo.guru99.com/test/drag_drop.html");
			       
			        driver.manage().window().maximize();
			        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
			        
			        WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
			        
			        //Element on which need to drop.    
			        
			         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
			         
			       //Using Action class for drag and drop.        
			         Actions act =new Actions(driver);        
			        
			         act.dragAndDrop(From, To).build().perform();
			        
	}

}
