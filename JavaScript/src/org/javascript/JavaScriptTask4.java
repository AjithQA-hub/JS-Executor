package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTask4 {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\JavaScript\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','ajithkumarvam1@gmail.com')", email);
		
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','Ajith!123')", pswd);
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", loginBtn);
	}

}
