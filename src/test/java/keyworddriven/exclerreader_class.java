package keyworddriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exclerreader_class {
	static List<String> Keywords=new ArrayList<String>();
	
public static void readexcelfilemethod() throws IOException {
FileInputStream file=new FileInputStream("C:\\Users\\gotta\\eclipse-workspace\\my_maven_project\\src\\test\\resources\\Copy of TestDataCore(1).xlsx");

XSSFWorkbook workbook=new XSSFWorkbook(file);
XSSFSheet sheet=workbook.getSheet("Sheet");
//no.of rows
		int rowcnt=sheet.getLastRowNum();
		System.out.println(rowcnt);
		
		//to focus on row inorder to get the column numbers
		int colcnt=sheet.getRow(0).getLastCellNum();
		System.out.println(colcnt);
		
		//to read the values from excel sheet
		for (int i=1;i<=rowcnt;i++){
			XSSFRow currentrow=sheet.getRow(i);
			//to read the cell values from the current row the below for loop is given
			for(int j=0;j<colcnt;j++){
				
				if(j==2) {
					String keyword=currentrow.getCell(j).toString();
					//String cellvalue=currentrow.getCell(j).
					System.out.println("   "+keyword);
					Keywords.add(keyword);
				}
				System.out.println("keywords:"+Keywords);
				}
			workbook.close();
			}
}
	
public static void keywordcomparision()  {
	for(int i=0;i<Keywords.size();i++) {
		if(Keywords.get(i).equals("openbrowser")) {
			keywords_class.openbrowser();
		}
		if(Keywords.get(i).equals("gotourl")) {
			keywords_class.gotourl();
		}
		if(Keywords.get(i).equals("enterusername")) {
			keywords_class.enterusername();
		}
		if(Keywords.get(i).equals("enterpassword")) {
			keywords_class.enterpassword();
		}
		if(Keywords.get(i).equals("clicklogin")) {
			keywords_class.clicklogin();
		}
	}	
	
}
public static void main(String[] args) throws IOException{
	
	exclerreader_class.readexcelfilemethod();
	exclerreader_class.keywordcomparision();

}	

}
