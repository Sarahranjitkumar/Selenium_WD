package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardkeysExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// TODO Auto-generated method stub
		
		WebElement google = driver.findElement(By.id("APjFqb"));
		google.sendKeys("type something");
		google.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Thread.sleep(5);
		google.sendKeys("type something else");

		google.sendKeys(Keys.ENTER);
		
		

	}

}
