import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assinment2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tripadvisor.in/");
		//driver.findElement(By.xpath("//div[@title=\"Search\"]")).click();
		Actions action=new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("Club Mahindra",Keys.ENTER);
		driver.findElement(By.xpath("(//span[contains(.,\"Club Mahindra\")])[3]")).click();
		//click on write review
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
		}
		
		driver.findElement(By.xpath("//a[@class=\"ui_button primary\"]")).click();
		// to click on ratings navigating to other tab
		Set<String> allWh1 = driver.getWindowHandles();
		for(String wh1:allWh1)
		{
			driver.switchTo().window(wh1);
		}
		
		  WebElement hover = driver.findElement(By.xpath("//span[contains(@class,\"ui_bubble_rating fl bubble_10\")]"));
		  action.moveToElement(hover).perform();
		
	}

}
