package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class CreateLead {
	
	public static void main(String[] args) {
		ChromeDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Username - demosalesmanager
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// password - crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hexaware");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pugazhendi");
		//dropdown1
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn1 = new Select (source);
		drpDwn1.selectByIndex(2);
		//dropdown2
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDwn2 = new Select (marketing);
		drpDwn2.selectByValue("9002");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nandy");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Pugazh");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Team Leader");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/20/1995");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Cube");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BCA");
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
	  //dropdown3
	    WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
	    Select drpDwn3 = new Select (currency);
	    drpDwn3.selectByVisibleText("DZD - Algerian Dinar");
	  //dropdown4
	    WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select drpDwn4 = new Select (industry);
	    drpDwn4.selectByIndex(2);
	  //dropdown5
	    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10,000");
	    WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select drpDwn5 = new Select (ownership);
	    drpDwn5.selectByIndex(1);
	    
	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("654987");
	    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Code");
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Concentrate");
	    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
	    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("2");
	    
	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("635601");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7418256942");
	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("6942");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Pugazh");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nandhunandhini2017@gmail.com");
	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com");
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Lavanya");
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Vanathi");
	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.6th Street");
	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("No. 4th Street");
	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	 // dropdown 6
	    WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select drpDwn6 = new Select (state);
	    drpDwn6.selectByIndex(2);
	 // dropdown 7
	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("635602");
	    WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	    Select drpDwn7 = new Select (country);
	    drpDwn7.selectByIndex(3);
	    
	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("5602");
	 // Get the Firstname and print it
	    
	    
	 // Click on create Lead Button
	    driver.findElement(By.name("submitButton")).click();
	    
	 // Get and Verify the Title of the resulting Page(View Lead)
	    
	    String title = "View Lead";
	    String actualTitle = driver.getTitle();
	    if (title.equals(actualTitle)) {
	    	System.out.println("Given Title is Matched");
			
		} else {
            System.out.println("Given Title is not Matched");
		}
	    
	    driver.close();
	}

}
