package LoginTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login obj=new Login();
		obj.setup();
		obj.login();
		obj.close();
       
	}
	public void setup()
	{
		 System.setProperty("webdriver.chrome.driver","/home/deepthihptecnot/Downloads/chromedriver");

		 System.setProperty("webdriver.gecko.driver","/home/deepthihptecnot/Downloads/geckodriver");
	         driver=new FirefoxDriver();
	        driver.get("https://www.simplilearn.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	}
	public void login()
	{
		 WebElement linkLogin=driver.findElement(By.linkText("Log in"));
	        linkLogin.click();
	        WebElement editUsername=driver.findElement(By.name("user_login"));
	       editUsername.sendKeys("abc@xyz.com");
	       WebElement editPwd=driver.findElement(By.name("user_pwd"));
	        editPwd.sendKeys("124");
	        WebElement chkBox=driver.findElement(By.className("rememberMe"));
	        chkBox.click();
	        WebElement btnPwd=driver.findElement(By.name("btn_login"));
//	        driver.quit();
	        btnPwd.click();
	}
	public void close()
	{
		 driver.quit();
	}

}
