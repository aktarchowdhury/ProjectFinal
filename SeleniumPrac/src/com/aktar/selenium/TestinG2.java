package com.aktar.selenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestinG2 extends MainClass {
	@Test
	public void TestContinue() {
		driver.findElement(By.id("nav_coffee")).click();
		driver.findElement(By.id("nav_menu")).click();
		driver.findElement(By.id("nav_coffeehouse")).click();
		driver.findElement(By.id("nav_responsibility")).click();
		driver.findElement(By.id("nav_card")).click();
		driver.findElement(By.id("nav_shop")).click();
	}
}