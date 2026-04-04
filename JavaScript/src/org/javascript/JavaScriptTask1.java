package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTask1 {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\JavaScript\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
		
	   JavascriptExecutor a=(JavascriptExecutor)driver;
	   
	   WebElement Inmakes= driver.findElement(By.xpath("//p[contains(text(),'various kinds')]"));
	   a.executeScript("arguments[0].scrollIntoView(true)", Inmakes);
	   
	   a.executeScript("arguments[0].setAttribute('value','Inmakes offers various kinds')",Inmakes);
	   Object text = a.executeScript("return arguments[0].getAttribute('value')", Inmakes);
	   System.out.println(text);
	}
}
