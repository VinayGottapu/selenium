package Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PARALLEL_TESTING {
	@Test(priority=2)
	public static void facebook() 
	{
		WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.close();
	}
	@Test(priority=1)
	public static void demoq() 
	{
		WebDriver driver=new ChromeDriver();
	       driver.get("https://demoqa.com/text-box");
	       driver.close();
	}
	

}
