package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
WebDriver ldriver;

public login(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(xpath="//input[@placeholder=\"Email\"]") WebElement uname;
@FindBy(xpath="//input[@placeholder=\"Password\"]") WebElement pass;
@FindBy(xpath="//button[@type=\"submit\"]") WebElement btn;


public void setusername(String username)
{
	uname.sendKeys(username);
}
public void setpassword(String password)
{
	pass.sendKeys(password);
}

public void clickbtn()
{
	btn.click();
}
public String getPageTitle() {
    return ldriver.getTitle();
}


}
