package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToHandleFrameUsingIndex {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://leafground.com/frame.xhtml");
		
		//index for frames -> starts with 0 (4 frames -> 0,1,2,3)
		
		//Switch to frame using index
		driver.switchTo().frame(0);
				
		//interact with WebElement inside the frame
		driver.findElement(By.id("Click")).click();
		
	}

}
