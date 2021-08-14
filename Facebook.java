package week2.day1.class_assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Create New Account").click();
		driver.findElementByName("firstname").sendKeys("sambavi");
		driver.findElementByName("lastname").sendKeys("krish");
		driver.findElementByName("reg_email__").sendKeys("sambu.krish@gmail.com");
		driver.findElementByName("reg_email_confirmation__").sendKeys("sambu.krish@gmail.com");
		driver.findElementByName("reg_passwd__").sendKeys("******");
		driver.findElementByClassName("_8esa").click();
		
		WebElement drop1 = driver.findElement(By.name("birthday_day"));
		Select dropdown1 = new Select(drop1);
		dropdown1.selectByIndex(4);
		WebElement drop2 =driver.findElement(By.name("birthday_month"));
		Select dropdown2 = new Select(drop2);
		dropdown2.selectByIndex(4);
		WebElement drop3 =driver.findElement(By.name("birthday_year"));
		Select dropdown3 = new Select(drop3);
		dropdown3.selectByIndex(4);
		
	
	}

}
