package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Iteminstock {
	WebDriver driver;
	By women = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
	By tshirt = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a");
	By item_loc = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
	By Addtocart_loc = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span");
	By Proceedtocheck_loc = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
	By instock = By.xpath("//*[@id=\"product_1_1_0_0\"]/td[3]/span");

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

	public void mouseactions() {

		WebElement a1 = driver.findElement(women);
		WebElement a2 = driver.findElement(tshirt);
		Actions act = new Actions(driver);
		act.moveToElement(a1);
		act.moveToElement(a2).click().build().perform();
	}

	public void Select_item() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,600)");
		WebElement item = driver.findElement(item_loc);
		WebElement Addcart = driver.findElement(Addtocart_loc);
		Actions act = new Actions(driver);
		act.moveToElement(item);
		act.moveToElement(Addcart).click().build().perform();
	}

	public void Click_Proceedtocheck() throws IOException {
		driver.findElement(Proceedtocheck_loc).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,600)");
		TakesScreenshot t = (TakesScreenshot) driver;
		File f = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("Screenshots\\Iteminstock.png"));
	}

	public void Instock() {

		String text = driver.findElement(instock).getText();
		System.out.println(text);
	}
}