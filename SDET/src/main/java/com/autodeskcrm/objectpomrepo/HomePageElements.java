package com.autodeskcrm.objectpomrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.autodeskcrm.gerericutils.BaseClass;

//import com.vtiger.genericLib.BaseClass;

public class HomePageElements {
	
	@FindBy(linkText= "Leads")
	private WebElement leads;
	
	@FindBy(linkText= "Organization")
	private WebElement organisation;
	
	@FindBy(linkText= "Products")
	private WebElement products;
	
	@FindBy(xpath= "//span[@class='userName']/../../td[2]/img")
	private WebElement signoutDD;
	
	@FindBy(linkText= "Sign Out")
	private WebElement signoutLink;
	
	public WebElement getLeads()
	{
		return leads;
	}
	public WebElement getOrganzation()
	{
		return organisation;
	}
	public WebElement getProducts()
	{
		return products;
	}
	public WebElement getSignOutDD()
	{
		return signoutDD;
	}
	public WebElement getSignOutLink()
	{
		return signoutLink;
	}
	//business logic for common login module
	public void  logoutFromApp()
	{
		Actions act= new Actions (BaseClass.driver);
		act.moveToElement(signoutDD).perform();
		signoutLink.click();
	}
}
