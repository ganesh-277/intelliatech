package Intellia_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
WebDriver ldriver;

public pom1(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	
}

@FindBy(xpath="(//a[@href=\"https://intelliatech.com/staff-augmentation/\"])[1]") WebElement aug;


public void augment()
{
	aug.click();
}


}
