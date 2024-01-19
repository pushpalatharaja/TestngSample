package week6.testngHomeAssignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class RedHatBaseClass {


	public ChromeDriver driver;
	@DataProvider
	public String[][] sendData() throws IOException {
		return RedHatData.dataFetch();
	}
	
	@BeforeMethod
	public void preCondition() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	driver=new ChromeDriver();
	driver.get("https://sso.redhat.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
