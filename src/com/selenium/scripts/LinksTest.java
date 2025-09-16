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
		/**
		 * findElement: findElement method will find the firstly found WebElement in the webpage and if not found it will throw NoSuchElementException
		 * findElemens: findElements method will find the list of WebElements in the webpage and if not found it will return an empty list with size 0
		 */
		WebElement ele = driver.findElement(By.xpath("//a"));
		System.out.println(ele.getText());
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("No of links in the page are: " + links.size());
		
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		driver.quit(); // close the browser
	}

}
