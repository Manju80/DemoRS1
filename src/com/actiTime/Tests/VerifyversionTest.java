package com.actiTime.Tests;

import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actiTime.Pages.actiTimeLoginpage;
import com.actiTime.generic.BaseTest;
import com.actiTime.generic.ExcelData;

public class VerifyversionTest extends BaseTest{
	@Test(priority=3)
	public void testVerifyversion() 
	{
		
		String Logintitle = ExcelData.getData(Filepath, "TC01", 1, 2);
		String Eversion = ExcelData.getData(Filepath, "TC03", 1, 0);
		actiTimeLoginpage lp=new actiTimeLoginpage(driver);
		lp.verifyTitle(Logintitle);//reusing the method present in POM class
		String aversion = lp.verifyVersion();//reusing method present in POM class
		Reporter.log("actual version is " +aversion, true);
		Reporter.log("expected version is " +Eversion, true);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(aversion,Eversion);
		Reporter.log("version is matching", true);
		sa.assertAll();			
	}

}
