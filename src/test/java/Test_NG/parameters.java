package Test_NG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
static WebDriver driver;
	
	@Test
	@Parameters("username")
	 public void orangehrm(String uname) {
			System.out.println(uname);

}
}
