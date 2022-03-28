package com.Adactinminiproject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.com.BaseClass;

public class AdactinMiniproject_1 extends BaseClass{
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = browserLaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		sendValues(username, "jayanthi13");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		sendValues(password, "KBQ239");
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		clickOn(login);
		
		WebElement location = driver.findElement(By.xpath("(//select)[1]"));
		singleDropdown(location, "Melbourne", "visibletext");
		WebElement hotels = driver.findElement(By.xpath("(//select)[2]"));
		singleDropdown(hotels, "Hotel Creek", "visibletext");
		WebElement roomtype = driver.findElement(By.xpath("(//select)[3]"));
		singleDropdown(roomtype, "Standard", "visibletext");
		WebElement numberofrooms = driver.findElement(By.xpath("(//select)[4]"));
		singleDropdown(numberofrooms, "3", "value");
//		WebElement checkindate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));  //date
//	    WebElement checkoutdate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		WebElement adultsroom = driver.findElement(By.xpath("(//select)[5]"));
		singleDropdown(adultsroom, "2", "value");
		WebElement childrenroom = driver.findElement(By.xpath("(//select)[6]"));
		singleDropdown(childrenroom, "3", "value");
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		clickOn(search);
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@type='radio']"));
		radioButton(radiobutton);
		WebElement continueclick = driver.findElement(By.xpath("//input[@type='submit']"));
		clickOn(continueclick);
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		sendValues(firstname, "jaya");
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		sendValues(lastname, "B");
		WebElement address = driver.findElement(By.name("address"));
		sendValues(address, "chennai");
		WebElement cardno = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		sendValues(cardno, "1234567895467524");
		WebElement cardtype = driver.findElement(By.xpath("(//select)[1]"));
		singleDropdown(cardtype, "VISA", "visibletext");
		WebElement expirymonth = driver.findElement(By.xpath("(//select)[2]"));
		singleDropdown(expirymonth, "January", "visibletext");
		WebElement expiryyear = driver.findElement(By.xpath("(//select)[3]"));
		singleDropdown(expiryyear, "2021", "visibletext");
		WebElement cvvnumber = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		sendValues(cvvnumber, "123");
		WebElement booknow = driver.findElement(By.xpath("//input[@type='button']"));
		clickOn(booknow);
		Thread.sleep(5000);
		WebElement myitinerary = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
		clickOn(myitinerary);
		
		WebElement orderid = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		checkBox(orderid);
		WebElement logout = driver.findElement(By.name("logout"));
		clickOn(logout);
	}

}
