package com.vtigerTestcase;

import org.testng.annotations.Test;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import Com.Baseclass.Base;
import Pom.Classes.ContactPage;
import Pom.Classes.Homepage;

public class Tc_01_CreateOrgnizatontestcase extends Base
{
  
	
	@Test
 public void Creatorg() {
	 Homepage homepage = new Homepage(driver);
	 homepage.getOrgPagelink().click();
	 

	}
}
