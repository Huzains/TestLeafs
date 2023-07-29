package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         ChromeDriver driver = new ChromeDriver();
         driver.get("http://facebook.com");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         driver.close();
	}

}
