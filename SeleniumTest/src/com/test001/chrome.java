package com.test001;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class chrome {
		public static void main(String [] args ) {
			System.setProperty("webdriver.chrome.driver", "src/com/test001/chromedriver.exe");
			WebDriver driver = new  ChromeDriver();
			driver.get("http://www.baidu.com");
			
		}
	}

