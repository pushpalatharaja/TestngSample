package week6.testngHomeAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RedHat extends RedHatBaseClass{

	@Test(dataProvider="sendData")
	public void accountRegisteration(String uName, String pWd, String email, String pNo) throws InterruptedException {
				
		//Click on the "Register for a Red Hat account" button.
		driver.findElement(By.id("rh-registration-link")).click();
		//Verify that the registration form is displayed.
		boolean contains = driver.getTitle().contains("Register");
		System.out.println("Registration Form is Displaying: "+ contains);
		//Fill in valid values for the following fields from Excel data:
		//Username
		driver.findElement(By.id("username")).sendKeys(uName);
		//Password
		driver.findElement(By.id("password")).sendKeys(pWd);
		//Confirm Password
		//First Name
		//Last Name
		//Email
		driver.findElement(By.id("email")).sendKeys(email);
		//Phone
		
		driver.findElement(By.id("user.attributes.phoneNumber")).sendKeys(pNo);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='regform-submit']")).click();
		
		

	}

}
