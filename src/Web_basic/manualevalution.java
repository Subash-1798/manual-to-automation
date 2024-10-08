package Web_basic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.Evalution;
import pageobject.Logindigiasses;


public class manualevalution {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String baseURL = "https://digiassess-nonprod.gcp.digivalitsolutions.com/staging-daweb/";
		driver.get(baseURL);
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
		Logindigiasses.Manualevaluationcoursesdashboard(driver).click();
		Evalution.inevalution(driver).click();
		Thread.sleep(5000);
		Evalution.page3(driver).click();
		Thread.sleep(5000);
		WebElement view = driver.findElement(By.xpath("(//div[text()=' View '])[5]"));
		action.moveToElement(view).perform();
		view.click();
		Evalution.Viewevalute1(driver).click();
		Thread.sleep(5000);


		WebElement inputElement1 = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Mark\"])[1]"));
		inputElement1.click();
		inputElement1.sendKeys(Keys.CONTROL + "a"); 
		inputElement1.sendKeys(Keys.DELETE);
		inputElement1.sendKeys("2.5");
		Thread.sleep(3000);

		WebElement inputElement2 = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Mark\"])[2]"));
		inputElement2.click();
		inputElement2.sendKeys(Keys.CONTROL + "a"); 
		inputElement2.sendKeys(Keys.DELETE);
		inputElement2.sendKeys("3.3");
		Thread.sleep(3000);
	
		WebElement inputElement3 = driver.findElement(By.xpath("(//input[@placeholder=\"Enter Mark\"])[3]"));
		inputElement3.click();
		inputElement3.sendKeys(Keys.CONTROL + "a"); 
		inputElement3.sendKeys(Keys.DELETE);
		inputElement3.sendKeys("1.7");
		Thread.sleep(3000);	
	
		driver.navigate().refresh();
		Evalution.backbutton(driver).click();
		Thread.sleep(5000);
		Evalution.CompletedEvaluation(driver).click();

	    driver.navigate().refresh();
		
		
		

	}

}