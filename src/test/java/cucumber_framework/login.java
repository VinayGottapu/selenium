package cucumber_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class login {
	static WebDriver driver;
	static pom_cucumber pom_cucumber;
	

@Given("open the browser")
public void open_the_browser() {

	
	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
		pom_cucumber=new pom_cucumber(driver);
		
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
}

@Then("enter the Username {string}")
public void enter_the_username(String uname) {
	
	pom_cucumber.username.sendKeys(uname);
    
}

@Then("enter the password {string}")
public void enter_the_password(String pwd) {
	
	pom_cucumber.password.sendKeys(pwd);
   
}

@And("click on login button")
public void click_on_login_button() {
	
	pom_cucumber.loginBtn.click();
	Assert.assertTrue(pom_cucumber.Dashboard.isDisplayed(),"login success");
   
}






}
