package com.aktar.selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
	WebDriver driver = new FirefoxDriver();

	@Before
	public void OpenBrowse() {
		driver.get("http://www.starbucks.com/");
	}

	@After
	public void TestComplete() {
		driver.close();
	}
}
