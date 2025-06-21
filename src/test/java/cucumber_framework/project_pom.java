package cucumber_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class project_pom {
	public project_pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "username")
	   public WebElement username;
	   @FindBy(name = "password")
	   public WebElement password;
	   @FindBy(xpath= "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	   public WebElement loginBtn;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
	  public WebElement Adminpage;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
	  public WebElement Username;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
	  public WebElement UserRole;
	  @FindBy(xpath=" //div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
	  public WebElement Admin;
	  @FindBy(xpath="//input[@placeholder='Type for hints...']")
	  public WebElement Employeesname;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")
	  public WebElement status;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")
	  public WebElement disabled;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
	  public WebElement search;
	  @FindBy(xpath="//div[@class='oxd-topbar-header']")
	  public WebElement usermanagement;
	  @FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	  public WebElement user;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/img")
	  public WebElement profile;
	  @FindBy(className="oxd-userdropdown-link")
	  public WebElement logout;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
	  public WebElement Add;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
	  public WebElement userroledropdown;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")
	  public WebElement ECC;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
	  public WebElement employee1name;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")
	  public WebElement  statusdropdown;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
	  public WebElement enabled1;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	  public WebElement username1;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	  public WebElement password2;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	  public WebElement conformpassword;
	  @FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	  public WebElement save;
	  
	  
	  
	  
	  
} 
