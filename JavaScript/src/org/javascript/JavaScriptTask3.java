package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTask3 {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\JavaScript\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		   
		   WebElement a1= driver.findElement(By.xpath("//h2[contains(text(),'Programs')]"));
		   js.executeScript("arguments[0].scrollIntoView(true)", a1);
	}
}
