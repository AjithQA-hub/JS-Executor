package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptChallenge2 {
	
    public static void main(String[] args) {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\JavaScript\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		//object for java Script Executor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//email web elements
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','ajithkumarvam1@gmail.com')", email);
		
		//get attribute for email
		Object txt = js.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println(txt);
		
		//password web elements
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','Ajith!123')", pswd);
		
		//get attribute for password
		Object txt2 = js.executeScript("return arguments[0].getAttribute('value')", pswd);
		System.out.println(txt2);
		
		//Login button web elements
		WebElement loginBtn = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", loginBtn);
		
}
}
