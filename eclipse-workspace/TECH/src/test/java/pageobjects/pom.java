package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
WebDriver ldriver;

public pom(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	
}

@FindBy(xpath="//a[@href=\"https://intelliatech.com\"]") WebElement home;

public void gohome()
{
	home.click();
}
}
