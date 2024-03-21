package testpackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.add_employee;
import pageobjects.login;
import utility.info_utility;

public class testclass extends baseclass{
	
	info_utility info;	

//@BeforeMethod	
public void setup()
{
	driver.get("https://hrms.intelliatech.in/");
	
}
@Test(priority=0)
public void logintest() throws IOException
{
	info=new info_utility();
	
	login ll=new login(driver);
	
	ll.setusername(info.getusername());
	ll.setpassword(info.getpassword());
	ll.clickbtn();
	// Assert.assertTrue(ll.isDashboardDisplayed(), "Dashboard not displayed after login");
     Assert.assertEquals(ll.getPageTitle(), "Dashboard - HRMS Admin", "Page title doesn't match");
}
@Test(priority=1)
public void emp_test() throws IOException
{
	info=new info_utility();
	add_employee ad=new add_employee(driver);
	ad.click_emp();
	ad.click_add();
	ad.enter_fname(info.getfullname());
	ad.enter_email(info.getemail());
	ad.enter_password(info.get_emppassword());
}

}
