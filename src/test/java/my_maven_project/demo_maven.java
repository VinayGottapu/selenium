package my_maven_project;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_maven {
	static WebDriver driver;
	static Logger logger=LogManager.getLogger(demo_maven.class);
	public static void open_the_browser() {
		
		driver=new ChromeDriver();
	   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.facebook.com/?_rdr");
	  logger.info("website opened");
	}


	public static void main(String[] args) {
		open_the_browser();
		
		
		
	}

}
