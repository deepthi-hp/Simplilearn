package LoginTest;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","Chromedriver");

		// System.setProperty("webdriver.gecko.driver","/home/deepthihptecnot/Downloads/geckodriver");
	        driver=new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);

			//WebElement lg=driver.findElement(By.xpath("//input[@id=\"email\"]"));
			//lg.sendKeys("fasdczxb@csx");
			//WebElement passwd=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
			//passwd.sendKeys("1324153");
			
			//WebElement login =driver.findElement(By.xpath("//button[@name=\"login\"]"));
			//login.click();
	        WebElement create=driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
	        create.click();
	        
	        WebElement frstname=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
	        frstname.sendKeys("xyz");
	        
	        WebElement lstname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
	        lstname.sendKeys("abc");
	        
	        WebElement email=driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
	       email.sendKeys("abc@gmail.com");
	       
	       WebElement email1=driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]"));
	       email1.sendKeys("abc@gmail.com");
	       
	       WebElement newpsw=driver.findElement(By.xpath("//input[@id=\"password_step_input\"]"));
	       newpsw.sendKeys("mnopqrst");
	       
	       WebElement gender=driver.findElement(By.xpath("//input[@name=\"sex\"]"));
	       gender.click();
	       
			WebElement month=driver.findElement(By.xpath("//*[@name='birthday_month']"));
			Select bdmonth=new Select(month);
			//bdmonth.selectByIndex(3);
			bdmonth.selectByValue("8");
			//bdmonth.selectByVisibleText("Feb");
			
			WebElement date=driver.findElement(By.xpath("//*[@name='birthday_day']"));
			Select dayte=new Select(date);
			dayte.selectByValue("15");
			
			WebElement year=driver.findElement(By.xpath("//*[@name='birthday_year']"));
					Select year1=new Select(year);
					year1.selectByValue("2020");
			
			 WebElement signin=driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
			 signin.click();
			
	}

}
