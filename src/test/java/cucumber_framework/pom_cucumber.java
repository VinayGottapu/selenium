package cucumber_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_cucumber {
	public pom_cucumber(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "username")
	   public WebElement username;
	   @FindBy(name = "password")
	   public WebElement password;
	   
	 


}
