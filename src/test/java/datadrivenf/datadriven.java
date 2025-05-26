package datadrivenf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriven {

	static WebDriver driver;
	static List<String> usernamelist=new ArrayList<String>();
	static List<String> pwdlist=new ArrayList<String>();
	
	public static void readexcel() throws IOException 
   {
		//excel
		FileInputStream file=new FileInputStream("C:\\Users\\gotta\\eclipse-workspace\\my_maven_project\\src\\test\\resources\\Copy of TestDataCore(1).xlsx");
		//workbook--workbook is presnt in the file object
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//to get the sheet from the work book
		XSSFSheet sheet=workbook.getSheet("Sheet1");//providing sheet name
		//XSSFSheet sheet=workbook.getSheetAt(0);//providing index for the sheets present
		
		//no.of rows
		int rowcnt=sheet.getLastRowNum();
		System.out.println(rowcnt);
		
		//to focus on row inorder to get the column numbers
		int colcnt=sheet.getRow(0).getLastCellNum();
		System.out.println(colcnt);
		
		//to read the values from excel sheet
		for (int i=0;i<=rowcnt;i++){
			XSSFRow currentrow=sheet.getRow(i);
			//to read the cell values from the current row the below for loop is given
			for(int j=0;j<colcnt;j++){
				if(j%2==0) {
					String username=currentrow.getCell(j).toString();
					//String cellvalue=currentrow.getCell(j).
					System.out.println("   "+username);
					usernamelist.add(username);
				}
					else {
						String password=currentrow.getCell(j).toString();
						//String cellvalue=currentrow.getCell(j).
						System.out.println("   "+password);
						
						pwdlist.add(password);
					}
				
			
			
			}
			System.out.println();
			System.out.println("username:"+usernamelist);
			System.out.println("password:"+pwdlist);
		}
		
		
		workbook.close();
		
   }
	
	
	public static void login(String uname,String pwd1){
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
			
			WebElement username1=driver.findElement(By.name("username"));
			username1.sendKeys(uname);
			
			WebElement pwd=driver.findElement(By.name("password"));
			pwd.sendKeys(pwd1);
			
			WebElement login=driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			login.click();
			
		
		
		
	}
	
	public static void executeTest() {
		for(int i=0; i<usernamelist.size();i++) {
			login(usernamelist.get(i),pwdlist.get(i));
			
		}
	}
	public static void main(String[] args) throws IOException{
	
	readexcel();
	 executeTest();
	
		
	}

}
