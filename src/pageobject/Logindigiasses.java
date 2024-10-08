package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logindigiasses {
	
	
	public static WebElement Login(WebDriver driver) {
		
		return driver.findElement(By.xpath("//input[@data-placeholder=\"Email\"]"));
		
	}
	
    public static WebElement password(WebDriver driver) {
		
		return driver.findElement(By.xpath("//input[@type=\"password\"]"));
		
	}
    
    public static WebElement submit(WebDriver driver) {
		
  		return driver.findElement(By.xpath("//button[@id=\"sign-in\"]"));
  		
  	}
    
    
  public static WebElement done(WebDriver driver) {
		
  		return driver.findElement(By.xpath("//button[@class='submit']"));
  		
  	}

 
    
    

    public static WebElement  reportsandanalytics(WebDriver driver) {
    	
    		return driver.findElement(By.xpath("//a[text()=' Reports & analytics  ']"));
    		
    	}
     
       public static WebElement   Manualevaluationcoursesdashboard(WebDriver driver) {
    		
    		return driver.findElement(By.xpath("//a[text()=' Manual evaluation courses dashboard  ']"));
    		
    	}
    
    
    

}
