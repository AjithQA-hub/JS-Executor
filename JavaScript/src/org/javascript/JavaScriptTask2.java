package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTask2 {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\JavaScript\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://toolsqa.com");
		
		driver.manage().window().maximize();
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		   
		   WebElement a = driver.findElement(By.xpath("//div[contains(text(),'rights')]"));
		   js.executeScript("arguments[0].scrollIntoView(true)", a);
		   
		   Thread.sleep(3000);
		   
		   WebElement a1= driver.findElement(By.xpath("//div[contains(text(),'Online')]"));
		   js.executeScript("arguments[0].scrollIntoView(true)", a1);
		
	}

}
