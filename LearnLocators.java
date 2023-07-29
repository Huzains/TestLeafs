package week1.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		//to loacte the username webelement in applln
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("hari.radhakrishnan@qeagle.com");		
		//sendKeys -->to type in the textbox
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		//className -->class attribute
		driver.findElement(By.id("Login")).click();
		
		//driver.findElement(By.linkText("CRM/SFA")).click();
		
	}

}