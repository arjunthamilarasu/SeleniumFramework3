package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class OpenGoogle {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\Desktop\\Selenium Jars and Drivers\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://s1.novade.net");
		
		driver.findElement(By.xpath("/html/body/div[4]/form/div/input")).sendKeys("arjun@novade.net");
		
		driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/button")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/form/div/input[2]")).sendKeys("arjun2023");

		driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/button")).click();
		
				
		}

}
