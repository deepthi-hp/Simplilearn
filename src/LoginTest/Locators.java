package LoginTest;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Locators {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/deepthihptecnot/Downloads/chromedriver");

		 System.setProperty("webdriver.gecko.driver","/home/deepthihptecnot/Downloads/geckodriver");
	         driver=new FirefoxDriver();
	        driver.get("https://www.simplilearn.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);

		//
		// WebElement lnkLogin = driver.findElement(By.linkText("Log in"));
		// lnkLogin.click();
		//
		// WebElement editUsername=driver.findElement(By.name("user_login"));
		// editUsername.sendKeys("akshay.com");
		//
		// WebElement editpwd= driver.findElement(By.name("user_pwd"));
		// editpwd.sendKeys("007");
		//
		// WebElement chkBox= driver.findElement(By.className("rememberMe"));
		// chkBox.click();
		//
		// WebElement btnpwd=driver.findElement(By.name("btn_login"));
		// btnpwd.click();

		 

		WebElement lg=driver.findElement(By.xpath("//a[@class='login']"));
		lg.click();
		WebElement wb=driver.findElement(By.xpath("//*[contains(text(),'Welcome back!')]"));

		 


		WebElement un=driver.findElement(By.xpath("//input[@name='user_login']"));
		un.sendKeys("akshay");
		WebElement ck=driver.findElement(By.xpath("//input[@id='remember-me']"));
		ck.click();

		 

		
		}
	}


