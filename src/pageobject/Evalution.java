package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Evalution {
	
	public static WebElement  inevalution(WebDriver driver) {
    	
		return driver.findElement(By.xpath("//div[text()=' In Evaluation 21 ']"));
		
	}
    public static WebElement  page3(WebDriver driver) {
    	
		return driver.findElement(By.xpath("(//div[@class=\"page perpage ng-star-inserted\"])[7]"));
		
	}
	
	
   public static WebElement  Viewevalute1(WebDriver driver) {
    	
		return driver.findElement(By.xpath("(//div/mat-icon[@data-mat-icon-type=\"font\"])[5]"));
		
	}


   
    public static WebElement  backbutton(WebDriver driver) {
   	
		return driver.findElement(By.xpath("(//div/mat-icon[@data-mat-icon-type=\"font\"])[2]"));
		
	}
   
    
   
   public static WebElement   CompletedEvaluation(WebDriver driver) {
	   	
		return driver.findElement(By.xpath("//button[text()=' Completed Evaluation ']"));
		
	}
   
   public static WebElement   finalized(WebDriver driver) {
	   	
		return driver.findElement(By.xpath("//span[@id=\"finalized\"]"));
		
	}



   
   


}
