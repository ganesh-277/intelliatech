package intellia_test;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;

import intellia_utility.ExtentReportManager;

public class baseclass {
	
 WebDriver driver;
 Logger Logger;
 ExtentReports extent;
@BeforeClass
public void start() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\new driver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

	// System.setProperty("log4j.configurationFile", "C:\\Users\\admin\\eclipse-workspace\\Intelliatech\\log4j2.properties");
Logger=LogManager.getLogger(this.getClass());
extent = ExtentReportManager.createInstance("test-output/extent-report.html");

}

@AfterClass
public void tearDown() {
    // Close the WebDriver
    if (driver != null) {
        driver.quit();
    }

    // Flush Extent Reports
    ExtentReportManager.flushReport();
}


}
