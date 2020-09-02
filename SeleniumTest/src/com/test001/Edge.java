package com.test001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	public static void main(String [] args) {
		System.setProperty("webdriver.edge.driver","src/com/test001/msedgedriver.exe" );
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.baidu.com");
		
	}

}
