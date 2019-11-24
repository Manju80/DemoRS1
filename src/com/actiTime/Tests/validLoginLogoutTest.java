package com.actiTime.Tests;

import java.io.FileNotFoundException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actiTime.Pages.actiTIMEnterTimeTrackpage;
import com.actiTime.Pages.actiTimeLoginpage;
import com.actiTime.generic.BaseTest;
import com.actiTime.generic.ExcelData;

public class validLoginLogoutTest extends BaseTest

{

	@Test(priority=1)
	public void validLoginLogoutTest() throws InterruptedException, FileNotFoundException
	{
		
		String Username = ExcelData.getData(Filepath, "TC01", 1, 0);
		String Password = ExcelData.getData(Filepath, "TC01", 1, 1);
		String Logintitle=ExcelData.getData(Filepath, "TC01", 1, 3);
		actiTimeLoginpage lp= new actiTimeLoginpage(driver);
		actiTIMEnterTimeTrackpage ep= new actiTIMEnterTimeTrackpage(driver);
		lp.verifyTitle(Logintitle);
		Reporter.log("username is" +Username, true);
		lp.Enterusername(Username);
		Reporter.log("Password is" +Password, true);
		lp.Enterpassword(Password);
		lp.clickOnLogin();
		Thread.sleep(5000);
		ep.verifyTitle(Logintitle);
		ep.clickonLogout();
		Thread.sleep(5000);
		
	}
	
}