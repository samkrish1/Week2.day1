package week2.day1.class_assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Sambavi");
		driver.findElement(By.name("UserLastName")).sendKeys("Krish");
		driver.findElement(By.name("UserEmail")).sendKeys("sambu.krish@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Indium");
		driver.findElement(By.name("UserPhone")).sendKeys("113256234");
		WebElement field1 = driver.findElement(By.name("UserTitle"));
		Select dropdwn = new Select(field1);
		dropdwn.selectByIndex(1);
		WebElement field2 = driver.findElement(By.name("CompanyEmployees"));
		Select dropdwn1 = new Select(field2);
		dropdwn1.selectByIndex(4);
		WebElement field3 = driver.findElement(By.name("CompanyCountry"));
		Select dropdwn2 = new Select(field3);
		dropdwn2.selectByIndex(4);
		driver.findElement(By.className("checkbox-ui")).click();
		
		

	}

}
