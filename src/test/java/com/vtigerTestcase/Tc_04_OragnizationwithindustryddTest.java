package com.vtigerTestcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.Baseclass.Base;
import Pom.Classes.Homepage;

public class Tc_04_OragnizationwithindustryddTest extends Base {
	
	@Test
	public void instryDD() {
		Homepage homepage = new Homepage(driver);
		
		homepage.getOrgPagelink().click();
		
		homepage.AddOrglink().click();
		
		homepage.OrgNameText().sendKeys("jetglobal");
		
		homepage.SelectIndustrydd().click();
	}
	

}
