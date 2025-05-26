package keyworddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keywords_class {
	static WebDriver driver;
	//openbrowser()
	public static void openbrowser()
	
	{driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20)); 
		
		
		
	}
	
	//gotourl()
	public static void gotourl()
	{
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}	
	//enterusername()
	public static void enterusername() {
		
		WebElement username1=driver.findElement(By.name("username"));
		username1.sendKeys("Admin");
	}
	
	//enterpassword()
	
	public static void enterpassword() {
		
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("admin123");
	}
	
	//clicklogin()
	public static void clicklogin() {
		
		WebElement login=driver.findElement(By.xpath("//*[id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
		System.out.println("run complete");
		
	}

}
