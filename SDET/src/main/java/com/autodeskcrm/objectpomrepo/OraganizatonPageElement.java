package com.autodeskcrm.objectpomrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OraganizatonPageElement {
	
	@FindBy(css = "img[title='Create Organization...']")
	private WebElement CreateOrganization;
	
	public WebElement getCreateOragnization()
	{
		return CreateOrganization;
	}

}
