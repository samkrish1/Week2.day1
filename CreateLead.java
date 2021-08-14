package week2.day1.class_assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElementByLinkText("Leads").click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Abcd");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sambavi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krish");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ashwin");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Yes");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Yes");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("123444");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("sad");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("krishna");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/01/2021");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("mechanical");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("45");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("234");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sambu.krish@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234235");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("name");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("13124");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys(":www.google.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Add");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("1234235");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Add");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Add");
		WebElement elements = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		elements.clear();
		elements.sendKeys("2");
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpdown1 = new Select(drop1);
		drpdown1.selectByIndex(1);

		WebElement drop2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpdown2 = new Select(drop2);
		drpdown2.selectByValue("IND_AEROSPACE");

		WebElement drop3 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown3 = new Select(drop3);
		dropdown3.selectByVisibleText("Automobile");

		WebElement drop4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown4 = new Select(drop4);
		dropdown4.selectByVisibleText("Partnership");

		WebElement drop5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown5 = new Select(drop5);
		dropdown5.selectByVisibleText("Arizona");
		driver.findElement(By.className("smallSubmit")).click();
		
		

	}

}
