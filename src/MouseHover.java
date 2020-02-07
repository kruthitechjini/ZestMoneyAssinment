import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// mouse hover on ratin bubbles
public class MouseHover {
	
		static
		{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Actions actions=new Actions(driver);
		driver.navigate().to("https://www.tripadvisor.in/UserReviewEdit-g641714-d1156207-Club_Mahindra_Madikeri_Coorg-Madikeri_Kodagu_Coorg_Karnataka.html");
		//WebElement hover = driver.findElement(By.xpath("//span[contains(@id,\"bubble_rating\")]"));
		//actions.moveToElement(hover).perform();
		int i;
		int x=214, y=450;
		 Robot robot = new Robot();
		 for(i=0;i<5;i++)
		 {
		 Thread.sleep(500);
		       robot.mouseMove(x, y);
		       x=x+30;
		       
		     
		 }
		 WebElement Rating = driver.findElement(By.xpath("//em[.=\"Excellent\"]"));
		       if(Rating.getText().contains("Excellent"))
		       {
		        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		        System.out.println("Exellent review clicked");
		       }
		       
		       //enter Title of the review
		       driver.findElement(By.id("ReviewTitle")).sendKeys("Review Title");
		       driver.findElement(By.id("ReviewText")).sendKeys("Excellent Experience Excellent Experience Excellent ExperienceExcellent ExperienceExcellent ExperienceExcellent ExperienceExcellent Experience  Excellent Experience Excellent Experience Excellent ExperienceExcellent ExperienceExcellent ExperienceExcellent ExperienceExcellent Experience Excellent Experience Excellent Experience Excellent ExperienceExcellent ExperienceExcellent ExperienceExcellent ExperienceExcellent Experience");
		       JavascriptExecutor j=(JavascriptExecutor)driver;
		       
		     //First Hotel Rating review Code
		       WebElement HotelRatingscroll = driver.findElement(By.xpath("(//div[.=\"Hotel Ratings\"]/following-sibling::div//span[contains(@id,\"qid\")])[1]"));
		       j.executeScript("arguments[0].scrollIntoView(true);", HotelRatingscroll );
		       
		    int k;
		int a=428, b=130;
		 Robot robo = new Robot();
		 for(k=0;k<5;k++)
		 {
		 Thread.sleep(500);
		       robo.mouseMove(a, b);
		       a=a+28;
		       
		      }
		 
		 WebElement HotelRating1 = driver.findElement(By.xpath("//div[.=\"Excellent\"]"));
		 if(HotelRating1.getText().contains("Excellent"))
		       {
		        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		        System.out.println("Exellent Hotel review rating 1 clicked");
		       }
		 

		 Thread.sleep(2000);
		 //Third Hotel Rating review Code
		 WebElement HotelRatingscroll3 = driver.findElement(By.xpath("(//div[.=\"Hotel Ratings\"]/following-sibling::div//span[contains(@id,\"qid\")])[3]"));
		 j.executeScript("arguments[0].scrollIntoView(true);", HotelRatingscroll3 );
		       
		 
		        
		 int k2;
		 int a2=428, b2=130;
		 Robot robo2 = new Robot();
		 for(k2=0;k2<5;k2++)
		 {
		 Thread.sleep(500);
		       robo2.mouseMove(a2, b2);
		       a2=a2+28;
		       
		      }
		 
		 WebElement HotelRating3 = driver.findElement(By.xpath("//div[.=\"Excellent\"]"));
		 if(HotelRating3.getText().contains("Excellent"))
		       {
		        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		        System.out.println("Exellent Hotel review rating 3 clicked");
		       }
		 
		             
		 //second Hotel Rating review Code
		 WebElement HotelRatingscroll2 = driver.findElement(By.xpath("(//div[.=\"Hotel Ratings\"]/following-sibling::div//span[contains(@id,\"qid\")])[2]"));
		 j.executeScript("arguments[0].scrollIntoView(true);", HotelRatingscroll2 );
		       
		 
		        
		 int k1;
		 int a1=428, b1=130;
		 Robot robo1 = new Robot();
		 for(k1=0;k1<5;k1++)
		 {
		 Thread.sleep(500);
		 robo1.mouseMove(a1, b1);
		  a1=a1+28;
		       
		      }
		 
		 WebElement HotelRating2 = driver.findElement(By.xpath("//div[.=\"Excellent\"]"));
		 if(HotelRating2.getText().contains("Excellent"))
		       {
		        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		        System.out.println("Exellent Hotel review rating 2 clicked");
		       }
		 
		 driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
		 System.out.println("Checkbox selected");
		}
		}



