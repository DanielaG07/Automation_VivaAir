package com.qualitytest;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectTest_Automated {

	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com.co/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void testGooglePage() throws InterruptedException {
	
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("https://www.vivaair.com/co/es");
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("AUTOMATIZACION VIVA AIR", driver.getTitle());
		Thread.sleep(2000);
		
	
	
	}

}



