package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class batchperformance {
	
	
	
	public static WebElement itemtypefilter(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class=\"mat-select-arrow-wrapper ng-tns-c173-36\"]"));
		
		
	}
	public static WebElement itemtype(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()=' SAQ ']"));
		
		
	}
	
	public static WebElement sideicon(WebDriver driver) {
		return driver.findElement(By.xpath("//mat-icon[@class=\"mat-icon notranslate digi-lightblue digi-right-arrow mat-icon-rtl-mirror material-icons mat-icon-no-color\"]"));
		
		
	}
	
	public static WebElement closeicon1(WebDriver driver) {
		return driver.findElement(By.xpath("(//mat-icon[text()='close'])[2]"));
		
		
	}
	public static WebElement closeicon2(WebDriver driver) {
		return driver.findElement(By.xpath("(//mat-icon[text()='close'])[1]"));
		
		
	}
	
	
	public static WebElement itemwiseresponse(WebDriver driver) {
		return driver.findElement(By.xpath("//div[text()=' Item-wise responses ']"));
		
		
	}
	
	public static WebElement itemrevision(WebDriver driver) {
		return driver.findElement(By.xpath("( //div[@class=\"digi-font-normal digi-fs-12 ng-star-inserted\"])[2]"));
		
		
	}
	
	public static WebElement  GradeDistributionOutcome (WebDriver driver) {
		return driver.findElement(By.xpath(" //div[text() = ' Grade Distribution Outcome ']"));
		
		
	}

	
	public static WebElement Graderevision(WebDriver driver) {
		return driver.findElement(By.xpath("(//div[text() = ' Grade Revision '])[2]"));
		
		
	}
	
	public static WebElement  Finalizedresult(WebDriver driver) {
		return driver.findElement(By.xpath(" //div[text() = ' finalize result ']"));
		
		
	}
	public static WebElement  donerevision(WebDriver driver) {
		return driver.findElement(By.xpath(" //button[text() = ' done revision ']"));
		
		
	}
	public static WebElement  readytopublish(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text() = ' Ready to publish ']"));
		
		
	}
	public static WebElement  finalready(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class=\"digi-active-data\"]"));
		
		
	}
	
	public static WebElement  viewfinal(WebDriver driver) {
		return driver.findElement(By.xpath("(//span[text() = ' View '])[1]"));
		
		
	}
	
	public static WebElement  overallitemtype(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class=\"mat-select-arrow-wrapper ng-tns-c173-34\"]"));
		
		
	}
	
	public static WebElement  finalbackbutton(WebDriver driver) {
		return driver.findElement(By.xpath("//div/mat-icon[@class=\"mat-icon notranslate mat-icon-rtl-mirror digi-cursor digi-ml-5 digi-mr-5 material-icons mat-icon-no-color\"]"));
		
		
	}
	
	public static WebElement  publish(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text() = ' PUBLISH & SHARE ']"));
		
		
	}
	public static WebElement  publishandshare(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class=\"button primary transparent uppercase\"]"));
		
		
	}

}
