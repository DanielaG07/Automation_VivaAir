package com.qualitytest;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Alertaone {

private WebDriver driver;


	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vivaair.com/co/es");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		Thread.sleep(4000);
		By alertaunoLocator = By.id("onesignal-slidedown-allow-button");
		driver.findElement(alertaunoLocator).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='icon material-icons newsletter_popup_close']")).click();
		Thread.sleep(3000);
        
		driver.findElement(By.xpath(" (//*[@class='icon material-icons'])[13]")).click();

        driver.findElement(By.id("criteria-passenger-select-input")).click();
    
        
        driver.findElement(By.xpath("(//*[@class='add-button'])[1]")).click();
		
		driver.findElement(By.xpath("(//*[@class='add-button'])[1]")).click();
	

        driver.findElement(By.xpath("(//*[@class='add-button'])[2]")).click();
		
		
        driver.findElement(By.xpath("(//*[@class='add-button'])[3]")).click();
		Thread.sleep(3000);
		
		

        //----------------------------------------------------------------------------------------------------
		driver.findElement(By.xpath("//*[@class='selected-text-input user-select-none']['1']")).clear();
		Thread.sleep(2000);

		driver.findElement(By.id("criteria-airport-select-departure-input")).sendKeys("bogota");
		//driver.findElement(By.xpath("(//*[@class='selected-text-input user-select-none is-invalid'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='modal-content'])[1]")).click();
        driver.findElement(By.id("criteria-airport-select-destination-input")).sendKeys("medellin");
		driver.findElement(By.xpath("(//*[@class='modal-content'])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@date='2020-12-26']")).click();
		driver.findElement(By.xpath("//*[@date='2021-01-13']")).click();

		//driver.findElement(By.xpath("//*[text() = '28'])[2]")).click();

		//driver.findElement(By.xpath("(//*[@class='selected-text-input user-select-none is-invalid'])[2]")).click();
		//driver.findElement(By.id("criteria-airport-select-destination-station-MDE")).click();

	
        //driver.findElement(By.id("criteria-dates-from")).click();
        //driver.findElement(By.className("asd__day-button")).click();
        
       driver.findElement(By.id("criteria-search-button-desktop")).click();
       Thread.sleep(2000);

       driver.findElement(By.xpath("(//*[@class='segment-lowest-price'])[1] ")).click();
		Thread.sleep(2000);


	}	

}