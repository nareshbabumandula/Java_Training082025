package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTest {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("No of links in the page are: " + links.size());
		
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		driver.quit(); // close the browser
	}

}
