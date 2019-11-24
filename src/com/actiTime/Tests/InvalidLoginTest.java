package com.actiTime.Tests;

import java.io.FileNotFoundException;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actiTime.Pages.actiTimeLoginpage;
import com.actiTime.generic.BaseTest;
import com.actiTime.generic.ExcelData;

public class InvalidLoginTest extends BaseTest {
	
@Test(priority=2)
public void TestInvalidLogin() throws InterruptedException, FileNotFoundException

	{
		
		
		String logintit= ExcelData.getData(Filepath, "TC01", 1, 2);
		String Eerrmsg = ExcelData.getData(Filepath, "TCO2", 1, 2);
		int rc=ExcelData.getrowCount(Filepath,"TCO2");
	actiTimeLoginpage lp=new actiTimeLoginpage(driver);
	lp.verifyTitle(logintit);
	for(int i=1; i<=rc;i++)
	{
		
		String User=ExcelData.getData(Filepath,"TC02",i,0);
		String pass = ExcelData.getData(Filepath, "TCO2", i, 1);
		Reporter.log("username is " +User, true);
		lp.Enterusername(User);
		Reporter.log("password is" +pass, true);
		lp.Enterpassword(pass);
		lp.clickOnLogin();
		Thread.sleep(2000);
		String aerrmsg = lp.verifyerrmsg();
		Reporter.log("aerrmsg" +Eerrmsg, true);
		Reporter.log("expected errmsg is " +Eerrmsg, true);
		Assert.assertEquals(aerrmsg, Eerrmsg);
		Reporter.log("errmsg is matching", true);
		Reporter.log("................", true);
	}
	
	}	
}		