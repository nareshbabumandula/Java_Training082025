package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();

		/**
		 * 	1. ID
			2. Name
			3. Class
			4. CSS - Cascading Style Sheet
			5. Link Text - For Link
			6. Partial LinkText - For Link
			7. Tag name
			8. xpath
		 */
		// 1. id Locator
		driver.findElement(By.id("user")).sendKeys("Surender");

		// 2. name locator
		driver.findElement(By.name("pass")).sendKeys("Intelligence123#");

		// 3. className locator
		driver.findElement(By.className("btn_log")).click();

		// 4. cssSelector
		driver.findElement(By.cssSelector("input[id='user']")).sendKeys("aditi");
		Thread.sleep(2000);
		
		// 5. linkText locator
		driver.findElement(By.linkText("Sample Forms")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// 6. partialLinkText locator
		driver.findElement(By.partialLinkText("Sample")).click();
		
		// 7. tagName locator
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.tagName("input")).sendKeys("Kalyani");
		
		// 8. xpath locator
		driver.findElement(By.xpath("//input[@id='user']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Manoja");
		Thread.sleep(2000);
		
		
		Thread.sleep(5000);
		driver.quit();


	}

}
