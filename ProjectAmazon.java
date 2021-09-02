package week4.Day1.Assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		WebElement SearchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchBar.sendKeys("oneplus 9 pro", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("OnePlus 9 Pro 5G ")).click();
		Set<String> NewTab = driver.getWindowHandles();
		WebElement mouseHover = driver.findElement(By.xpath("(//span[text()='4.2 out of 5 stars'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(mouseHover).perform();

	}
}