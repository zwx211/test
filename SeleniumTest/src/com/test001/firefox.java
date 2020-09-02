package com.test001;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
	public static void main (String [] args ) {
		System.setProperty("webdriver.firefox.bin", "D:\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//打开火狐浏览器
		WebDriver driver =new FirefoxDriver();
		//访问百度
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).click();
		driver.findElement(By.id("kw")).sendKeys("1111");
		//driver.findElement(By.id("kw")).clear();
		driver.findElement(By.id("kw")).sendKeys(Keys.ENTER);
		
	}

}
