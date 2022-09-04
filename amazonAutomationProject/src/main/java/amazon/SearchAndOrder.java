package amazon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchAndOrder extends Login{
	@Test
	public void order() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nivia football");
		driver.findElement(By.id("nav-search-submit-button")).click();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		WebElement element = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		element.click();
		Thread.sleep(3000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		WebElement buy=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		buy.click();
		Thread.sleep(3000);
		driver.findElement(By.id("nav-cart")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mirzab");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("6385806677");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("629175");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("19/30 A");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Thuckalay");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("near Thuckalay market");
	   // driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("PADMANABHAPURAM");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@type='radio'])[5]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
}
