package testpackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import utility.confi_uti;

public class baseclass {
	confi_uti ut;
	public static WebDriver driver;
	public String Base;
	
@BeforeClass	
public void start() throws IOException
{
	ut=new confi_uti();
	Base=ut.getbase();
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\new driver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
	

}
