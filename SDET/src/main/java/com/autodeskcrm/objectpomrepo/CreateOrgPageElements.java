package com.autodeskcrm.objectpomrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOrgPageElements {
	
	@FindBy(name="accountname")
	private WebElement Organizationnametb;
	
	@FindBy(xpath= "//input[@value='  Save  ']")
	private WebElement SaveBtn;
	
	public WebElement getOrganizationnametb()
	{
		return Organizationnametb;
	}
	public WebElement getSaveBtn()
	{
		return SaveBtn;
	}
}
