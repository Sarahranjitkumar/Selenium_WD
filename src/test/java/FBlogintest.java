import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


		WebElement Mail = driver.findElement(By.name("email"));
		Mail.sendKeys("abc@abc.com");

		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("abc@abc");

		WebElement Loginbtn = driver.findElement(By.name("login"));
		Loginbtn.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.close();

		
	}

}
