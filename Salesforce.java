package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Salesforce {
	public static void main(String[] args) {
		ChromeDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Nandhini");
		driver.findElement(By.name("UserLastName")).sendKeys("Pugazhendi");
		driver.findElement(By.name("UserEmail")).sendKeys("nandhunandhini2017@gmail.com");
		
		WebElement title = driver.findElement(By.name("UserTitle"));
		Select drpDwn1 = new Select (title);
		drpDwn1.selectByValue("Developer");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Hexaware");
		
		WebElement company = driver.findElement(By.name("CompanyEmployees"));
		Select drpDwn2 = new Select (company);
		drpDwn2.selectByValue("1600");
		
		driver.findElement(By.name("UserPhone")).sendKeys("7418256942");
		
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select drpDwn3 = new Select (country);
		drpDwn3.selectByValue("AF");
		
		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();
	}
}
