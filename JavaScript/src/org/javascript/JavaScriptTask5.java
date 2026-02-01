package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTask5 {
	
	public static void main(String[] args) {
		

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\JavaScript\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
        JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement username= driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','Ajith')", username);
		
		WebElement pswd = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','Ajith!123')", pswd);
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", loginBtn);
	}

}
