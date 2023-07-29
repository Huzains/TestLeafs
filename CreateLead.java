package week1.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("http://leaftaps.com/opentaps/control/login");
		driver1.manage().window().maximize();
		
		//to loacte the username webelement in applln
		
		WebElement username = driver1.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		
		//sendKeys -->to type in the textbox
		
		driver1.findElement(By.id("password")).sendKeys("crmsfa");
		
		//className -->class attribute
		driver1.findElement(By.className("decorativeSubmit")).click();
		driver1.findElement(By.linkText("CRM/SFA")).click();
		driver1.findElement(By.linkText("Leads")).click();
		driver1.findElement(By.linkText("Create Lead")).click();
		driver1.findElement(By.id("createLeadForm_companyName")).sendKeys("wss");
		driver1.findElement(By.id("createLeadForm_firstName")).sendKeys("Jhon");
		driver1.findElement(By.id("createLeadForm_lastName")).sendKeys("Doe");
		driver1.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("joe");
		driver1.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver1.findElement(By.id("createLeadForm_description")).sendKeys("New check");
		driver1.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("huzaink@gmail.com");
		driver1.findElement(By.className("smallSubmit")).click();
				

	}

}
