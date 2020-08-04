package com.autodeskcrm.orgtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.autodeskcrm.gerericutils.BaseClass;
import com.autodeskcrm.gerericutils.ExcelLib;
import com.autodeskcrm.gerericutils.WebDriverUtils;

public class DeleteOrgWithBaseClass extends BaseClass{
	
	@Test
	public void deleteORgtest() throws Throwable {
		
		WebDriverUtils wLib = new WebDriverUtils();
        /*FileLib fLib = new FileLib();*/
        ExcelLib excelLib = new ExcelLib();
		

		/* read data from property File */
		//String USERNAME = fLib.getPropertyKeyValue("username");
		//String PASSWORD = fLib.getPropertyKeyValue("password");
		//String URL = fLib.getPropertyKeyValue("url");
		//String BROWSER = fLib.getPropertyKeyValue("browser");
		
		/* read test script specific data*/
		String orgName = excelLib.getExcelData("org", 1, 2)+ "_"+ wLib.getRamDomNum();
		excelLib.getExcelData("org", 1, 3);
		excelLib.getExcelData("org", 1, 4);
		
		
		/*step 1 : launch the browser*/
		/*WebDriver driver = null;
		  
		 if(BROWSER.equals("chrome")) {
		   driver= new ChromeDriver();
		 } else if(BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		 }else if(BROWSER.equals("ie")) {
				driver = new InternetExplorerDriver();
	     }else {
	    	 driver = new FirefoxDriver();
	     }
		 
		 
		wLib.waitForPagetoLoad(driver);
		driver.get(URL);
		
		/*step 2 : login*/
		//driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		//driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		//driver.findElement(By.id("submitButton")).click();
		
		/*step 3 : navigate to Org page*/
		driver.findElement(By.linkText("Organizations")).click();
		
		/*
		 * @author Srashti Saxena
		 */
		
		/*step 3 : navigate to Org page*/
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.className("txtBox")).sendKeys(orgName); 
		
		/*step 4 : Select org name from listbox*/
		WebElement List = driver.findElement(By.xpath("//select[@id='bas_searchfield'][1]"));
		wLib.select(List, "Organization Name");
		
		/*step 5 : click on search*/
		driver.findElement(By.name("submit")).click();
		
		/*step 6 : click on checkBox*/
		driver.findElement(By.xpath("//input[@name='selected_id']")).click();
		
		/*step 7 : click on delete*/
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		
		/*step 8 : Click on OK to confirm deletion alert msg*/
		Alert alt =  driver.switchTo().alert();
		String alertMsg= alt.getText();
		System.out.println("Actual alert msg is :" + alertMsg);
		if(alertMsg.equals("Deleting this organization(s) will remove its related Opportunities & Quotes. Are you sure you want to delete the selected 1 records?"))
		{
			alt.accept();
		}
		
		/*step 8 : Click on OK to confirm deletion alert msg*/
		String deletionMsg = driver.findElement(By.xpath("//span[@class='genHeaderSmall']")).getText();
		System.out.println(deletionMsg);
		if(deletionMsg.equals("No Organization Found !"))
		{
			System.out.println("Organization deleted successfully");
		}else {
			System.out.println("Organization not deleted");
		}
	}
}

