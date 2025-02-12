package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setValue() {
		excelFileName = "CreateLead";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String company, String firstName, String lastName) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
