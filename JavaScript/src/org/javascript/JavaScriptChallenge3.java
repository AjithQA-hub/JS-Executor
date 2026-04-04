package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptChallenge3 {
	
	public static void main(String[] args) {
		
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\JavaScript\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
	   //object for java Script Executor
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   
	   WebElement iFrameTxt = driver.findElement(By.xpath("//h3[contains(text(),'adBlock')]"));
	   js.executeScript("arguments[0].scrollIntoView(true)", iFrameTxt); 
	}
}
