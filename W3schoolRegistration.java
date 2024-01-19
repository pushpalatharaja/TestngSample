package week6.testngHomeAssignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class W3schoolRegistration extends W3Base {

	@Test(dataProvider="sendData")
	public void paymentdetails(String cardName, String cardNum, String exp, String name, String email, String address, String city, String zip, String state) {
		
		
		//Switch to the iframe with the id "iframeResult."
		WebElement element = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(element);
		//Fill in the following fields with valid data:
		
		//Name on Card
		driver.findElement(By.xpath("//input[@id='cname']")).sendKeys(cardName);
		
		//Credit card number
		driver.findElement(By.xpath("//input[@id='ccnum']")).sendKeys(cardNum);
		
		//Exp year
		driver.findElement(By.xpath("//input[@id='expmonth']")).sendKeys(exp);
		
		
		//Full Name: [Provide a data from Excel sheet]
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(name);
		
		//Email: [Provide a data from Excel sheet ]
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		
		//Address: [Provide a data from Excel sheet]
		driver.findElement(By.xpath("//input[@id='adr']")).sendKeys(address);
				
		//City: [Provide a data from Excel sheet]
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
		
		//Zip: [Provide a data from Excel sheet]
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zip);
		
		//State: [Provide a data from Excel sheet]
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys(state);
		
		
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		
		//Close the browser.
		driver.close();

	}

}
