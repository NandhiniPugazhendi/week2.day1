package week2.day1;

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
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Nandhini");
		driver.findElement(By.name("lastname")).sendKeys("Pugazhendi");
		driver.findElement(By.name("reg_email__")).sendKeys("7418256942");
		driver.findElement(By.id("password_step_input")).sendKeys("Nandy@20");
		
		WebElement date = driver.findElement(By.id("day"));
		Select drpDwn1 = new Select (date);
		drpDwn1.selectByIndex(20);
		
		WebElement monthD = driver.findElement(By.id("month"));
		Select drpDwn2 = new Select (monthD);
		drpDwn2.selectByValue("4");
		
		WebElement yearD = driver.findElement(By.id("year"));
		Select drpDwn3 = new Select (yearD);
		drpDwn3.selectByValue("1995");
		
		driver.findElement(By.name("sex")).click();
		driver.close();
		
	}
}
