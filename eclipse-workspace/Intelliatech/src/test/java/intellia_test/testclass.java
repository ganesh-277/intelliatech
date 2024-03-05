package intellia_test;




import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Intellia_pages.pom1;
import intellia_utility.confo_utility;

public class testclass extends baseclass{

	//confo_utility con=new confo_utility();

@Test
public void augtest() throws FileNotFoundException
	{
	 ExtentTest test = extent.createTest("testExample", "This is a sample test");
	confo_utility con=new confo_utility();
	 driver.get(con.geturl());
	// Logger.info("url is opened");
	 test.info("Starting the test...");
	 pom1 pm=new pom1(driver);
	 pm.augment();
	 
	}

}
