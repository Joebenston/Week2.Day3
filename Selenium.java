package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Selenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		System.out.println("Enter Username");
		WebElement elementUsername= driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		
		System.out.println("Enter Password");
		WebElement elementPassword= driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
	
		System.out.println("click login Button");
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
			
		System.out.println("click CRM/SFA");
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
		System.out.println("Leads");
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();

		System.out.println("Create leads");
		WebElement elementCreateLeads = driver.findElement(By.linkText("Create Lead"));
		elementCreateLeads.click();
		
		System.out.println("Enter CompanyName");
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("DreamsOnEvent");
		
		System.out.println("Enter FirstName");
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Joel");
		
		
		System.out.println("Enrer LastName");
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Benston");
		
		
		
		
	// Create Leads
		
		System.out.println("Create Lead");
		WebElement elementCreateLead = driver.findElement(By.className("smallSubmit"));
		elementCreateLead.click();
		
		
		WebElement elementDuplicateButton= driver.findElement(By.linkText("Duplicate Lead"));
		elementDuplicateButton.click();
	
		System.out.println("Enter CompanyName");
		WebElement elementDuplciateCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementDuplciateCompanyName.clear();
		elementDuplciateCompanyName.sendKeys("FoodTruck");
		
		System.out.println("Enter FirstName");
		WebElement elementDuplicateFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementDuplciateCompanyName.clear();
		elementDuplicateFirstName.sendKeys("Yoo");
		
		
		System.out.println("Enrer LastName");
		WebElement elementDuplicateLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementDuplciateCompanyName.clear();
		elementDuplicateLastName.sendKeys("Yoo");
	
	
	}	
}
