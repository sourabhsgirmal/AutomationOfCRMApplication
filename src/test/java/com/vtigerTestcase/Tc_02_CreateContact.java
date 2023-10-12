package com.vtigerTestcase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Com.Baseclass.Base;
import Pom.Classes.ContactPage;

public class Tc_02_CreateContact extends Base {
	@Test
	public void Tc01_contact() throws InterruptedException {
		ContactPage contactpage = new ContactPage(driver);
		contactpage.getGetcontactlink().click();
		contactpage.getaddcontactlink().click();
		selectdd((contactpage.selectbox()), "Mr.");
		contactpage.getnametext().sendKeys("akash");
		contactpage.getlastnametext().sendKeys("patil");
		contactpage.getGetsavebuttonlink().click();
	}

}
