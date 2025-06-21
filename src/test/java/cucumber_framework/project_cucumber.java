package cucumber_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class project_cucumber {
	static WebDriver driver;
	static project_pom project_pom;

		@Given("open browser")
		public void open_browser() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
			 project_pom= new  project_pom(driver);	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
		}
		   
		@Then("enter valid username")
		public void enter_valid_username() {
			project_pom.username.sendKeys("Admin");
		}
		    
		

		@Then("enter valid password")
		public void enter_valid_password() {
			project_pom.password.sendKeys("admin123");
		    
		}

		@And("click login button")
		public void click_login_button() {
			project_pom.loginBtn.click();
			Assert.assertTrue(project_pom.Adminpage.isDisplayed(),"login success");
		}

		@Given("open admin page section")
		public void open_admin_page_section() {
			project_pom.Adminpage.click();
			
			
		   
		}

		@Then("enter username")
		public void enter_username() {
			project_pom.Username.sendKeys("vinay");
		  
		}

		@Then("choose user role")
		public void choose_user_role() {
			project_pom.UserRole.click();
		   
		}

		@Then("choose Admin from dropdown")
		public void choose_admin_from_dropdown() {
			project_pom.Admin.click();
		   
		}

		@Then("enter Employee Name")
		public void enter_employee_name() {
			project_pom.Employeesname.sendKeys("ram dube");
		    
		}

		@Then("click status")
		public void click_status() {
			project_pom.status.click();
		   
		}
		@Then("choose Disabled from dropdown")
		public void choose_disabled_from_dropdown() {
			project_pom.disabled.click();
		   
		}

		@And("click on search button")
		public void click_on_search_button() {
			project_pom.search.click();
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
			Assert.assertTrue(project_pom.Add.isDisplayed(),"login success");
		  
		}
		@Given("click on add user button")
		public void click_on_add_user_button() {
			project_pom.Add.click();
		   
		}

		@Then("click on user role dropdown button")
		public void click_on_user_role_dropdown_button() {
			project_pom.userroledropdown.click();
		    
		}

		@Then("select ESS")
		public void select_ess() {
			project_pom.ECC.click();
		    
		}

		@Then("enter employee1 name")
		public void enter_employee1_name() {
			project_pom.employee1name.sendKeys("allu arjun");
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
		   
		}

		@Then("click on statusdropdown button")
		public void click_on_statusdropdown_button() {
			project_pom.statusdropdown.click();
		   
		}

		@Then("select enabled option")
		public void select_enabled_option() {
			project_pom.enabled1.click();
		    
		}

		@Then("enter username1")
		public void enter_username1() {
			project_pom.username1.sendKeys("Manoj kumar");
		    
		}

		@Then("enter password")
		public void enter_password() {
			project_pom.password2.sendKeys("kumar@123");
		   
		}

		@Then("reenter the password to conform")
		public void reenter_the_password_to_conform() {
			project_pom.conformpassword.sendKeys("kumar@123");
		   
		}

		@Then("click on save")
		public void click_on_save() {
			project_pom.save.click();
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
			
		    
		}


		@Given("Admin\\/User Management page")
		public void admin_user_management_page() {
			project_pom.usermanagement.click();
		   
		}

		@Then("go to Admin Admin profile")
		public void go_to_admin_admin_profile() {
			project_pom.profile.click();
		}

		@Then("click on the drop down option")
		public void click_on_the_drop_down_option() {
			project_pom.profile.click();
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
			
		}
		

		@And("select Logout")
		public void select_logout() {
			project_pom.logout.click();
			
		}

		@Then("close the browser")
		public void close_the_browser() {
		   driver.quit();
		}




	}


