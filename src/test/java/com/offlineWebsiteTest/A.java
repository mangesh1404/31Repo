package com.offlineWebsiteTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class A {

	WebDriver driver;
	
	@Test
	public void test01() {
		driver.getTitle();
	}
	
}
