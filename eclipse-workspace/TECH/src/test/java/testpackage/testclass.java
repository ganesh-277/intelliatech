package testpackage;



import org.testng.annotations.Test;

import pageobjects.pom;


public class testclass extends baseclass{
@Test	
public void logintest() 
{
	
	driver.get(Base);
	
	pom pm=new pom(driver);
	pm.gohome();
}

}
