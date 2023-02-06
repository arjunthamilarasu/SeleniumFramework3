package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class OpenGoogle {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://s1.novade.net");
		
		driver.findElement(By.xpath("/html/body/div[4]/form/div/input")).sendKeys("arjun@novade.net");
		
		driver.findElement(By.className("right")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/form/div/input[2]")).sendKeys("arjun2023");

		driver.findElement(By.className("right")).click();
		
		
		if ( driver.getPageSource().contains("Accounts.start")){
	         System.out.println("User logged in successfully");
	      } else {
	         System.out.println("Login failed or Error loading Welcome page");
							
		}

	}

}
