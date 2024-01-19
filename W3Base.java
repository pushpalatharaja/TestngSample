package week6.testngHomeAssignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class W3Base {
	ChromeDriver driver;
	
	@DataProvider
	public String[][] sendData() throws IOException {
		
		return W3FormData.fetchExcelData() ;
	}	

	@BeforeMethod
	public void preCondition() {
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
}
