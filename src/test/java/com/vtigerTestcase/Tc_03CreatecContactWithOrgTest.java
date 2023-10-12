package com.vtigerTestcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Com.Baseclass.Base;
import Pom.Classes.ContactPage;

public class Tc_03CreatecContactWithOrgTest extends Base {
	

	@Test
	public void Tc02_contactwithorg() throws InterruptedException {
		ContactPage contactpage = new ContactPage(driver);
		contactpage.getGetcontactlink().click();
		contactpage.getaddcontactlink().click();
		selectdd((contactpage.selectbox()), "Mr.");
		contactpage.getnametext().sendKeys("akash");
		contactpage.getlastnametext().sendKeys("patil");
		contactpage.getorganizationlink().click();
		String parentwindow = driver.getWindowHandle();
		Switchtowindow(driver, "Accounts&action");
		contactpage.getsarchorg().sendKeys("wipro");
		selectdd(contactpage.getSelectoption(), "Organization Name");
		contactpage.getsarchorg().click();
		contactpage.getGetorgoption().click();
		driver.switchTo().window(parentwindow);
		contactpage.getGetsavebuttonlink().click();
	}

}
