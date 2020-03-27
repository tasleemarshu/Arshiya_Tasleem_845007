package com.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ExcelUtility.ExcelPage;

public class Loginpage {
	// inspecting the elements in the application
	WebDriver driver;
	ExcelPage e = new ExcelPage();
    public Loginpage(WebDriver driver) {
    	this.driver=driver;
    }
	public void url(String browser) // launching the application using multiple browsers
	{
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver(); // to launch the application in chrome browser
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			driver = new FirefoxDriver(); // to launch the application in firefox browser
		}

		driver.manage().window().maximize(); // maximizes the browser
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); // providing waiting time

	}

	public void Launch_URL() // using webdriver get visting the testing website
	{
		driver.get("http://automationpractice.com/index.php"); // takes us to homepage of the application
		System.out.println(driver.getTitle()); // displays title of the page
	}

	public void Signin() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	}

	public void usernameandpassword() throws IOException,IncompatibleClassChangeError {
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(e.excel_username(1));
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(e.excel_password(1));
		
	}

	public void Click() {
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
	}
}