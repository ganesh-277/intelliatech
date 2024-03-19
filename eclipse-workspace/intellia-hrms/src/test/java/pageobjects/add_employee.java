package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class add_employee {
WebDriver ldriver;

public add_employee(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(xpath="(//span[text()=\"Employees\"])[2]") WebElement emp;
@FindBy(xpath="//a[@data-bs-target=\"#add_employee\"]") WebElement add;
@FindBy(xpath="(//input[@id=\"full_name\"])[1]") WebElement fname;
@FindBy(xpath="(//input[@id=\"email\"])[1]") WebElement email;
@FindBy(xpath="(//input[@placeholder=\"Enter Employee's Login Password\"])[1]") WebElement emp_pass;






public void click_emp()
{
	emp.click();
}
public void click_add()
{
	add.click();
}
public void enter_fname(String name)
{
	fname.sendKeys(name);
}
public void enter_email(String mail)
{
	email.sendKeys(mail);
}
public void enter_password(String pd)
{
	emp_pass.sendKeys(pd);
}
}
