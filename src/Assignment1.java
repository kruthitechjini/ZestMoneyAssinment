import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone XR (64GB) - Yellow");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		//driver.findElement(By.xpath("//span[.=\"Apple iPhone XR (64GB) - Yellow\"]")).
		WebElement iphone = driver.findElement(By.xpath("//span[.=\"Apple iPhone XR (64GB) - Yellow\"]/../../../../../../..//div/a//span[@class=\"a-price-whole\"]"));
		String price = iphone.getText();	
		System.out.println("I phone price in Amazon is " +price);
		String priceAmazon=price.replaceAll(",", "");
		System.out.println(priceAmazon);
		int amazonPrice=Integer.parseInt(priceAmazon);
		
		//script to print flipkart price
		driver.navigate().to("https://www.flipkart.com/.");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		WebElement xPath = driver.findElement(By.xpath("//input[contains(@title,\"Search for products\")]"));
		xPath.sendKeys("iPhone XR (64GB) - Yellow",Keys.ENTER);
		String text = driver.findElement(By.xpath("//div[@class=\"_1vC4OE _2rQ-NK\"]")).getText();
		System.out.println(text);
		String text1 = text.substring(1);
		String text2 = text1.replace(",", "");
		System.out.println(text2);
		int flipKartPrice = Integer.parseInt(text2);
		
		//Print least pice
		if(amazonPrice<flipKartPrice)
			System.out.println("Least Iphone price is in amazon and the price is "  +amazonPrice);
		else
			System.out.println("Lest Iphone price is in flipkart and the price is " +flipKartPrice);

	}

}
