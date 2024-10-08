package Web_basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobject.Assesmentresult;
import pageobject.Evalution;
import pageobject.Logindigiasses;
import pageobject.batchperformance;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AfterEvalution {

	
	
	public static void main (String[] args) throws InterruptedException{
		
		
		WebDriver driver = new ChromeDriver();
		String url = "https://digiassess-nonprod.gcp.digivalitsolutions.com/staging-daweb/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		
		
		Logindigiasses.Login(driver).sendKeys("digiproductsadmin@digivalsolutions.com");
		Logindigiasses.password(driver).sendKeys("digiassess@#801");
		Logindigiasses.submit(driver).click();
		Logindigiasses.done(driver).click();
		Thread.sleep(5000);
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"mat-focus-indicator mat-icon-button mat-button-base\"]"))).click();
		Logindigiasses.reportsandanalytics(driver).click();
		Assesmentresult.assesmentresults(driver).click();
		Assesmentresult.pending(driver).click();
		Assesmentresult.dropdowntypes(driver).click();
		Assesmentresult.searchtypes(driver).sendKeys("ST123");
		Assesmentresult.selecttypes(driver).click();
		Evalution.finalized(driver).click();
		Assesmentresult.programsideicon(driver).click();
		Assesmentresult.yearsideicon(driver).click();
		batchperformance.finalready(driver).click();
		batchperformance.viewfinal(driver).click();
		batchperformance.overallitemtype(driver).click();
		batchperformance.itemtype(driver).click();
		Thread.sleep(10000);
		batchperformance.finalbackbutton(driver).click();
		Assesmentresult.programsideicon(driver).click();
		Assesmentresult.yearsideicon(driver).click();
		batchperformance.finalready(driver).click();
		batchperformance.publish(driver).click();
		batchperformance.publishandshare(driver).click();
	}
	
	
}
