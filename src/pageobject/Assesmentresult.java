package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assesmentresult {
	
	
public static WebElement   assesmentresults(WebDriver driver) {
	   	
		return driver.findElement(By.xpath("//a[text()=' Assessment results  ']"));
		
	}



public static WebElement  pending (WebDriver driver) {
   	
	return driver.findElement(By.xpath("(//div[text()='Pending'])[1]"));
	
}

public static WebElement  dropdowntypes(WebDriver driver) {
   	
	return driver.findElement(By.xpath("//div[@class=\"mat-select-arrow-wrapper ng-tns-c173-15\"]"));
	
	
}

public static WebElement  searchtypes(WebDriver driver) {
   	
	return driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
	
	
}

public static WebElement  selecttypes(WebDriver driver) {
   	
	return driver.findElement(By.xpath("//div/span[text()=' ST123 ']"));
	
	
}

public static WebElement  itemrevision(WebDriver driver) {
   	
	return driver.findElement(By.xpath("(//div[@class=\"digi-text-number-container\"])[4]"));
	
	
}

public static WebElement  programsideicon(WebDriver driver) {
   	
	return driver.findElement(By.xpath("//div/mat-icon[@class=\"mat-icon notranslate digi-mr-10 digi-blue digi-cursor digi-icon-size mat-icon-rtl-mirror material-icons mat-icon-no-color\"]"));
	
	
}
public static WebElement  yearsideicon(WebDriver driver) {
   	
	return driver.findElement(By.xpath("(//mat-icon[@class=\"mat-icon notranslate digi-mr-10 digi-blue digi-cursor digi-icon-size mat-icon-rtl-mirror material-icons mat-icon-no-color\"])[2]"));
	
	
}

public static WebElement   InRevision(WebDriver driver) {
   	
	return driver.findElement(By.xpath("//div[text()=' In Revision ']"));
	
	
}


}
